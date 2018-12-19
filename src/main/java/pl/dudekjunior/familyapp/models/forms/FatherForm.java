package pl.dudekjunior.familyapp.models.forms;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class FatherForm {
    private String name;
    private String surname;
    private String pesel;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate bornDate;
}
