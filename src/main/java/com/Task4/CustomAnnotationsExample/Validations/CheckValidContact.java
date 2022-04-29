package com.Task4.CustomAnnotationsExample.Validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckValidContact implements ConstraintValidator<isValidContact,Object> {

    @Override
    public void initialize(isValidContact contact) {

    }

    @Override
    public boolean isValid(Object contactField, ConstraintValidatorContext context) {
        return (contactField!=null && (""+contactField).length()==10);
    }
}
