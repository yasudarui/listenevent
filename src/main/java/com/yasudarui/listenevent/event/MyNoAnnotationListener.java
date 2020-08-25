package com.yasudarui.listenevent.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: jftang6
 * @Date: 2020/08/25/14:40
 * @Description:
 * 其次，需要定义一下监听器，自己定义的监听器需要实现ApplicationListener，
 * 同时泛型参数要加上自己要监听的事件Class名，在重写的方法onApplicationEvent中，添加自己的业务处理
 */
@Component
public class MyNoAnnotationListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println("非注解监听器"+myEvent.getMessage());
    }
}
