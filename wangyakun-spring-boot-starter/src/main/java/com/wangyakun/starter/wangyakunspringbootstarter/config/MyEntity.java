package com.wangyakun.starter.wangyakunspringbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName MyEntity
 * @Description TODO
 * @Author wangyakun
 * @Date 2020/2/10 16:56
 * @Version 1.0
 **/
@ConfigurationProperties(prefix = "my.personal")
public class MyEntity {

    private String name;

    private String phone;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
