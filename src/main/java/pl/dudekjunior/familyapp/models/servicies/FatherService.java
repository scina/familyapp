package pl.dudekjunior.familyapp.models.servicies;

import org.springframework.stereotype.Service;
import pl.dudekjunior.familyapp.models.FatherModel;

@Service
public class FatherService {

    public void addFather(){

    }

    public FatherModel readFather(){
        return new FatherModel();
    }
}
