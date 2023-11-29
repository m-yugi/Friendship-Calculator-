package com.yugi.lovcal_vs.validators;

import com.yugi.lovcal_vs.annotations.Age;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {
    private int lower;

    @Override
    public void initialize(Age age) {
        this.lower = age.lower();
    }

    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext context) {
        if (age == null) {
            return false;
        }
        if (age < lower) {
            return false;
        }
        return true;
    }
}
