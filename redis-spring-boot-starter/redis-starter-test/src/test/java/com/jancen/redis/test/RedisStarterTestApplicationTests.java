package com.jancen.redis.test;

import com.jancen.redis.autoconfigure.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisStarterTestApplicationTests {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void test(){
        redisUtil.set("name", "jancen");
        System.out.println(redisUtil.get("name"));
    }

}
