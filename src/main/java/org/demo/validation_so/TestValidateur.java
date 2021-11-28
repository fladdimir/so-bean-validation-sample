package org.demo.validation_so;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class TestValidateur implements ConstraintValidator<ObjectValid, String> {

    @Override
    public void initialize(ObjectValid constraintAnnotation) {
        // could be deleted since default is also empty
    }

    public boolean isValid(String noObject, ConstraintValidatorContext ctx) {
        return false;
    }

}