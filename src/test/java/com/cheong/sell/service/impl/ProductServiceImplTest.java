package com.cheong.sell.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {


    @Autowired
    private ProductServiceImpl productService;

    @Test
    void findOne() {
    }

    @Test
    void findUpAll() {
    }

    @Test
    void findAll() {

        PageRequest pageRequest = new PageRequest(0, 2);
        productService.findAll(pageRequest);

    }

    @Test
    void save() {
    }

}