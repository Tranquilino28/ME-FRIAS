/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mefrias.mefrias.controller;

import java.util.List;
import org.mefrias.mefrias.entity.Cliente;
import org.mefrias.mefrias.entity.Maestra;
import org.mefrias.mefrias.entity.Persona;
import org.mefrias.mefrias.repositorios.Clie_interRepository;
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
public class ClienteController {

    @Autowired
    private Clie_interRepository clieRepository;

    @Autowired
    private Pers_interRepository persRepository;

    @Autowired
    private Maes_interRepository maesRepository;

    @GetMapping({"/clientes"})
    public String listarPersonas(Model model) {
        model.addAttribute("title", "ME-FRIAS clientes");
        model.addAttribute("saludo", "LISTADO DE PERSONAS CLIENTES");

        List<Cliente> listaCliente = clieRepository.findAll();
        model.addAttribute("lista_Clientes", listaCliente);

        return "clientes";
    }

    @GetMapping({"/clientes/nuevo"})
    public String addPersonas(Model model) {
        model.addAttribute("title", "ME-FRIAS Reg-clie");
        model.addAttribute("saludo", "AGREGA TANTOS CLIENTES COMO PUEDAS");

        List<Maestra> listaMaesTRol = maesRepository.maesTipoRol();
        List<Maestra> listaMaesTSexo = maesRepository.maesTipoSexo();
        List<Maestra> listaMaesTEstado = maesRepository.maesTipoEstado();
        List<Maestra> listaMaesTIdentificacion = maesRepository.maesTipoIdentificasion();

        model.addAttribute("maestraTRol", listaMaesTRol);
        model.addAttribute("maestraTSexo", listaMaesTSexo);
        model.addAttribute("maestraTEstado", listaMaesTEstado);
        model.addAttribute("maestraTIdentificacion", listaMaesTIdentificacion);

        model.addAttribute("cliente", new Cliente());
        return "regclientes";
    }

    /*@PostMapping({"/clientes/guardar"})
    public String guardarNuevoCliente(Persona persona) {
        clieRepository.save(new Cliente(persona));
               
        return "redirect:/clientes";
    }
     */
    @PostMapping("/clientes/guardar")
    public String saveCliente(
            Cliente clienteform,
            @RequestParam("tipo_estado") Integer clieMaes_ties,
            @RequestParam("tipo_identificacion") Integer clieMaes_tiid,
            @RequestParam("tipo_sexo") Integer clieMaes_tise,
            @RequestParam("tipo_rol") Integer clieMaes_tirol) {
        /*/ Verifica si la persona ya existe en la base de datos
        if (persona.getPers_id()!= null) {
            // Persona ya existe, simplemente crea el cliente y guárdalo
            Cliente cliente = new Cliente(persona);
            clieRepository.save(cliente);
        } else {
         */ // Persona es una instancia transitoria, guárdala primero y luego crea el cliente
        clienteform.getPersona().setMaes_ties(maesRepository.findById(clieMaes_ties).get());
        clienteform.getPersona().setMaes_tiid(maesRepository.findById(clieMaes_tiid).get());
        clienteform.getPersona().setMaes_tise(maesRepository.findById(clieMaes_tise).get());
        clienteform.getPersona().setMaes_tirol(maesRepository.findById(clieMaes_tirol).get());
        
        persRepository.save(clienteform.getPersona()); // Guarda la persona en la base de datos
        
        clieRepository.save(clienteform);
        //}

        return "redirect:/clientes";
    }

    @GetMapping({"/clientes/editar/{clie_id}"})
    public String mostrarFormularioUpdatingCliente(@PathVariable("clie_id") Integer clie_id, Model model) {
        Cliente cliente = clieRepository.findById(clie_id).get();
 List<Maestra> listaMaesTRol = maesRepository.maesTipoRol();
        List<Maestra> listaMaesTSexo = maesRepository.maesTipoSexo();
        List<Maestra> listaMaesTEstado = maesRepository.maesTipoEstado();
        List<Maestra> listaMaesTIdentificacion = maesRepository.maesTipoIdentificasion();

        model.addAttribute("maestraTRol", listaMaesTRol);
        model.addAttribute("maestraTSexo", listaMaesTSexo);
        model.addAttribute("maestraTEstado", listaMaesTEstado);
        model.addAttribute("maestraTIdentificacion", listaMaesTIdentificacion);
       
//Persona persona = cliente.getPersona();
        model.addAttribute("cliente", cliente);
       // model.addAttribute("persona", persona);

        return "regclientes";
    }

    @GetMapping({"/clientes/eliminar/{clie_id}"})
    public String deleteCliente(@PathVariable("clie_id") Integer clie_id, Model model) {
        clieRepository.deleteById(clie_id);

        return "redirect:/clientes";
    }

}
