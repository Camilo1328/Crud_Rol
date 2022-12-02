package com.sena.demo.controller;

import com.sena.demo.model.Rol;
import com.sena.demo.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping("/rol/all")
    public String getRol(Model model){
        model.addAttribute("rol", rolService.getRol());
        return "rol/all";
    }

    @GetMapping("/rol/new")
    public String showNewRol(Model model){
        model.addAttribute("rol", new Rol());
        return "rol/new";
    }

    @PostMapping("/rol/save")
    public String saveClient(Rol rol){
        rolService.saveRol(rol);
        return "redirect:/rol/all";
    }

    @GetMapping("/rol/update/{id}")
    public String showUpdateRol(@PathVariable Long id, Model model){
        model.addAttribute("rol", rolService.getRol(id));
        return "rol/update";
    }

    @PostMapping("/rol/update/{id}")
    public String updateRol(@PathVariable Long id, Rol rol){
        rol.setId(id);
        rolService.updateRol(rol);
        return "redirect:/rol/all";
    }

    @GetMapping("/rol/delete/{id}")
    public String deleteRol(@PathVariable Long id){
        rolService.deleteRol(id);
        return "redirect:/rol/all";
    }

}
