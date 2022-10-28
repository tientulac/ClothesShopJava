package com.example.clothesshopjava.controller;

import com.example.clothesshopjava.entities.Product;
import com.example.clothesshopjava.services.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/Product") // router
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> getList() {
        try {
            List<Product> list = productService.findAll();
            return list;
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public Product save(Product Product) {
        try {
            Product prod = new Product();
            if (Product.getProduct_id() > 0) {
                prod.setUpdate_at(new Date());
                prod = productService.updateOne(Product);
            }
            else {
                prod.setCreated_at(new Date());
                prod = productService.insertOne(Product);
            }
            return prod;
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public boolean delete(@PathVariable int id) {
        try {
            Boolean rs = false;
            if (productService.deleteOne(id)) {
                rs = true;
            }
            return rs;
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
