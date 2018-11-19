package pl.dudekjunior.familyapp.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class FatherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String surname;
    private String pesel;
    LocalDate bornDate;

    @OneToMany(mappedBy = "father", fetch = FetchType.EAGER, orphanRemoval = true)
    List<ChildEntity> children;
}
