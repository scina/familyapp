package pl.dudekjunior.familyapp.models.servicies;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
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

    private final ChildService childService;
    private final FatherService fatherService;

    @Autowired
    public FamilyService(ChildService childService, FatherService fatherService) {
        this.childService = childService;
        this.fatherService = fatherService;
    }

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


    public void getFamilyByFatherId(int fatherId) {
        FatherEntity fatherEntity = fatherService.getFatherById(fatherId);
        createFamily();
        family.setFather(fatherEntity);
        family.setChildren(fatherEntity.getChildren());
    }
}
