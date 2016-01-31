package com.ccreanga.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.endpoint.RefreshEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Config {

    @Value("${info.description}")
    String smsService;

    @Autowired
    RefreshEndpoint refreshEndpoint;


    @RefreshScope
    @Bean
    public Map hBean(){
        System.out.println(smsService);
        return  new HashMap();
    }

    public String getSmsService() {
        return smsService;
    }


//    @Scheduled(fixedRate=10000)
//    public void run() {
//        System.out.println("refreshed called");
//        refreshEndpoint.refresh();
//        System.out.println("done");
//    }



}
