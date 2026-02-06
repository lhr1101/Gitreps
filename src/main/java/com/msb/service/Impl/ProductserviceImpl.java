package com.msb.service.Impl;

import com.msb.mapper.Productmapper;
import com.msb.pojo.Product;
import com.msb.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductserviceImpl implements Productservice {
    @Autowired
    private Productmapper productmapper;

    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public Product getProductById(Integer id) {
        Product product;
        String key = "product:" + id;
        if (redisTemplate.hasKey(key)) {
            return (Product) redisTemplate.opsForValue().get(key);
        }
        product  = productmapper.getProduct(id);
        redisTemplate.opsForValue().set(key, product);


        return product;
    }
}
