package me.kumbo.micro.compositeservice.composite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("products")
@RequiredArgsConstructor
public class CompositeController {

  private final CompositeService compositeService;

  @GetMapping("{productId}")
  public Composite.Product getProduct(@PathVariable int productId) {
    return compositeService.getProduct(productId);
  }

}
