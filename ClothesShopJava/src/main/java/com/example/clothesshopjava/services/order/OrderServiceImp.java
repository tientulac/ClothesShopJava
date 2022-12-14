package com.example.clothesshopjava.services.order;
import com.example.clothesshopjava.entities.Order;
import com.example.clothesshopjava.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService{
    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }
    @Override
    public Order findById(int id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public boolean deleteOne(int id) {
        Order order = findById(id);
        if (order != null) {
            orderRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
