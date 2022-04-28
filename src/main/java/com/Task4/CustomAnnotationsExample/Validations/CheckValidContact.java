package com.Task4.CustomAnnotationsExample.Validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CheckValidContact implements ConstraintValidator<isValidContact,Long> {

    @Override
    public void initialize(isValidContact contact) {
      //  ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Long contactField, ConstraintValidatorContext context) {
        return (contactField!=null && (""+contactField).length()==10);
    }
}
