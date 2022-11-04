package com.example.clothesshopjava.repositories;

import com.example.clothesshopjava.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
