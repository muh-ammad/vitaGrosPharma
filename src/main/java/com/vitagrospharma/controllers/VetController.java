package com.vitagrospharma.controllers;

import com.vitagrospharma.models.Vet;
import com.vitagrospharma.services.SpecialityService;
import com.vitagrospharma.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/vets")
public class VetController {

    @Autowired
    private VetService vetService;
    @Autowired
    private SpecialityService specialityService;

    @GetMapping("/list")
    public String listVets(ModelMap model) {
        model.addAttribute("vets", vetService.findAll());
        return "vet/list";
    }

    @GetMapping(value = "/new")
    public ModelAndView newVet(ModelAndView modelAndView) {
        modelAndView.setViewName("/vet/new");
        modelAndView.addObject("vet", new Vet());
        modelAndView.addObject("specialities", specialityService.findAll());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createVet(@ModelAttribute("vet")  Vet vet) {
        vetService.save(vet);
        return "redirect:/vets/list";
    }
}
