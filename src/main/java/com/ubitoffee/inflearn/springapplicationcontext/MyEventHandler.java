package com.ubitoffee.inflearn.springapplicationcontext;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println("이벤트 데이터는 " + myEvent.getData());
    }
}
