package com.example.clothesshopjava.dtos;

import com.example.clothesshopjava.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductDTO extends Product {
    private String category_name;
    private String brand_name;
}
