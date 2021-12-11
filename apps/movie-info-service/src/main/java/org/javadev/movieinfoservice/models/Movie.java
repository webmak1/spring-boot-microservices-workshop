package org.javadev.movieinfoservice.models;

public class Movie {

  private String movieId;

  public String getMovieId(){
    return movieId;
  }

  public void setMovieId(String movieId) {
    this.movieId = movieId;
  }
  

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private String description;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Movie (String movieId, String name, String description) {
    this.movieId = movieId;
    this.name = name;
    this.description = description;
  }
}
