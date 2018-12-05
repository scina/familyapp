package pl.dudekjunior.familyapp.models.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dudekjunior.familyapp.models.Gender;
import pl.dudekjunior.familyapp.models.entities.ChildEntity;
import pl.dudekjunior.familyapp.models.entities.FatherEntity;
import pl.dudekjunior.familyapp.models.forms.ChildForm;
import pl.dudekjunior.familyapp.models.repositories.ChildRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class ChildService {

    private final ChildRepository childRepository;

    @Autowired
    public ChildService(ChildRepository childRepository) {
        this.childRepository = childRepository;
    }

    public ChildEntity addChild(ChildForm childForm, FatherEntity fatherEntity) {
        return childRepository.save(createChildEntity(childForm, fatherEntity));
    }

    private ChildEntity createChildEntity(ChildForm childForm, FatherEntity fatherEntity) {
        ChildEntity childEntity = new ChildEntity();
        childEntity.setName(childForm.getName());
        childEntity.setSurname(childForm.getSurname());
        childEntity.setPesel(childForm.getPesel());
        childEntity.setBornDate(childForm.getBornDate());
        childEntity.setGender(childForm.getGender());
        childEntity.setFather(fatherEntity);
        return childEntity;
    }

    public List<ChildEntity> getChildrenByName(String childName) {
        return childRepository.findByName(childName);
    }

    public List<ChildEntity> getChildrenBySurname(String childSurname) {
        return childRepository.findBySurname(childSurname);
    }

    public List<ChildEntity> getChildrenByPesel(String childPesel) {
        return childRepository.findByPesel(childPesel);
    }

    public List<ChildEntity> getChildrenByBornDate(LocalDate childBornDate) {
        return childRepository.findByBornDate(childBornDate);
    }

    public List<ChildEntity> getChildrenByGender(Gender childGender) {
        return childRepository.findByGender(childGender);
    }
}
