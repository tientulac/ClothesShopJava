package com.example.clothesshopjava.services.product;

import com.example.clothesshopjava.entities.ProductDetail;

import java.util.List;

public interface ProductDetailService {
    List<ProductDetail> findAll();
    ProductDetail insertOne(ProductDetail productDetail);
    boolean deleteOne(int id);
}
