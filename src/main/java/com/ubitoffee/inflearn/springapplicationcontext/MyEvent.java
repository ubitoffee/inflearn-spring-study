package com.ubitoffee.inflearn.springapplicationcontext;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
    private int data;

    public MyEvent(Object source) {
        super(source);
    }

    public MyEvent(Object source, int data) {
        super(source);
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
