package me.kumbo.micro.compositeservice.composite;

import java.util.ArrayList;
import java.util.List;
import static org.springframework.http.HttpMethod.GET;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;
import me.kumbo.micro.compositeservice.composite.Composite.Product;
import me.kumbo.micro.compositeservice.composite.Composite.Review;

@Service
@Slf4j
public class CompositeService {

  private final RestTemplate restTemplate = new RestTemplate();

  @Value("${product-service-url}")
  private String productServiceUrl;

  @Value("${review-service-url}")
  private String reviewServiceUrl;

  public Composite.Product getProduct(int productId) {
    Product product = null;
    List<Review> reviews = new ArrayList<>();

    // get product
    try {
      product = restTemplate.getForObject(productServiceUrl + "/" + productId, Product.class);
    } catch (Exception e) {
      log.error(e.getMessage());
    }

    // get reviews
    try {
      reviews = restTemplate.exchange(reviewServiceUrl + "/product/" + productId, GET, null,
          new ParameterizedTypeReference<List<Review>>() {
          })
          .getBody();
    } catch (Exception e) {
      log.error(e.getMessage());
    }

    if (product != null)
      product.setReviews(reviews);
    return product;
  }
}
