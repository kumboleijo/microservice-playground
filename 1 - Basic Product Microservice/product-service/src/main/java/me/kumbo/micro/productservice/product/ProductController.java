package me.kumbo.micro.productservice.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

  @GetMapping(value = "{id}", produces = "application/json")
  public Product get(@PathVariable int id) {
    var product = new Product(id, "name-" + id);
    return product;
  }

}
