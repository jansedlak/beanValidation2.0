package sk.js.validation;

public class ValidationService {

    public static boolean isIbanValid(final String iban){
        return iban.startsWith("SK");
    }
}
