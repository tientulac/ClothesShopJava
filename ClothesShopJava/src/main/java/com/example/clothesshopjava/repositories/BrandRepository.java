package com.example.clothesshopjava.repositories;

import com.example.clothesshopjava.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
