package com.microservice.productservice.Service;

import java.util.List;

public interface ProductService {
    List<String> getAllProducts();

    String getProductById(int id);

    String createProduct(String name);
}
