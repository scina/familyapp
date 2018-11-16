package pl.dudekjunior.familyapp.models.servicies;

import org.springframework.stereotype.Service;
import pl.dudekjunior.familyapp.models.ChildModel;
import pl.dudekjunior.familyapp.models.FamilyModel;
import pl.dudekjunior.familyapp.models.FatherModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class FamilyService {

    public void createFamily(){

    }

    public void addFatherToFamily(FatherModel father, FamilyModel family){
        family.setFather(father);
    }

    public void addChildToFamily(ChildModel child, FamilyModel family){
        family.getChilds().add(child);
    }

    public FatherModel readFamily(int familyId){
        return new FatherModel();
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
