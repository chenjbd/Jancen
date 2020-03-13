package com.jancen.starter.configure;

import java.util.Random;

public class HelloService {

    private HelloProperties properties;

    public void setProperties(HelloProperties properties) {
        this.properties = properties;
    }

    public String hello(){
        Random random = new Random();
        return properties.getName() + "，你的编号是" + random.nextInt(properties.getAge());
    }
}
