package com.ubitoffee.inflearn.springapplicationcontext;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

public class EventConverter {

    @Component
    public static class StringToEventConverter implements Converter<String, Event> {
        @Override
        public Event convert(String source) {
            return new Event(Integer.parseInt(source));
        }
    }

//    @Component
    public static class EventToStringConverter implements Converter<Event, String> {

        @Override
        public String convert(Event event) {
            return event.getId().toString();
        }
    }
}
