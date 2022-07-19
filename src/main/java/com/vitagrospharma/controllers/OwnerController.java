package com.vitagrospharma.controllers;

import com.vitagrospharma.models.Owner;
import com.vitagrospharma.services.OwnerService;
import com.vitagrospharma.services.PetService;
import com.vitagrospharma.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;
    @Autowired
    private PetService petService;

    @GetMapping("/list")
    public String listOwner(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owner/list";
    }

    @GetMapping("/show/{id}")
    public String showOwner(@PathVariable int id, Model model) {
        model.addAttribute("owner", ownerService.findOne(id));
        return "owner/show";
    }

    @GetMapping("/new")
    public String newOwner(@ModelAttribute Owner owner, Model model) {
        System.out.println("Owner new " + owner);
        System.out.println("Owner Firstname " + owner.getFirstName());
        System.out.println("Owner LastName " + owner.getLastName());
        model.addAttribute(owner);
        return "owner/new";
    }

    @PostMapping("/create")
    public String createOwner(@RequestParam int id, @ModelAttribute Owner owner) {
        String uri;
        if (owner.getId() != 0) {
            ownerService.update(owner);
            uri = "redirect:/owners/show/" + id;
        } else {
            ownerService.save(owner);
            uri = "redirect:/owners/list";
        }
        return uri;
    }

    @GetMapping("/edit/{id}")
    public String editOwner(@PathVariable int id, @ModelAttribute Owner owner, Model model) {
        owner = ownerService.findOne(id);
        model.addAttribute(owner);
        return "owner/new";
    }

    @GetMapping (path = "/pets/list")
    public String list(Model model){
        model.addAttribute("pets",petService.findAll() );
        return "pet/list";
    }
}
