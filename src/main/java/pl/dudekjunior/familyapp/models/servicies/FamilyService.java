package pl.dudekjunior.familyapp.models.servicies;

import lombok.Data;
import org.springframework.stereotype.Service;
import pl.dudekjunior.familyapp.models.FamilyModel;
import pl.dudekjunior.familyapp.models.entities.ChildEntity;
import pl.dudekjunior.familyapp.models.entities.FatherEntity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class FamilyService {

    private FamilyModel family;

    public FamilyModel createFamily() {
        return family = new FamilyModel();
    }

    public void addFatherToFamily(FatherEntity father) {
        family.setFather(father);
    }

    public void addChildToFamily(ChildEntity childEntity) {
        family.getChildren().add(childEntity);
    }

    public List<FamilyModel> searchFamilyByChildName(String childName) {
        return new ArrayList<>();
    }

    public List<FamilyModel> searchFamilyByChildSurname(String childSurname) {
        return new ArrayList<>();
    }

    public List<FamilyModel> searchFamilyByChildPesel(int pesel) {
        return new ArrayList<>();
    }

    public List<FamilyModel> searchFamilyByChildBornDate(LocalDate bornDate) {
        return new ArrayList<>();
    }

    public List<FamilyModel> searchFamilyByChildGender(int gender) {
        return new ArrayList<>();
    }


}
