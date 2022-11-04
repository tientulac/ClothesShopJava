package com.example.clothesshopjava.repositories;

import com.example.clothesshopjava.entities.ProductColor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductColorRepository extends JpaRepository<ProductColor, Integer> {
}
