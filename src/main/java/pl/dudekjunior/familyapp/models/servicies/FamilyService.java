package pl.dudekjunior.familyapp.models.servicies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dudekjunior.familyapp.models.entities.FatherEntity;

@Service
public class FamilyService {

    private final FatherService fatherService;

    @Autowired
    public FamilyService(FatherService fatherService) {
        this.fatherService = fatherService;
    }


    public FatherEntity getFamilyByFatherId(int fatherId) {
        return fatherService.getFatherById(fatherId);
    }
}
