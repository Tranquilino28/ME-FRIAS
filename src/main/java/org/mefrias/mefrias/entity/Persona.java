/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mefrias.mefrias.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author TRANQUILINO-FRIAS
 */
@Entity
@Table(name="tabla_persona")
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pers_id;
    
    

    @Column(length = 50, nullable = false)
    private String pers_nombre;
    public Persona() {
    }

    public Persona(Integer pers_id) {
        this.pers_id = pers_id;
    }

    public Persona(String pers_nombre) {
        this.pers_nombre = pers_nombre;
    }

    public Persona(Integer pers_id, String pers_nombre) {
        this.pers_id = pers_id;
        this.pers_nombre = pers_nombre;
    }

    public Integer getPers_id() {
        return pers_id;
    }

    public void setPers_id(Integer pers_id) {
        this.pers_id = pers_id;
    }

    public String getPers_nombre() {
        return pers_nombre;
    }

    public void setPers_nombre(String pers_nombre) {
        this.pers_nombre = pers_nombre;
    }
    
        
    
    
}
