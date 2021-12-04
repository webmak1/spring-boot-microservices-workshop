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

  public Movie (String movieId, String name) {
    this.movieId = movieId;
    this.name = name;
  }
}
