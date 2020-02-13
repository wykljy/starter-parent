package com.wangyakun.starter.wangyakunspringbootstarterautoconfigure.config;
import com.wangyakun.starter.wangyakunspringbootstarterautoconfigure.service.WykInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName WykInfoConfiguration
 * @Description TODO
 * @Author wangyakun
 * @Date 2020/2/10 13:43
 * @Version 1.0
 **/
@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(WykProperties.class)
public class WykInfoConfiguration {

    @Autowired
    private WykProperties wykProperties;

    @Bean
    public WykInfoService wykInfoService(){
        WykInfoService wykInfoService=new WykInfoService();
        wykInfoService.setWykProperties(wykProperties);
        return wykInfoService;
    }
}
