package pl.dudekjunior.familyapp.models.entities;

import lombok.Data;
import pl.dudekjunior.familyapp.models.Gender;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class ChildEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String surname;
    private String pesel;
    LocalDate bornDate;
    private char gender;
    @ManyToOne
    @JoinColumn(name = "father_id")
    private FatherEntity father;
}
