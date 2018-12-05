package pl.dudekjunior.familyapp.models.servicies;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dudekjunior.familyapp.models.FamilyModel;
import pl.dudekjunior.familyapp.models.entities.ChildEntity;
import pl.dudekjunior.familyapp.models.entities.FatherEntity;

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

    public void getFamilyByFatherId(int fatherId) {
        FatherEntity fatherEntity = fatherService.getFatherById(fatherId);
        createFamily();
        family.setFather(fatherEntity);
        family.setChildren(fatherEntity.getChildren());
    }
}
