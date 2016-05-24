package com.ccreanga.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentChangedListener implements ApplicationListener<EnvironmentChangeEvent> {

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void onApplicationEvent(EnvironmentChangeEvent environmentChangeEvent) {
        System.out.println(environmentChangeEvent);
    }
}
