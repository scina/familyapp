package pl.dudekjunior.familyapp.models.entities;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "father")
public class FatherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String surname;
    private String pesel;
    @Column(name = "born_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate bornDate;

    @OneToMany(mappedBy = "father", fetch = FetchType.EAGER, orphanRemoval = true)
    List<ChildEntity> children;
}
