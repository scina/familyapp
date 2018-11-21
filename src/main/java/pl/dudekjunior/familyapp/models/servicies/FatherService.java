package pl.dudekjunior.familyapp.models.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dudekjunior.familyapp.models.entities.FatherEntity;
import pl.dudekjunior.familyapp.models.forms.FatherForm;
import pl.dudekjunior.familyapp.models.repositories.FatherRepository;

@Service
public class FatherService {

    private final FatherRepository fatherRepository;

    @Autowired
    public FatherService(FatherRepository fatherRepository) {
        this.fatherRepository = fatherRepository;
    }

    public FatherEntity addFather(FatherForm fatherForm) {
        FatherEntity father = new FatherEntity();
        father.setName(fatherForm.getName());
        father.setSurname(fatherForm.getSurname());
        father.setPesel(fatherForm.getPesel());
        father.setBornDate(fatherForm.getBornDate());
        return father;
    }

    public FatherEntity getFatherById(int fatherId) {
        return fatherRepository.findById(fatherId).get();
    }
}
