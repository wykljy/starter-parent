package com.wangyakun.starter.wangyakunspringbootstarter.service;

import com.wangyakun.starter.wangyakunspringbootstarter.config.MyEntity;

/**
 * @ClassName MyService
 * @Description TODO
 * @Author wangyakun
 * @Date 2020/2/10 17:00
 * @Version 1.0
 **/
public class MyService {

    private MyEntity myEntity;

    public MyEntity getMyEntity() {
        return myEntity;
    }

    public void setMyEntity(MyEntity myEntity) {
        this.myEntity = myEntity;
    }

    public String  getPersonInfo(){
        return "姓名："+myEntity.getName()+"\r\n 手机号:"+myEntity.getPhone()+"\r\n 年龄:"+myEntity.getAge();
    }
}
