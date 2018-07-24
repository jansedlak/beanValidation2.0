package sk.js.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import sk.js.validation.Iban;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Builder
@AllArgsConstructor
@Getter@Setter
public class Merchant {
    @NotNull
    String name;
    @NotNull
    String surname;
    @Email(message = "email.message")
    String email;
    @Iban(message = "iban.message")
    String iban;
}
