package com.example.clothesshopjava.services.product;

import com.example.clothesshopjava.entities.ProductDetail;
import com.example.clothesshopjava.entities.ProductImage;
import com.example.clothesshopjava.repositories.ProductImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImageImp implements  ProductImageService {
    @Autowired
    ProductImageRepository productImageRepository;
    @Override
    public List<ProductImage> findAll() {
        return productImageRepository.findAll();
    }

    @Override
    public ProductImage insertOne(ProductImage productImage) {
        return productImageRepository.save(productImage);
    }

    @Override
    public boolean deleteOne(int id) {
        ProductImage pc = productImageRepository.findById(id).get();
        if (pc != null) {
            productImageRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
