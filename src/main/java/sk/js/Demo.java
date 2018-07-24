package sk.js;

import sk.js.model.Merchant;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Merchant m = new Merchant("Meno", "Priezvisko", "email#email.com", "SKiban1232");
        Set<ConstraintViolation<Merchant>> violations = validator.validate(m);
        for (ConstraintViolation<Merchant> violation : violations) {
            System.out.println(violation.getMessage());
        }
    }
}
