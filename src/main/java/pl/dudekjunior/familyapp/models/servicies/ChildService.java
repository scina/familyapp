package pl.dudekjunior.familyapp.models.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dudekjunior.familyapp.models.FamilyModel;
import pl.dudekjunior.familyapp.models.entities.ChildEntity;
import pl.dudekjunior.familyapp.models.entities.FatherEntity;
import pl.dudekjunior.familyapp.models.forms.ChildForm;
import pl.dudekjunior.familyapp.models.repositories.ChildRepository;

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

    public List<ChildEntity> getChildrenByFamily(FamilyModel family) {
        return childRepository.findByFatherId(family.getFather().getId());
    }
}
