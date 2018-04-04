package com.cheong.sell;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//@Slf4j
public class LoggerTest {


    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);


    @Test
    public void test1() {

        String name = "imooc";

        logger.debug("name: {},", name);
        logger.info("info....");
        logger.error("error....");

    }



}
