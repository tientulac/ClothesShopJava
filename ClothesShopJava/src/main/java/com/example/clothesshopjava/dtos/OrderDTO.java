package com.example.clothesshopjava.dtos;

import com.example.clothesshopjava.entities.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderDTO extends Order {
    private String user_name;
}
