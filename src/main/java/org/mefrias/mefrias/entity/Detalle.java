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
@Table(name = "tabla_detalles")
public class Detalle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deta_id;

    @Column(length = 7, nullable = false)
    private String deta_codigo;

    @Column(length = 200, nullable = false)
    private String deta_detallereparacion;

    @Column(length = 40, nullable = false)
    private String deta_costoreparacion;

    @Column(length = 20, nullable = false)
    private String deta_fechaingreso;

    @Column(length = 20, nullable = false)
    private Maestra deta_fechasalida;

    @ManyToOne
    @JoinColumn(name = "maes_tiser",referencedColumnName = "maes_id")
    private Maestra maes_tiser;

    @ManyToOne
    @JoinColumn(name = "vehi_id")
    private Vehiculo vehiculo;

    @ManyToOne
    @JoinColumn(name = "empl_id")
    private Empleado empleado;

    public Detalle() {
    }

    public Detalle(Integer deta_id, String deta_codigo, String deta_detallereparacion, String deta_costoreparacion, String deta_fechaingreso, Maestra deta_fechasalida, Maestra maes_tiser, Vehiculo vehiculo, Empleado empleado) {
        this.deta_id = deta_id;
        this.deta_codigo = deta_codigo;
        this.deta_detallereparacion = deta_detallereparacion;
        this.deta_costoreparacion = deta_costoreparacion;
        this.deta_fechaingreso = deta_fechaingreso;
        this.deta_fechasalida = deta_fechasalida;
        this.maes_tiser = maes_tiser;
        this.vehiculo = vehiculo;
        this.empleado = empleado;
    }

    public Detalle(String deta_codigo, String deta_detallereparacion, String deta_costoreparacion, String deta_fechaingreso, Maestra deta_fechasalida, Maestra maes_tiser, Vehiculo vehiculo, Empleado empleado) {
        this.deta_codigo = deta_codigo;
        this.deta_detallereparacion = deta_detallereparacion;
        this.deta_costoreparacion = deta_costoreparacion;
        this.deta_fechaingreso = deta_fechaingreso;
        this.deta_fechasalida = deta_fechasalida;
        this.maes_tiser = maes_tiser;
        this.vehiculo = vehiculo;
        this.empleado = empleado;
    }

    public Integer getDeta_id() {
        return deta_id;
    }

    public void setDeta_id(Integer deta_id) {
        this.deta_id = deta_id;
    }

    public String getDeta_codigo() {
        return deta_codigo;
    }

    public void setDeta_codigo(String deta_codigo) {
        this.deta_codigo = deta_codigo;
    }

    public String getDeta_detallereparacion() {
        return deta_detallereparacion;
    }

    public void setDeta_detallereparacion(String deta_detallereparacion) {
        this.deta_detallereparacion = deta_detallereparacion;
    }

    public String getDeta_costoreparacion() {
        return deta_costoreparacion;
    }

    public void setDeta_costoreparacion(String deta_costoreparacion) {
        this.deta_costoreparacion = deta_costoreparacion;
    }

    public String getDeta_fechaingreso() {
        return deta_fechaingreso;
    }

    public void setDeta_fechaingreso(String deta_fechaingreso) {
        this.deta_fechaingreso = deta_fechaingreso;
    }

    public Maestra getDeta_fechasalida() {
        return deta_fechasalida;
    }

    public void setDeta_fechasalida(Maestra deta_fechasalida) {
        this.deta_fechasalida = deta_fechasalida;
    }

    public Maestra getMaes_tiser() {
        return maes_tiser;
    }

    public void setMaes_tiser(Maestra maes_tiser) {
        this.maes_tiser = maes_tiser;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    private static final long serialVersionUID = 1L;

}
