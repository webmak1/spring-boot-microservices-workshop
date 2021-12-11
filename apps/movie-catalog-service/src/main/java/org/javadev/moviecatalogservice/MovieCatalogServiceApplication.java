package org.javadev.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class MovieCatalogServiceApplication {

  @Bean
  @LoadBalanced
  public RestTemplate gRestTemplate() {
    // HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
    // clientHttpRequestFactory.setConnectTimeout(3000);
    // return new RestTemplate(clientHttpRequestFactory);

    return new RestTemplate();
  }

  @Bean
  public WebClient.Builder getWebClientBuild(){
    return WebClient.builder();
  }

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}
