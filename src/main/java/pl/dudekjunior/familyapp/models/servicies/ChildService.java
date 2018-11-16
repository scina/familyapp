package pl.dudekjunior.familyapp.models.servicies;

import org.springframework.stereotype.Service;
import pl.dudekjunior.familyapp.models.ChildModel;
import pl.dudekjunior.familyapp.models.FamilyModel;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChildService {

    public void addChild(){
        //todo
    }

    public ChildModel readChild(){
        return new ChildModel();
    }

    public List<ChildModel> childsByFamily(FamilyModel family){
        List<ChildModel> childs = new ArrayList<>();
        family.getFather();
        //todo wyszukiwanie encji dzieci w bazie danych i dodanie ich do listy
        return childs;
    }
}
