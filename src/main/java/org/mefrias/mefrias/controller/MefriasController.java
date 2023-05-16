/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mefrias.mefrias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author TRANQUILINO-FRIAS
 */
@Controller
public class MefriasController {
    
    @GetMapping({"/index","/","login"})
    public String index(Model model){
        model.addAttribute("title","ME-FRIAS");
        
        return "index";
    }
    
    @GetMapping({"/home"})
    public String home(Model model){
        model.addAttribute("title","ME-FRIAS");
        model.addAttribute("saludo","BIENVENIDOS A ME-FRIAS");
        
        return "home";
    }
    
        
    
}
