package pl.dudekjunior.familyapp.models.servicies;

import org.springframework.stereotype.Service;
import pl.dudekjunior.familyapp.models.entities.FatherEntity;

import java.time.LocalDate;

@Service
public class FatherService {

    public FatherEntity addFather(){
        FatherEntity father = new FatherEntity();
        father.setName("Father name");
        father.setSurname("Father surname");
        father.setPesel(989898986);
        father.setBornDate(LocalDate.of(1974,03,23));
        return father;
    }
}
