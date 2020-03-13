package com.jancen.starter.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)//使配置文件生效
@ConditionalOnClass(HelloService.class)//classpath存在指定类时自动装配
@ConditionalOnProperty(prefix = "spring.hello", value = "enabled", matchIfMissing = true)//当配置文件中example.service.enabled=true时进行自动配置，如果没有设置此值就默认使用matchIfMissing对应的值
public class HelloAutoConfiguration {

    @Autowired
    private HelloProperties properties;

    //注入bean实例
    @Bean
    @ConditionalOnMissingBean(HelloService.class)//当Spring Context中有指定的Bean的条件下
    public HelloService helloService(){
        HelloService service = new HelloService();
        service.setProperties(properties);
        return service;
    }
}
