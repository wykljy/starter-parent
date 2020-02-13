package com.wangyakun.starter.startertest.controller;

import com.wangyakun.starter.wangyakunspringbootstarter.service.MyService;
import com.wangyakun.starter.wangyakunspringbootstarterautoconfigure.service.WykInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName WykController
 * @Description TODO
 * @Author wangyakun
 * @Date 2020/2/10 15:11
 * @Version 1.0
 **/
@Controller
public class WykController {

    @Autowired
    private  WykInfoService wykInfoService;

    @Autowired
    private MyService myService;

    @RequestMapping("/getWykInfo")
    @ResponseBody
    public String getWykInfo(){
        return wykInfoService.getWykInfo();
    }

    @RequestMapping("/getMyInfo")
    @ResponseBody
    public String getMyInfo(){
        return myService.getPersonInfo();
    }
}
