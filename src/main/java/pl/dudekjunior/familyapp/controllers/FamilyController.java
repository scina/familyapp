package pl.dudekjunior.familyapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FamilyController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    public void createFamily(){
        //todo
    }

    public void readFamily(){
        //todo
    }

    public void addChildToFamily(){
        //todo
    }
}
