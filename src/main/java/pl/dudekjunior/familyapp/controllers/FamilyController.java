package pl.dudekjunior.familyapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.dudekjunior.familyapp.models.servicies.FamilyService;


@Controller
public class FamilyController {
    private final FamilyService familyService;

    @Autowired
    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/getFamilyByFatherId/{fatherId}")
    public String getFamilyByFatherId(@PathVariable("fatherId") int fatherId, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("family", familyService.getFamilyByFatherId(fatherId));
        return "redirect:/";
    }
}
