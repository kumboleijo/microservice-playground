package me.kumbo.micro.reviewservice.review;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reviews")
public class ReviewController {

  @GetMapping("product/{productId}")
  public List<Review> getReviews(@PathVariable int productId) {

    List<Review> reviews = new ArrayList<>();

    reviews.add(new Review(1, productId, "Reviewer 1", "Wow", "I like!"));
    reviews.add(new Review(2, productId, "Reviewer 2", "Nah", "What's this?!"));

    return reviews;
  }
}
