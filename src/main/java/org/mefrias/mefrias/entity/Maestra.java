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
import java.io.Serializable;

/**
 *
 * @author TRANQUILINO-FRIAS
 */
@Entity
@Table(name = "tabla_maestra")
public class Maestra implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maes_id;

    @Column(length = 150, nullable = false)
    private String maes_nombrelargo;

    @Column(length = 10, nullable = false)
    private String maes_nombrecorto;

    @Column( length = 100, nullable = true)
    private int maes_dependencia;

    @Column( length = 100, nullable = false)
    private int maes_estado;

    public Maestra() {
    }

    public Maestra(int maes_id, String maes_nombrelargo, String maes_nombrecorto, int maes_dependencia, int maes_estado) {
        this.maes_id = maes_id;
        this.maes_nombrelargo = maes_nombrelargo;
        this.maes_nombrecorto = maes_nombrecorto;
        this.maes_dependencia = maes_dependencia;
        this.maes_estado = maes_estado;
    }

    public Maestra(String maes_nombrelargo, String maes_nombrecorto, Integer maes_dependencia, Integer maes_estado) {
        this.maes_nombrelargo = maes_nombrelargo;
        this.maes_nombrecorto = maes_nombrecorto;
        this.maes_dependencia = maes_dependencia;
        this.maes_estado = maes_estado;
    }

    public int getMaes_id() {
        return maes_id;
    }

    public void setMaes_id(int maes_id) {
        this.maes_id = maes_id;
    }

    public String getMaes_nombrelargo() {
        return maes_nombrelargo;
    }

    public void setMaes_nombrelargo(String maes_nombreLargo) {
        this.maes_nombrelargo = maes_nombreLargo;
    }

    public String getMaes_nombrecorto() {
        return maes_nombrecorto;
    }

    public void setMaes_nombrecorto(String maes_nombreCorto) {
        this.maes_nombrecorto = maes_nombreCorto;
    }

    public int getMaes_dependencia() {
        return maes_dependencia;
    }

    public void setMaes_dependencia(int maes_dependencia) {
        this.maes_dependencia = maes_dependencia;
    }

    public int getMaes_estado() {
        return maes_estado;
    }

    public void setMaes_estado(Integer maes_estado) {
        this.maes_estado = maes_estado;
    }

    private static final long serialVersionUID = 1L;
    
}
