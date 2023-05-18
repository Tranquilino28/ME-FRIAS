/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mefrias.mefrias.repositorios;

import org.mefrias.mefrias.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author TRANQUILINO-FRIAS
 */

public interface Inface_personarepositorio extends JpaRepository<Persona,Integer> {
    
}
