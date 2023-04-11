package com.yml_demo.yml;

import com.yml_demo.yml.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YmlApplicationTests {

    @Autowired/*自动装配*/
    private User user;

    @Test
    void contextLoads() {
        System.out.println(user);
    }



}
