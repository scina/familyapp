package pl.dudekjunior.familyapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.dudekjunior.familyapp.models.forms.ChildForm;
import pl.dudekjunior.familyapp.models.forms.FatherForm;
import pl.dudekjunior.familyapp.models.servicies.ChildService;
import pl.dudekjunior.familyapp.models.servicies.FatherService;

@Controller
public class AddFamilyController {


    private final FatherService fatherService;
    private final ChildService childService;

    private final static String FAMILY_ATTR_NAME = "family";

    @Autowired
    public AddFamilyController(FatherService fatherService, ChildService childService) {

        this.fatherService = fatherService;
        this.childService = childService;
    }

    @GetMapping("/addfamily")
    public String addFamily(Model model) {
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
        redirectAttributes.addFlashAttribute(FAMILY_ATTR_NAME, fatherService.addFather(fatherForm));
        return "redirect:/addfamily";
    }

    @GetMapping("/addchild/{fatherId}")
    public String addChild(Model model, @PathVariable("fatherId") int fatherId) {
        model.addAttribute("childForm", new ChildForm());
        model.addAttribute("father", fatherService.getFatherById(fatherId));
        return "form";
    }

    @PostMapping("/addchild/{fatherId}")
    public String addChild(@ModelAttribute("childForm") ChildForm childForm, @PathVariable("fatherId") int fatherId,
                           RedirectAttributes redirectAttributes) {
        childService.addChild(childForm, fatherService.getFatherById(fatherId));
        redirectAttributes.addFlashAttribute(FAMILY_ATTR_NAME, fatherService.getFatherById(fatherId));
        return "redirect:/addfamily";
    }
}
