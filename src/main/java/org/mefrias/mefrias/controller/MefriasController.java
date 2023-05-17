/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mefrias.mefrias.controller;

import java.util.List;
import org.mefrias.mefrias.entity.Persona;
import org.mefrias.mefrias.repositorios.Pers_interRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author TRANQUILINO-FRIAS
 */
@Controller
public class MefriasController {

    

    @GetMapping({"/index", "/", "login"})
    public String index(Model model) {
        model.addAttribute("title", "ME-FRIAS login");

        return "index";
    }

    @GetMapping({"/home", "inicio"})
    public String home(Model model) {
        model.addAttribute("title", "ME-FRIAS home");
        model.addAttribute("saludo", "BIENVENIDOS A ME-FRIAS");

        return "home";
    }

   
}
