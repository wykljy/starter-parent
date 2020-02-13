package com.wangyakun.starter.wangyakunspringbootstarterautoconfigure.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName WykProperties
 * @Description TODO
 * @Author wangyakun
 * @Date 2020/2/10 13:37
 * @Version 1.0
 **/
@ConfigurationProperties(prefix = "wangyakun.info")
public class WykProperties {
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
