package pl.dudekjunior.familyapp.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ChildModel {
    private String name;
    private String surname;
    private int pesel;
    LocalDate bornDate;
    private int gender;
    //todo  I think that class will by entity in future
}
