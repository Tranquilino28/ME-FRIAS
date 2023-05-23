/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mefrias.mefrias.repositorios;

import org.mefrias.mefrias.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author TRANQUILINO-FRIAS
 */
public interface Empl_interRepository
        extends JpaRepository<Empleado, Integer> {

    @Query("SELECT e FROM Empleado e INNER JOIN e.persona p WHERE p.pers_identificacion = :username AND p.pers_contrasena = :password")
    public Empleado validar_usuariocontrasena(@Param("username") Integer username, @Param("password") String password);

    /*@Query("SELECT e FROM Empleado e INNER JOIN e.persona p WHERE e.maes_identificasion = ? AND p.maes_contrasena = ?")            
    Empleado findByUsernameAndPassword(String username, String password);
     
    @Query("SELECT e FROM Empleado e INNER JOIN e.persona p WHERE p.pers_identificasion = :username AND p.pers_contrasena = :password")
Empleado validar_usuariocontrasena(@Param("username") String username, @Param("password") String password);
     */
}
