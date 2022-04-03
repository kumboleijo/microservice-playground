package me.kumbo.micro.productservice.product;

import lombok.Data;

@Data
public class Product {
  private final int productId;
  private final String name;
}
