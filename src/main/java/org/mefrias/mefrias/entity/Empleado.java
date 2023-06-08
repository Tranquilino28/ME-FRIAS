/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mefrias.mefrias.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author TRANQUILINO-FRIAS
 */
@Entity
@Table(name = "tabla_empleados")
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empl_id;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "pers_id")
    private Persona persona;

    @OneToOne()
    @JoinColumn(name = "maes_tiesp",referencedColumnName = "maes_id")
    private Maestra maes_tiesp;

    public Empleado() {
    }

    public Empleado(Integer empl_id, Persona persona, Maestra maes_tiesp) {
        this.empl_id = empl_id;
        this.persona = persona;
        this.maes_tiesp = maes_tiesp;
    }

    public Empleado(Persona persona, Maestra maes_tiesp) {
        this.persona = persona;
        this.maes_tiesp = maes_tiesp;
    }

    public Integer getEmpl_id() {
        return empl_id;
    }

    public void setEmpl_id(Integer empl_id) {
        this.empl_id = empl_id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Maestra getMaes_tiesp() {
        return maes_tiesp;
    }

    public void setMaes_tiesp(Maestra maes_tiesp) {
        this.maes_tiesp = maes_tiesp;
    }

    
    
    private static final long serialVersionUID = 1L;
}
