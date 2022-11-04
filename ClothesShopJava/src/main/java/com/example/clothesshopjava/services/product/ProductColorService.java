package com.example.clothesshopjava.services.product;

import com.example.clothesshopjava.entities.ProductColor;

import java.util.List;

public interface ProductColorService {
    List<ProductColor> findAll();
    ProductColor insertOne(ProductColor productColor);
    boolean deleteOne(int id);
}
