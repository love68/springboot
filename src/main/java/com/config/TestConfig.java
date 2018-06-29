package com.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * TestConfig
 *
 * @author jiajunkang
 * @version 1.0.0
 **/
@Configuration
@ConfigurationProperties(prefix = "com.springboot")
@PropertySource("classpath:test.properties")
public class TestConfig {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
