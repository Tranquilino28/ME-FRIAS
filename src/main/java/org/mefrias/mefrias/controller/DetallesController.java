/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mefrias.mefrias.controller;

import java.util.List;
import org.mefrias.mefrias.entity.Cliente;
import org.mefrias.mefrias.entity.Detalle;
import org.mefrias.mefrias.entity.Empleado;
import org.mefrias.mefrias.entity.Maestra;
import org.mefrias.mefrias.entity.Persona;
import org.mefrias.mefrias.entity.Vehiculo;
import org.mefrias.mefrias.repositorios.Clie_interRepository;
import org.mefrias.mefrias.repositorios.Deta_interRepository;
import org.mefrias.mefrias.repositorios.Empl_interRepository;
import org.mefrias.mefrias.repositorios.Maes_interRepository;
import org.mefrias.mefrias.repositorios.Pers_interRepository;
import org.mefrias.mefrias.repositorios.Vehi_interRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author TRANQUILINO-FRIAS
 */
@Controller
public class DetallesController {

       
    @GetMapping({"/detalles"})
    public String listarVehiculos(Model model) {
        model.addAttribute("title", "ME-FRIAS vehiculos");
        model.addAttribute("saludo", "LISTADO DE VEHICULOS");

        return "detalles";
    }

  
}
