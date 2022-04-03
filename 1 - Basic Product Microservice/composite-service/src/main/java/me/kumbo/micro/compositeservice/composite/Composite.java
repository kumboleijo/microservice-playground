package me.kumbo.micro.compositeservice.composite;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

public class Composite {

  @Data
  @NoArgsConstructor
  static class Product {
    private int productId;
    private String name;
    private List<Review> reviews;
  }

  @Data
  @NoArgsConstructor
  static public class Review {
    private int reviewId;
    private int productId;
    private String author;
    private String subject;
    private String content;
  }

}
