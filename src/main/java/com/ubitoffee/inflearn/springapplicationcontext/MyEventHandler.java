package com.ubitoffee.inflearn.springapplicationcontext;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println("이벤트 데이터는 " + myEvent.getData());
    }
}
