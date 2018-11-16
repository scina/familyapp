package pl.dudekjunior.familyapp.models;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class FamilyModel {
    FatherModel father;
    List<ChildModel> childs = new ArrayList<>();
}
