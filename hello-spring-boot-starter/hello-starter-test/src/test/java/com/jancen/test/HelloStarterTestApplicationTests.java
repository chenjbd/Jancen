package com.jancen.test;

import com.jancen.starter.configure.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloStarterTestApplicationTests {

    @Autowired
    private HelloService helloService;

    @Test
    void testHello() {
        System.out.println(helloService.hello());
    }


}
