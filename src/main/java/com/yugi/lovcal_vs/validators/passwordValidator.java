package com.yugi.lovcal_vs.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.yugi.lovcal_vs.dtos.registerDto;

public class passwordValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return registerDto.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.empty");
        char[] password = ((registerDto) target).getPassword();
        boolean has = false;
        for (char i : password) {
            if (i == '@') {
                has = true;
            }
        }
        if (!has) {
            errors.rejectValue("password", "password.no@");
        }
    }

}