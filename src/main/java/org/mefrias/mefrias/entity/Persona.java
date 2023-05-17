/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mefrias.mefrias.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author TRANQUILINO-FRIAS
 */
@Entity
@Table(name = "tabla_persona")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pers_id;

    @Column(length = 15, nullable = false)
    private long pers_identificacion;

    @Column(length = 15, nullable = false)
    private String pers_nombre;

    @Column(length = 15, nullable = false)
    private String pers_apellido;

    @Column(length = 100, nullable = false)
    private String pers_direccion;

    @Column(length = 100, nullable = false)
    private String pers_email;

    @Column(length = 100, nullable = false)
    private String pers_contrasena;

    
    private Integer maes_tiid;

   
    private Integer maes_tise;

 
    private Integer maes_tirol;

    
    private Integer maes_ties;

    public Persona() {
    }

    public Integer getPers_id() {
        return pers_id;
    }

    public Persona(Integer pers_id, long pers_identificacion, String pers_nombre, String pers_apellido, String pers_direccion, String pers_email, String pers_contrasena, Integer maes_tiid, Integer maes_tise, Integer maes_tirol, Integer maes_ties) {
        this.pers_id = pers_id;
        this.pers_identificacion = pers_identificacion;
        this.pers_nombre = pers_nombre;
        this.pers_apellido = pers_apellido;
        this.pers_direccion = pers_direccion;
        this.pers_email = pers_email;
        this.pers_contrasena = pers_contrasena;
        this.maes_tiid = maes_tiid;
        this.maes_tise = maes_tise;
        this.maes_tirol = maes_tirol;
        this.maes_ties = maes_ties;
    }

    public Persona(long pers_identificacion, String pers_nombre, String pers_apellido, String pers_direccion, String pers_email, String pers_contrasena, Integer maes_tiid, Integer maes_tise, Integer maes_tirol, Integer maes_ties) {
        this.pers_identificacion = pers_identificacion;
        this.pers_nombre = pers_nombre;
        this.pers_apellido = pers_apellido;
        this.pers_direccion = pers_direccion;
        this.pers_email = pers_email;
        this.pers_contrasena = pers_contrasena;
        this.maes_tiid = maes_tiid;
        this.maes_tise = maes_tise;
        this.maes_tirol = maes_tirol;
        this.maes_ties = maes_ties;
    }

    public void setPers_id(Integer pers_id) {
        this.pers_id = pers_id;
    }

    public long getPers_identificacion() {
        return pers_identificacion;
    }

    public void setPers_identificacion(long pers_identificacion) {
        this.pers_identificacion = pers_identificacion;
    }

    public String getPers_nombre() {
        return pers_nombre;
    }

    public void setPers_nombre(String pers_nombre) {
        this.pers_nombre = pers_nombre;
    }

    public String getPers_apellido() {
        return pers_apellido;
    }

    public void setPers_apellido(String pers_apellido) {
        this.pers_apellido = pers_apellido;
    }

    public String getPers_direccion() {
        return pers_direccion;
    }

    public void setPers_direccion(String pers_direccion) {
        this.pers_direccion = pers_direccion;
    }

    public String getPers_email() {
        return pers_email;
    }

    public void setPers_email(String pers_email) {
        this.pers_email = pers_email;
    }

    public String getPers_contrasena() {
        return pers_contrasena;
    }

    public void setPers_contrasena(String pers_contrasena) {
        this.pers_contrasena = pers_contrasena;
    }

    public Integer getMaes_tiid() {
        return maes_tiid;
    }

    public void setMaes_tiid(Integer maes_tiid) {
        this.maes_tiid = maes_tiid;
    }

    public Integer getMaes_tise() {
        return maes_tise;
    }

    public void setMaes_tise(Integer maes_tise) {
        this.maes_tise = maes_tise;
    }

    public Integer getMaes_tirol() {
        return maes_tirol;
    }

    public void setMaes_tirol(Integer maes_tirol) {
        this.maes_tirol = maes_tirol;
    }

    public Integer getMaes_ties() {
        return maes_ties;
    }

    public void setMaes_ties(Integer maes_ties) {
        this.maes_ties = maes_ties;
    }

    private static final long serialVersionUID = 1L;
}
