package com.ubitoffee.inflearn.springapplicationcontext;

import org.springframework.core.convert.converter.Converter;

public class EventConverter {

    public static class StringToEventConverter implements Converter<String, Event> {
        @Override
        public Event convert(String source) {
            return new Event(Integer.parseInt(source));
        }
    }

    public static class EventToStringCoverter implements Converter<Event, String> {

        @Override
        public String convert(Event event) {
            return event.getId().toString();
        }
    }
}
