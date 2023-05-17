/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mefrias.mefrias;

import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.mefrias.mefrias.entity.Cliente;
import org.mefrias.mefrias.entity.Maestra;
import org.mefrias.mefrias.entity.Persona;
import org.mefrias.mefrias.repositorios.Clie_interRepository;
import org.mefrias.mefrias.repositorios.Maes_interRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.mefrias.mefrias.repositorios.Pers_interRepository;

/**
 *
 * @author TRANQUILINO-FRIAS
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback
public class PersRepositoryTest {

    @Autowired
    private Pers_interRepository persRepository;

    @Autowired
    private Clie_interRepository clieRepository;

    @Test
    public void testCrearPersona() {
   
        Persona persona = new Persona(
                90243122,
                "Manuel",
                "avellanos",
                "cll 15 #00-00",
                "ROBERTO@GMAIL.COM",
                "SAFETY",
                12 ,
                 12,
                 12,
                 12);
        // ('1122982384','TRANQUILIO','BRITTO','CMSADBLJH6','soviet@gmailcom','frias','20',14,'5',17),

        this.persRepository.save(persona);
        //Persona personaguardada = this.interpersrepository.save(new Persona(90243122,"Manuel","avellanos","cll 15 #00-00"));
        Cliente clienteGuardado = this.clieRepository.save(new Cliente(persona));
        assertThat(clienteGuardado.getClie_id()).isGreaterThan(0);
    }

}
