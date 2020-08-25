package com.yasudarui.listenevent.event;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;
/**
 * @Auther: jftang6
 * @Date: 2020/08/25/14:30
 * @Description:
 */
public class MyEvent  extends ApplicationEvent implements Serializable {

    private static final long serialVersionUID = -1411073291751848755L;

    private  String message;

    public MyEvent(Object source ,String message) {
        super(source);
        this.message=message;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
