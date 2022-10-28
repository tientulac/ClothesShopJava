package com.example.clothesshopjava.repositories;

import com.example.clothesshopjava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
