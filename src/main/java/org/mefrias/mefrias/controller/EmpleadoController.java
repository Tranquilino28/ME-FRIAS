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
import org.mefrias.mefrias.repositorios.Clie_interRepository;
import org.mefrias.mefrias.repositorios.Empl_interRepository;
import org.mefrias.mefrias.repositorios.Maes_interRepository;
import org.mefrias.mefrias.repositorios.Pers_interRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author TRANQUILINO-FRIAS
 */
@Controller
public class EmpleadoController {

    @Autowired
    private Empl_interRepository emplRepository;

    @Autowired
    private Pers_interRepository persRepository;

    @Autowired
    private Maes_interRepository maesRepository;

    @GetMapping({"/empleados"})
    public String listarPersonas(Model model) {
        model.addAttribute("title", "ME-FRIAS empleados");
        model.addAttribute("saludo", "LISTADO DE PERSONAS EMPLEADOS");

        List<Empleado> listaEmpleado = emplRepository.findAll();
        model.addAttribute("lista_empleados", listaEmpleado);

        return "empleados";
    }

    @GetMapping({"/empleados/nuevo"})
    public String addPersonas(Model model) {
        model.addAttribute("title", "ME-FRIAS Reg-empl");
        model.addAttribute("saludo", "AGREGA TANTOS EMPLEADOS COMO PUEDAS");

        List<Maestra> listaMaesTRol = maesRepository.maesTipoRol();
        List<Maestra> listaMaesTSexo = maesRepository.maesTipoSexo();
        List<Maestra> listaMaesTEstado = maesRepository.maesTipoEstado();
        List<Maestra> listaMaesTIdentificacion = maesRepository.maesTipoIdentificasion();
        List<Maestra> listaMaesTEspecialidad = maesRepository.maesTipoEspecialidad();

        model.addAttribute("maestraTRol", listaMaesTRol);
        model.addAttribute("maestraTSexo", listaMaesTSexo);
        model.addAttribute("maestraTEstado", listaMaesTEstado);
        model.addAttribute("maestraTIdentificasion", listaMaesTIdentificacion);
        model.addAttribute("maestraTEspecialidad", listaMaesTEspecialidad);

        model.addAttribute("empleado", new Empleado());
        return "regempleados";
    }

    /*@PostMapping({"/clientes/guardar"})
    public String guardarNuevoCliente(Persona persona) {
        clieRepository.save(new Cliente(persona));
               
        return "redirect:/clientes";
    }
     */
    @PostMapping("/empleados/guardar")
    public String saveEmpleado(
            Empleado empleadoform,
            @RequestParam("especialidad") Integer emplMaes_tiesp) {

        //Maestra maestra = maesRepository.findById(emplMaes_tiesp).get();
        /*/ Verifica si la persona ya existe en la base de datos
        if (persona.getPers_id()!= null) {
            // Persona ya existe, simplemente crea el cliente y guárdalo
            Cliente cliente = new Cliente(persona);
            clieRepository.save(cliente);
        } else {
         */ // Persona es una instancia transitoria, guárdala primero y luego crea el cliente
        empleadoform.setMaes_tiesp(maesRepository.findById(emplMaes_tiesp).get());
        persRepository.save(empleadoform.getPersona()); // Guarda la persona en la base de datos

        emplRepository.save(empleadoform);
        //}

        return "redirect:/empleados";
    }

    @GetMapping({"/empleados/editar/{empl_id}"})
    public String mostrarFormularioUpdatingEmpleado(@PathVariable("empl_id") Integer empl_id, Model model) {
        model.addAttribute("title", "ME-FRIAS editar-empleado");
        
        Empleado empleado = emplRepository.findById(empl_id).get();
        //Persona persona = cliente.getPersona();

        List<Maestra> listaMaesTRol = maesRepository.maesTipoRol();
        List<Maestra> listaMaesTSexo = maesRepository.maesTipoSexo();
        List<Maestra> listaMaesTEstado = maesRepository.maesTipoEstado();
        List<Maestra> listaMaesTIdentificacion = maesRepository.maesTipoIdentificasion();
        List<Maestra> listaMaesTEspecialidad = maesRepository.maesTipoEspecialidad();

        model.addAttribute("maestraTRol", listaMaesTRol);
        model.addAttribute("maestraTSexo", listaMaesTSexo);
        model.addAttribute("maestraTEstado", listaMaesTEstado);
        model.addAttribute("maestraTIdentificasion", listaMaesTIdentificacion);

        model.addAttribute("maestraTEspecialidad", listaMaesTEspecialidad);

        model.addAttribute("empleado", empleado);
        // model.addAttribute("persona", persona);

        return "regempleados";
    }

    

}
