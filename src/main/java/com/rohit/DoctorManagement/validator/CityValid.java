package com.rohit.DoctorManagement.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = CityValidator.class)
public @interface CityValid {
    String message() default "Invalid City Name !!";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};




}