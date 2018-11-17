package pl.dudekjunior.familyapp.models.entities;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

//todo I think that entity is not necessary

@Entity
@Data
public class FamilyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "father_name")
    private String fatherName;
    @Column(name = "father_surname")
    private String fatherSurname;
    private int pesel;
    @Column(name = "father_born_date")
    private LocalDate fatherBornDate;
}
