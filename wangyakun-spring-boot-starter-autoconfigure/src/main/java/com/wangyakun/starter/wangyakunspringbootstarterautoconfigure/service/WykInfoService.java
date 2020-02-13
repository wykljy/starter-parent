package com.wangyakun.starter.wangyakunspringbootstarterautoconfigure.service;

import com.wangyakun.starter.wangyakunspringbootstarterautoconfigure.config.WykProperties;

/**
 * @ClassName WykInfoService
 * @Description TODO
 * @Author wangyakun
 * @Date 2020/2/10 13:40
 * @Version 1.0
 **/
public class WykInfoService {

    private WykProperties wykProperties;

    public WykProperties getWykProperties() {
        return wykProperties;
    }

    public void setWykProperties(WykProperties wykProperties) {
        this.wykProperties = wykProperties;
    }

    public String getWykInfo(){
        return "姓名："+wykProperties.getName()+" 年纪:"+wykProperties.getAge();
    }
}
