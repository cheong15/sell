package com.cheong.sell.utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class KeyUtil {

    public  static synchronized String genUniqueKey() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Integer number = random.nextInt(900000)+100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }


}
