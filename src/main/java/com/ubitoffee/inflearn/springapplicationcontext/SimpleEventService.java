package com.ubitoffee.inflearn.springapplicationcontext;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService {

    @PerfLogging
    @Override
    public void createdEvent() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Created an event");
    }

    @PerfLogging
    @Override
    public void publishEvent() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Published an event");
    }

    @Override
    public void deleteEvent() {
        System.out.println("Deleted an event");
    }
}
