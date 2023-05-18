/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.mefrias.mefrias.repositorios;

import java.util.List;
import org.mefrias.mefrias.entity.Maestra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author TRANQUILINO-FRIAS
 */
public interface Maes_interRepository extends
        JpaRepository<Maestra, Integer> {

    @Query("SELECT tm FROM Maestra tm WHERE tm.maes_dependencia IS NULL")
    List<Maestra> maesTipos();

    @Query("SELECT t FROM Maestra t WHERE t.maes_dependencia = (SELECT m.maes_id FROM Maestra m WHERE m.maes_nombrecorto = 'TIROL')")
    List<Maestra> maesTipoRol();

    @Query("SELECT t FROM Maestra t WHERE t.maes_dependencia = (SELECT m.maes_id FROM Maestra m WHERE m.maes_nombrecorto = 'TISE')")
    List<Maestra> maesTipoSexo();

    @Query("SELECT t FROM Maestra t WHERE t.maes_dependencia = (SELECT m.maes_id FROM Maestra m WHERE m.maes_nombrecorto = 'TIES')")
    List<Maestra> maesTipoEstado();

    @Query("SELECT t FROM Maestra t WHERE t.maes_dependencia = (SELECT m.maes_id FROM Maestra m WHERE m.maes_nombrecorto = 'TIID')")
    List<Maestra> maesTipoIdentificasion();

    @Query("SELECT t FROM Maestra t WHERE t.maes_dependencia = (SELECT m.maes_id FROM Maestra m WHERE m.maes_nombrecorto = 'TIESP')")
    List<Maestra> maesTipoEspecialidad();
    
    @Query("SELECT t FROM Maestra t WHERE t.maes_dependencia = (SELECT m.maes_id FROM Maestra m WHERE m.maes_nombrecorto = 'TIVE')")
    List<Maestra> maesTipoVehiculo();

    /*   @Query("SELECT m FROM Maestra m WHERE m.maes_dependencia IS NULL")
    List<Maestra> findRegistrosPrincipales();

    @Query("SELECT t FROM TablaMaestra t WHERE t.maes_dependencia = :dependenciaId")
    List<Maestra> findRegistrosPorDependencia(@Param("dependenciaId") Integer dependenciaId);
     */
}
