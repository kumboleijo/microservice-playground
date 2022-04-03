package me.kumbo.micro.recommendationservice.recommendation;

import lombok.Data;

@Data
public class Recommendation {
  private final int productId;
  private final int recommendationId;
  private final String author;
  private final int rate;
  private final String content;
  private final String serviceAddress;
}