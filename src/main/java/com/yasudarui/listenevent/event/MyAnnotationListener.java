package com.yasudarui.listenevent.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyAnnotationListener {

    @EventListener
    public void listener1(MyEvent event) {
        System.out.println("注解监听器1:" + event.getMessage()
        );
    }
}