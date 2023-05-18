/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.mefrias.mefrias.repositorios;

import java.util.List;
import org.mefrias.mefrias.entity.Maestra;
import org.mefrias.mefrias.entity.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author TRANQUILINO-FRIAS
 */
public interface Vehi_interRepository extends
        JpaRepository<Vehiculo, Integer> {
    
}
