package pl.dudekjunior.familyapp.models;

import lombok.Data;
import pl.dudekjunior.familyapp.models.entities.ChildEntity;
import pl.dudekjunior.familyapp.models.entities.FatherEntity;

import java.util.ArrayList;
import java.util.List;

@Data
public class FamilyModel {
    FatherEntity father;
    List<ChildEntity> children = new ArrayList<>();
}
