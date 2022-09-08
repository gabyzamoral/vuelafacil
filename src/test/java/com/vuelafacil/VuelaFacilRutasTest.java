/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil;

import com.vuelafacil.entidades.Rutas;
import com.vuelafacil.servicios.RutasServicio;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author mariojurado
 */
@SpringBootTest
public class VuelaFacilRutasTest {
    
    @Autowired
    private RutasServicio servicio;
    
    @Test
    //@Disabled     
    void probarSiSeCreaUnaRuta(){
        Rutas c = new Rutas("nameruta", "codruta", "Bucaramanga", " Bogota", LocalDateTime.of(2022,10,25,9,10,00), LocalDateTime.of(2020,10,31,9,10,00),true);
        Rutas guardado = servicio.crearNuevaRuta(c);
        Assertions.assertTrue(guardado.getRutaId() > 0 , "Error no se guardo el nuevo objeto");
        
    }    
        
    
}
