/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mefrias.mefrias.repositorios;

import org.mefrias.mefrias.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author TRANQUILINO-FRIAS
 */

public interface Empl_interRepository 
        extends JpaRepository<Empleado,Integer> {
    
}
