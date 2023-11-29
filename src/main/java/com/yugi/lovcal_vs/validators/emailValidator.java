package com.yugi.lovcal_vs.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.yugi.lovcal_vs.dtos.registerDto;

public class emailValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return registerDto.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        String Email = ((registerDto) target).getContact().getEmail();
        if (!(Email.endsWith("@gmail.com") || Email.endsWith("@email.com"))) {
            errors.rejectValue("contact.email", "email.wrongEnding");
        }
    }
}