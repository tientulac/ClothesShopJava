package com.example.clothesshopjava.repositories;

import com.example.clothesshopjava.entities.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Integer> {
}
