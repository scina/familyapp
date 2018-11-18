package pl.dudekjunior.familyapp.models.servicies;

import org.springframework.stereotype.Service;
import pl.dudekjunior.familyapp.models.FamilyModel;
import pl.dudekjunior.familyapp.models.entities.ChildEntity;
import pl.dudekjunior.familyapp.models.entities.FatherEntity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class FamilyService {

    public FamilyModel createFamily(){
        FamilyModel family = new FamilyModel();
        return family;
    }

    public void addFatherToFamily(FatherEntity father, FamilyModel family){
        family.setFather(father);
    }

    public void addChildToFamily(List<ChildEntity> children, FamilyModel family){
        for(ChildEntity child : children) {
            family.getChildren().add(child);
        }
    }

    public List<FamilyModel> searchFamilyByChildName(String childName){
        return new ArrayList<>();
    }

    public List<FamilyModel> searchFamilyByChildSurname(String childSurname){
        return new ArrayList<>();
    }

    public List<FamilyModel> searchFamilyByChildPesel(int pesel){
        return new ArrayList<>();
    }

    public List<FamilyModel> searchFamilyByChildBornDate(LocalDate bornDate){
        return new ArrayList<>();
    }

    public List<FamilyModel> searchFamilyByChildGender(int gender){
        return new ArrayList<>();
    }


}
