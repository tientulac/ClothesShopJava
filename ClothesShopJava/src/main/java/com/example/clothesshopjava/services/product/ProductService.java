package com.example.clothesshopjava.services.product;

import com.example.clothesshopjava.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product updateOne(Product Product);
    Product insertOne(Product Product);
    Product findById(int id);
    boolean deleteOne(int id);
}
