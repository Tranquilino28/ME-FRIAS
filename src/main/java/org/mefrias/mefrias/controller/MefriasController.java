/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mefrias.mefrias.controller;

import java.util.List;
import org.mefrias.mefrias.entity.Empleado;
import org.mefrias.mefrias.entity.Persona;
import org.mefrias.mefrias.repositorios.Empl_interRepository;
import org.mefrias.mefrias.repositorios.Pers_interRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author TRANQUILINO-FRIAS
 */
@Controller
public class MefriasController {

    @Autowired
    private Empl_interRepository emplRepository;

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

    @GetMapping({"/empleados/eliminar/{empl_id}"})
    public String deleteCliente(@PathVariable("empl_id") Integer empl_id, Model model) {
        emplRepository.deleteById(empl_id);

        return "redirect:/empleados";
    }

    @GetMapping({"/about","info"})
    public String about(Model model) {
        model.addAttribute("title", "ME-FRIAS about");

        return "about";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") Integer username, @RequestParam("password") String password) {
        // Realiza la validación del usuario y contraseña
        if (validacionInicio(username, password)) {
            // Credenciales válidas, redirige al usuario a la página principal o a otra página deseada
            return "redirect:/home";
        } else {
            // Credenciales inválidas, muestra un mensaje de error al usuario
            return "index";
        }
    }

    private boolean validacionInicio(Integer username, String password) {
        Empleado empleado = emplRepository.validar_usuariocontrasena(username, password);

        if (empleado != null) {

            return true;
        }

        return false;
        //return "admin".equals(username) && "admin123".equals(password);

    }
}
