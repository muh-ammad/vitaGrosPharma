package com.vitagrospharma.controllers;

import com.vitagrospharma.models.Owner;
import com.vitagrospharma.models.Pet;
import com.vitagrospharma.services.OwnerService;
import com.vitagrospharma.services.PetService;
import com.vitagrospharma.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

@Controller
@RequestMapping("/owners/{ownerId}/pets")
public class PetController {
    @Autowired
    private PetService petService;
    @Autowired
    private PetTypeService petTypeService;
    @Autowired
    private OwnerService ownerService;


    @GetMapping("/new")
    public ModelAndView newPet(@PathVariable("ownerId") int id, ModelAndView modelAndView){
        // System.out.println("Owner Id "+id);
        Pet pet = new Pet();
        Owner owner = ownerService.findOne(id);
        modelAndView.setViewName("pet/new");
        modelAndView.addObject("pet", pet);
        modelAndView.addObject("owner",owner);
        modelAndView.addObject("types", petTypeService.findAll());
        return modelAndView;
    }


    @PostMapping("/create")
    public String createPet(Model model,@PathVariable int ownerId,@ModelAttribute Pet pet){
/*       System.out.println("DateOfBirth "+dateOfBirth);
       System.out.println("Parse "+LocalDate.parse(dateOfBirth));
        pet.setDateOfBirth(LocalDate.parse(dateOfBirth));*/
        petService.save(ownerId, pet);
        Owner owner = ownerService.findOne(ownerId);
        model.addAttribute(owner);
       return "owner/show";
    }
    @PutMapping("/update")
    public String updatePet(Model model,@PathVariable int ownerId,@ModelAttribute Pet pet){
/*       System.out.println("DateOfBirth "+dateOfBirth);
       System.out.println("Parse "+LocalDate.parse(dateOfBirth));
        pet.setDateOfBirth(LocalDate.parse(dateOfBirth));*/
        petService.save(ownerId, pet);
        Owner owner = ownerService.findOne(ownerId);
        model.addAttribute(owner);
        return "owner/show";
    }
}
