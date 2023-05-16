/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mefrias.mefrias;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.mefrias.mefrias.entity.Persona;
import org.mefrias.mefrias.repositorios.Inface_personarepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

/**
 *
 * @author TRANQUILINO-FRIAS
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback
public class PersRepositoryTest {
    
    
    @Autowired
    private Inface_personarepositorio interpersrepository;
    
    @Test
    public void testCrearPersona(){
        Persona personaguardada = this.interpersrepository.save(new Persona("Manuel"));
        assertThat(personaguardada.getPers_id()).isGreaterThan(0);
    }
    
    
}
