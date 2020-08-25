package com.yasudarui.listenevent.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEventListenerController {

    @Autowired
    private ApplicationContext  applicationContext;

    @RequestMapping(value = "/test" )
    public void testPublishEvent(){
        applicationContext.publishEvent(new MyEvent(this,"hello"));
    }
}