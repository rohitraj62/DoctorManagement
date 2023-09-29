package com.rohit.DoctorManagement.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Locale;

public class SpecialityValidator implements ConstraintValidator<SpecialityValid,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        String value=s.toLowerCase();
        if(value.equals("orthopedic")||value.equals("gynecology")||value.equals("dermatology")||value.equals("ent"))
        {
            return true;
        }
        return false;
    }
}
