package sk.js.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IbanValidator implements ConstraintValidator<Iban, String> {

    public void initialize(Iban iban) {
    }

    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return ValidationService.isIbanValid(s);
    }
}
