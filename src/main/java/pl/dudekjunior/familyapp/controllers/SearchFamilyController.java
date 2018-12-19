package pl.dudekjunior.familyapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.dudekjunior.familyapp.models.entities.ChildEntity;
import pl.dudekjunior.familyapp.models.forms.ChildForm;
import pl.dudekjunior.familyapp.models.servicies.ChildService;

import java.util.List;

@Controller
public class SearchFamilyController {


    private final ChildService childService;

    @Autowired
    public SearchFamilyController(ChildService childService) {

        this.childService = childService;
    }

    @GetMapping("/searchfamily")
    public String searchFamily(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("childForm", new ChildForm());
        return "redirect:/";
    }

    @PostMapping("/searchFamilyByChildName")
    public String searchChildByName(@ModelAttribute("childForm") ChildForm childForm,
                                    RedirectAttributes redirectAttributes) {
        List<ChildEntity> childEntities = childService.getChildrenByName(childForm.getName());
        redirectAttributes.addFlashAttribute("foundChildren", childEntities);
        return "redirect:/";
    }

    @PostMapping("/searchFamilyByChildSurname")
    public String searchFamilyByChildSurname(@ModelAttribute("childForm") ChildForm childForm,
                                             RedirectAttributes redirectAttributes) {
        List<ChildEntity> childEntities = childService.getChildrenBySurname(childForm.getSurname());
        redirectAttributes.addFlashAttribute("foundChildren", childEntities);
        return "redirect:/";
    }

    @PostMapping("/searchFamilyByChildGender")
    public String searchFamilyByChildGender(@ModelAttribute("childForm") ChildForm childForm,
                                            RedirectAttributes redirectAttributes) {
        List<ChildEntity> childEntities = childService.getChildrenByGender(childForm.getGender());
        redirectAttributes.addFlashAttribute("foundChildren", childEntities);
        return "redirect:/";
    }

    @PostMapping("/searchFamilyByChildPesel")
    public String searchFamilyByChildPesel(@ModelAttribute("childForm") ChildForm childForm,
                                           RedirectAttributes redirectAttributes) {
        List<ChildEntity> childEntities = childService.getChildrenByPesel(childForm.getPesel());
        redirectAttributes.addFlashAttribute("foundChildren", childEntities);
        return "redirect:/";
    }

    @PostMapping("/searchFamilyByChildDate")
    public String searchFamilyByChildDate(@ModelAttribute("childForm") ChildForm childForm,
                                          RedirectAttributes redirectAttributes) {
        List<ChildEntity> childEntities = childService.getChildrenByBornDate(childForm.getBornDate());
        redirectAttributes.addFlashAttribute("foundChildren", childEntities);
        return "redirect:/";
    }
}
