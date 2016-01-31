package com.ccreanga.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@RestController
public class ServerConfigClient {

    @Autowired
    private Config config;

    @RequestMapping("/smsService")
    public String home() {
        return config.getSmsService();
    }

    public static void main(String[] args) {
        SpringApplication.run(ServerConfigClient.class, args);
    }

}