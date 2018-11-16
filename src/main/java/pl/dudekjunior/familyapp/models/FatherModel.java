package pl.dudekjunior.familyapp.models;

import lombok.Data;
import java.time.LocalDate;

@Data
public class FatherModel {
    private String name;
    private String surname;
    private int pesel;
    LocalDate bornDate;
}
