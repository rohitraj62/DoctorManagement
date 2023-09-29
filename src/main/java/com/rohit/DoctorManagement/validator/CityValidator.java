package com.rohit.DoctorManagement.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CityValidator implements ConstraintValidator<CityValid, String> {


    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        String value=s.toLowerCase();
        if(value.equals("delhi") || value.equals("faridabad") || value.equals("noida"))
        {
            return true;
        }
        else {
            return false;
        }
    }
}
