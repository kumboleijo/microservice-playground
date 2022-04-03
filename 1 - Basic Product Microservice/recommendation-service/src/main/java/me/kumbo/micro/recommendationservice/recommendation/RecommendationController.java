package me.kumbo.micro.recommendationservice.recommendation;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("recommendations")
public class RecommendationController {

  /**
   * Sample usage: "curl $HOST:$PORT/recommendation?productId=1".
   *
   * @param productId Id of the product
   * @return the recommendations of the product
   */
  @GetMapping(value = "", produces = "application/json")
  List<Recommendation> getAll(@RequestParam(value = "productId", required = true) int productId) {
    return null;
  }
}
