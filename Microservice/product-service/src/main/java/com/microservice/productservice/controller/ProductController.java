package com.microservice.productservice.controller;

import com.microservice.productservice.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<String> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public String getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @PostMapping
    public String createProduct(@RequestBody String name){
        return productService.createProduct(name);
    }
}
