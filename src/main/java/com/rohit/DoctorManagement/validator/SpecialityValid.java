package com.rohit.DoctorManagement.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy=SpecialityValidator.class)
public @interface SpecialityValid {

    String message() default "Invalid Speciality !!";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
