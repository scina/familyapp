package pl.dudekjunior.familyapp.models.entities;

import lombok.Data;
import pl.dudekjunior.familyapp.models.Gender;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "child")
public class ChildEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String surname;
    private String pesel;
    @Column(name = "born_date")
    LocalDate bornDate;
    @Enumerated
    private Gender gender;
    @ManyToOne
    @JoinColumn(name = "father_id")
    private FatherEntity father;
}
