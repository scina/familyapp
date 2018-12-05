package pl.dudekjunior.familyapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.dudekjunior.familyapp.models.forms.ChildForm;
import pl.dudekjunior.familyapp.models.forms.FatherForm;
import pl.dudekjunior.familyapp.models.servicies.ChildService;
import pl.dudekjunior.familyapp.models.servicies.FamilyService;
import pl.dudekjunior.familyapp.models.servicies.FatherService;

@Controller
public class AddFamilyController {

    private final FamilyService familyService;
    private final FatherService fatherService;
    private final ChildService childService;

    @Autowired
    public AddFamilyController(FamilyService familyService, FatherService fatherService, ChildService childService) {
        this.familyService = familyService;
        this.fatherService = fatherService;
        this.childService = childService;
    }

    @GetMapping("/addfamily")
    public String addFamily(Model model) {
        if(familyService.getFamily() == null) {
            model.addAttribute("family", familyService.createFamily());
        }
        return "addfamily";
    }
    @GetMapping("/createfamily")
    public String createFamily(Model model) {
        model.addAttribute("family", familyService.createFamily());
        return "addfamily";
    }

    @GetMapping("/addfather")
    public String addFather(Model model) {
        model.addAttribute("fatherForm", new FatherForm());
        return "form";
    }

    @PostMapping("/addfather")
    public String addFather(@ModelAttribute("fatherForm") FatherForm fatherForm,
                            RedirectAttributes redirectAttributes) {
        familyService.addFatherToFamily(fatherService.addFather(fatherForm));
        redirectAttributes.addFlashAttribute("family", familyService.getFamily());
        return "redirect:/addfamily";
    }

    @GetMapping("/addchild")
    public String addChild(Model model) {
        model.addAttribute("childForm", new ChildForm());
        return "form";
    }

    @PostMapping("/addchild")
    public String addChild(@ModelAttribute("childForm") ChildForm childForm,
                           RedirectAttributes redirectAttributes) {
        familyService.addChildToFamily(childService.addChild(childForm, familyService.getFamily().getFather()));
        redirectAttributes.addFlashAttribute("family", familyService.getFamily());
        return "redirect:/addfamily";
    }
}
