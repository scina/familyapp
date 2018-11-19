package pl.dudekjunior.familyapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.dudekjunior.familyapp.models.FamilyModel;
import pl.dudekjunior.familyapp.models.entities.ChildEntity;

@Controller
public class FamilyController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/addFamily")
    public String addFamily(Model model){
        return "index";
    }

    public void readFamily(){
        //todo
    }

    public void addChildToFamily(ChildEntity child, FamilyModel family){
        //todo
    }
}
