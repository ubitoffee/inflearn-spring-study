package com.ubitoffee.inflearn.springapplicationcontext;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EventValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Event.class.equals(clazz);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "notempty", "Title is empty.");
        Event event = (Event) o;
        if (event.getTitle() == null) {
            errors.reject("errorCd", "Title is Null");
        }
    }
}
