package com.chexun.springbootservice.common;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class AppEventListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if(applicationEvent instanceof ApplicationReadyEvent)
        {
            System.out.println("==================service is ready=================");
        }
    }
}
