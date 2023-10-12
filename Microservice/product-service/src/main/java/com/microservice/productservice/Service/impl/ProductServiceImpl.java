package com.microservice.productservice.Service.impl;

import com.microservice.productservice.Service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private List<String> products =new ArrayList<>();
    public ProductServiceImpl(){
        this.products=new ArrayList<>();
        this.products.add("Monster");
        this.products.add("Hp");
        this.products.add("Dell");
        this.products.add("Acer");
    }

    @Override
    public List<String> getAllProducts() {
        return products;
    }

    @Override
    public String getProductById(int id) {
        return products.get(id);
    }

    @Override
    public String createProduct(String name) {
        products.add(name);
        return "Product added";
    }

}
