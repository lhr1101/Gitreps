package com.msb.mapper;

import com.msb.pojo.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ProductmapperTest {
    @Autowired
    private Productmapper productmapper;
    @Test
    void getProduct() {
        Product product = productmapper.getProduct(1);
        System.out.println(product);
    }
}