package com.wangyakun.starter.wangyakunspringbootstarter.config;
import com.wangyakun.starter.wangyakunspringbootstarter.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyConfiguration
 * @Description TODO
 * @Author wangyakun
 * @Date 2020/2/10 17:03
 * @Version 1.0
 **/
@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(MyEntity.class)
public class MyConfiguration {

    @Autowired
    private MyEntity myEntity;

    @Bean
    public MyService myService(){
        MyService myService=new MyService();
        myService.setMyEntity(myEntity);
        return myService;
    }

}
