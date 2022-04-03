package me.kumbo.micro.reviewservice.review;

import lombok.Data;

@Data
public class Review {
  private final int reviewId;
  private final int productId;
  private final String author;
  private final String subject;
  private final String content;
}
