package pl.dudekjunior.familyapp.models.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dudekjunior.familyapp.models.entities.FatherEntity;
import pl.dudekjunior.familyapp.models.forms.FatherForm;
import pl.dudekjunior.familyapp.models.repositories.FatherRepository;

import java.util.Optional;

@Service
public class FatherService {

    private final FatherRepository fatherRepository;

    @Autowired
    public FatherService(FatherRepository fatherRepository) {
        this.fatherRepository = fatherRepository;
    }

    public FatherEntity addFather(FatherForm fatherForm) {
        FatherEntity father = getFatherEntity(fatherForm);
        fatherRepository.save(father);
        return father;
    }

    private FatherEntity getFatherEntity(FatherForm fatherForm) {
        FatherEntity father = new FatherEntity();
        father.setName(fatherForm.getName());
        father.setSurname(fatherForm.getSurname());
        father.setPesel(fatherForm.getPesel());
        father.setBornDate(fatherForm.getBornDate());
        return father;
    }

    FatherEntity getFatherById(int fatherId) throws NullPointerException {
        Optional<FatherEntity> father = fatherRepository.findById(fatherId);
        if(father.isPresent()) {
            return father.get();
        } else {
            throw new NullPointerException();
        }
    }


}
