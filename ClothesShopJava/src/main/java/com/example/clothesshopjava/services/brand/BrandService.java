package com.example.clothesshopjava.services.brand;

import com.example.clothesshopjava.entities.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> findAll();
    Brand updateOne(Brand category);
    Brand insertOne(Brand category);
    Brand findById(int id);
    boolean deleteOne(int id);
}
