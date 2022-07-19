package com.vitagrospharma.controllers;

import com.vitagrospharma.models.Speciality;
import com.vitagrospharma.services.SpecialityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/specialities")
public class SpecialityController {
    private SpecialityService specialityService;
    public SpecialityController(SpecialityService specialityService){
        this.specialityService = specialityService;
    }

    @GetMapping("/list")
    public String getSpecialities(ModelMap model){
        List<Speciality> specialities = specialityService.findAll();
        model.addAttribute("specialities", specialities);
        return "speciality/list";
    }
    @GetMapping("/new")
    public String newSpeciality(){
        return "speciality/new";
    }

    @PostMapping("/create")
    public String createpeciality(@ModelAttribute Speciality speciality){
        if (speciality != null){
            specialityService.save(speciality.getName());
        } else {
            System.out.println(" Labas ");
        }
        return "redirect:/specialities/list";
    }
}
