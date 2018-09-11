package com.newer.springbootmember2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Test
    public void contextLoads() {
        int a = 127;
        int b = 127;

        Integer c = 128;
        Integer d = 128;
        System.out.println(c==d);
    }

}
