package com.ccreanga.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.endpoint.RefreshEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix="sms")
@EnableConfigurationProperties
@Configuration
public class Config {

    String value;

//    @Autowired
//    RefreshEndpoint refreshEndpoint;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
