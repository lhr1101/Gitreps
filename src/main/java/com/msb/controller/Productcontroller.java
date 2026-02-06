package com.msb.controller;


import com.msb.pojo.Product;
import com.msb.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Productcontroller {
    @Autowired
    private Productservice productservice;

    @RequestMapping("/selectproduct")
    public Product selectProduct(Integer id){
        return productservice.getProductById(id);
    }
}
