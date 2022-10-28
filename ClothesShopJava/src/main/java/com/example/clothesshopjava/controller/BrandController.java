package com.example.clothesshopjava.controller;

import com.example.clothesshopjava.entities.Brand;
import com.example.clothesshopjava.services.brand.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/Brand") // router
public class BrandController {
    @Autowired
    BrandService brandService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Brand> getList() {
        try {
            List<Brand> list = brandService.findAll();
            return list;
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public Brand save(Brand Brand) {
        try {
            Brand brand = new Brand();
            if (Brand.getBrand_id() > 0) {
                brand.setUpdate_at(new Date());
                brand = brandService.updateOne(Brand);
            }
            else {
                brand.setCreated_at(new Date());
                brand = brandService.insertOne(Brand);
            }
            return brand;
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
            if (brandService.deleteOne(id)) {
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