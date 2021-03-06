package org.javadev.moviecatalogservice.resources;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.javadev.moviecatalogservice.models.CatalogItem;
import org.javadev.moviecatalogservice.models.Movie;
import org.javadev.moviecatalogservice.models.Rating;
import org.javadev.moviecatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private WebClient.Builder webClientBuilder;


  @RequestMapping("/{userId}")
  @HystrixCommand(fallbackMethod = "getFallbackCatalog")
  public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

    UserRating ratings = restTemplate.getForObject("http://ratings-data-service/ratingsdata/user/foo" + userId, UserRating.class);
 
    return ratings.getRatings().stream().map(rating -> { 
        Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
     
       /* Movie movie = webClientBuilder.build()
        .get()
        .uri("http://localhost:8082/movies/" + rating.getMovieId())
        .retrieve()
        .bodyToMono(Movie.class)
        .block();

        */

        return new CatalogItem(movie.getName(), "Desc", rating.getRating());
    }).collect(Collectors.toList());
  }

  public List<CatalogItem> getFallbackCatalog(@PathVariable("userId") String userId) {
    return Arrays.asList(new CatalogItem("No movie", "", 0));
    
  }

}
