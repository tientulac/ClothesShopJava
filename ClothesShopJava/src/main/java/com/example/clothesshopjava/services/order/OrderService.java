package com.example.clothesshopjava.services.order;

import com.example.clothesshopjava.entities.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAll();
    boolean deleteOne(int id);
    Order findById(int id);
}
