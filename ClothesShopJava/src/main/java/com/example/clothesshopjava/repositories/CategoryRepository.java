package com.example.clothesshopjava.repositories;

import com.example.clothesshopjava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
