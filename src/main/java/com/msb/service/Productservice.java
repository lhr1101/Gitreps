package com.msb.service;

import com.msb.pojo.Product;
import org.springframework.stereotype.Service;


public interface Productservice {
    Product getProductById(Integer id);
}
