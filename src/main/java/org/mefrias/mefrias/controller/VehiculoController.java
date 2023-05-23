/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mefrias.mefrias.controller;

import java.util.List;
import org.mefrias.mefrias.entity.Cliente;
import org.mefrias.mefrias.entity.Empleado;
import org.mefrias.mefrias.entity.Maestra;
import org.mefrias.mefrias.entity.Persona;
import org.mefrias.mefrias.entity.Vehiculo;
import org.mefrias.mefrias.repositorios.Clie_interRepository;
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
public class VehiculoController {

    
    @Autowired
    private Maes_interRepository maesRepository;
    
    @Autowired
    private Vehi_interRepository vehiRepository;
    
    @GetMapping({"/vehiculos"})
    public String listarVehiculos(Model model) {
        model.addAttribute("title", "ME-FRIAS vehiculos");
        model.addAttribute("saludo", "LISTADO DE VEHICULOS");

        List<Vehiculo> listaVehiculos = vehiRepository.findAll();
        model.addAttribute("lista_vehiculos", listaVehiculos);

        return "vehiculos";
    }

    @GetMapping({"/vehiculos/nuevo"})
    public String addVehiculo(Model model) {
        model.addAttribute("title", "ME-FRIAS Reg-empl");
        model.addAttribute("saludo", "AGREGA TANTOS VEHICULOS COMO PUEDAS");

       
        List<Maestra> listaMaesTVehiculo = maesRepository.maesTipoVehiculo();

        
        model.addAttribute("maestraTVehiculo", listaMaesTVehiculo);

        model.addAttribute("vehiculo", new Vehiculo());
        return "regvehiculos";
    }

    /*@PostMapping({"/clientes/guardar"})
    public String guardarNuevoCliente(Persona persona) {
        clieRepository.save(new Cliente(persona));
               
        return "redirect:/clientes";
    }
     */
    @PostMapping("/vehiculos/guardar")
    public String saveVehiculo(Vehiculo vehiculoform) {
        /*/ Verifica si la persona ya existe en la base de datos
        if (persona.getPers_id()!= null) {
            // Persona ya existe, simplemente crea el cliente y guárdalo
            Cliente cliente = new Cliente(persona);
            clieRepository.save(cliente);
        } else {
         */ // Persona es una instancia transitoria, guárdala primero y luego crea el cliente

        //clieRepository.save(empleadoform.getPersona()); // Guarda la persona en la base de datos

        vehiRepository.save(vehiculoform);
        //}

        return "redirect:/vehiculos";
    }

    @GetMapping({"/vehiculos/editar/{vehi_id}"})
    public String mostrarFormularioUpdatingVehiculo(@PathVariable("vehi_id") Integer vehi_id, Model model) {
        Vehiculo vehiculo = vehiRepository.findById(vehi_id).get();        

        List<Maestra> listaMaesTVehiculo = maesRepository.maesTipoVehiculo();
        
        model.addAttribute("maestraTVehiculo", listaMaesTVehiculo);

        model.addAttribute("vehiculo", vehiculo);
        

        return "regvehiculos";
    }

    @GetMapping({"/vehiculos/eliminar/{vehi_id}"})
    public String deleteVehiculo(@PathVariable("vehi_id") Integer vehi_id, Model model) {
        vehiRepository.deleteById(vehi_id);

        return "redirect:/vehiculos";
    }

}
