package pl.dudekjunior.familyapp.models.forms;

import lombok.Data;
import pl.dudekjunior.familyapp.models.Gender;

import java.time.LocalDate;

@Data
public class ChildForm {
    private String name;
    private String surname;
    private String pesel;
    private LocalDate bornDate;
    private Gender gender;
}
