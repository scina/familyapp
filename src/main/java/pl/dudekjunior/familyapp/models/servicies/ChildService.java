package pl.dudekjunior.familyapp.models.servicies;

import org.springframework.stereotype.Service;
import pl.dudekjunior.familyapp.models.FamilyModel;
import pl.dudekjunior.familyapp.models.entities.ChildEntity;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChildService {

    public void addChild(){
        //todo
    }

    public void collectChildData(){
        //todo
    }

    public ChildEntity readChild(){
        return new ChildEntity();
    }

    public List<ChildEntity> getChildrenByFamily(FamilyModel family){
        List<ChildEntity> children = new ArrayList<>();
        family.getFather();
        //todo wyszukiwanie encji dzieci w bazie danych i dodanie ich do listy
        return children;
    }
}
