package pl.dudekjunior.familyapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.dudekjunior.familyapp.models.FamilyModel;
import pl.dudekjunior.familyapp.models.entities.ChildEntity;
import pl.dudekjunior.familyapp.models.forms.ChildForm;
import pl.dudekjunior.familyapp.models.forms.FatherForm;

@Controller
public class FamilyController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/addFather")
    public String addFather(Model model) {
        model.addAttribute("fatherForm", new FatherForm());
        return "addFamily";
    }

    @GetMapping("/addChild")
    public String addChild(Model model) {
        model.addAttribute("childForm", new ChildForm());
        return "addFamily";
    }

    public void readFamily() {
        //todo
    }
}
