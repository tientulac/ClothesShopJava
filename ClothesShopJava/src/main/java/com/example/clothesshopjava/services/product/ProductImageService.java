package com.example.clothesshopjava.services.product;

import com.example.clothesshopjava.entities.Product;
import com.example.clothesshopjava.entities.ProductImage;

import java.util.List;

public interface ProductImageService {
    List<ProductImage> findAll();
    ProductImage insertOne(ProductImage productImage);
    boolean deleteOne(int id);
}
