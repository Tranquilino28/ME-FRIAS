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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author TRANQUILINO-FRIAS
 */
@Entity
@Table(name = "tabla_vehiculo")
public class Vehiculo implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vehi_id;

    @Column(length = 150, nullable = false)
    private String vehi_marca;

    @Column(length = 10, nullable = false)
    private String vehi_modelo;

    @Column( length = 10, nullable = false)
    private String vehi_nplaca;

    @ManyToOne
    @JoinColumn(name="maes_id")
    private Maestra maes_tive;

    @ManyToOne
    @JoinColumn(name="clie_id")
    private Cliente cliente;

    public Vehiculo() {
    }

    public Vehiculo(Integer vehi_id, String vehi_marca, String vehi_modelo, String vehi_nplaca, Maestra maes_tive, Cliente cliente) {
        this.vehi_id = vehi_id;
        this.vehi_marca = vehi_marca;
        this.vehi_modelo = vehi_modelo;
        this.vehi_nplaca = vehi_nplaca;
        this.maes_tive = maes_tive;
        this.cliente = cliente;
    }

    public Vehiculo(String vehi_marca, String vehi_modelo, String vehi_nplaca, Maestra maes_tive, Cliente cliente) {
        this.vehi_marca = vehi_marca;
        this.vehi_modelo = vehi_modelo;
        this.vehi_nplaca = vehi_nplaca;
        this.maes_tive = maes_tive;
        this.cliente = cliente;
    }

    public Integer getVehi_id() {
        return vehi_id;
    }

    public void setVehi_id(Integer vehi_id) {
        this.vehi_id = vehi_id;
    }

    public String getVehi_marca() {
        return vehi_marca;
    }

    public void setVehi_marca(String vehi_marca) {
        this.vehi_marca = vehi_marca;
    }

    public String getVehi_modelo() {
        return vehi_modelo;
    }

    public void setVehi_modelo(String vehi_modelo) {
        this.vehi_modelo = vehi_modelo;
    }

    public String getVehi_nplaca() {
        return vehi_nplaca;
    }

    public void setVehi_nplaca(String vehi_nplaca) {
        this.vehi_nplaca = vehi_nplaca;
    }

    public Maestra getMaes_tive() {
        return maes_tive;
    }

    public void setMaes_tive(Maestra maes_tive) {
        this.maes_tive = maes_tive;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    private static final long serialVersionUID = 1L;
    
}
