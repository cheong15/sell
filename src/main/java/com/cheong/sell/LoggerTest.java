package com.cheong.sell;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class LoggerTest {


//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);


    @Test
    public void test1() {

        String name = "imooc";

        log.debug("name: {},", name);
        log.info("info....");
        log.error("error....");

    }



}
