package com.yugi.lovcal_vs.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import com.yugi.lovcal_vs.validators.AgeValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = AgeValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Age {

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int lower() default 18;

    String message() default "{invalidAgeMessage}";
}