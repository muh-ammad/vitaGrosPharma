package com.vitagrospharma.controllers;

import com.vitagrospharma.models.PetType;
import com.vitagrospharma.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pettypes")
public class PetTypeController {

    @Autowired
    private PetTypeService petTypeService;

    @GetMapping("/list")
    public String getList(Model model) {
        model.addAttribute("petTypes", petTypeService.findAll());
        return "pettype/list";
    }

    @GetMapping("/new")
    public String newType() {
        return "pettype/new";
    }

    @PostMapping("/create")
    public String createType(@RequestParam String name) {
        petTypeService.save(name);
        return "redirect:/pettypes/list";
    }
}
