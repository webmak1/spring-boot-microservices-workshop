package org.javadev.moviecatalogservice.models;

public class CatalogItem {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  private String desc;
  
  public String getDesc() {
    return desc;
  }

  public void setDesc (String desc) {
    this.desc = desc;
  }


  private int rating;

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public CatalogItem(String name, String desc, int rating){
    this.name = name;
    this.desc = desc;
    this.rating = rating;
  }

}
