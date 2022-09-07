/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil;

import com.vuelafacil.entidades.Pasajeros;
import com.vuelafacil.servicios.PasajerosServicio;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author mariojurado
 */
public class VuelaFacilPasajerosTests {
       // Inicio pruebas pasajeros
    
        @Autowired
        private PasajerosServicio servicio;
    
    @Test    
    @Disabled
    void probarSiSeCreaUnPasajero(){
        Pasajeros c = new Pasajeros("Mario Andres", "Jurado Herrera", "armitxe71@hotmail.com", "3212011452");
        Assertions.assertDoesNotThrow(() -> servicio.crearNuevoPasajero(c), " Error al guardar nueva ciudad. " );
        servicio.crearNuevoPasajero(c);
    }
    
    @Test
    @Disabled
    void probarSiEncuentraMarioJuradoEnPasajeros(){
        List<Pasajeros> listado = servicio.consultarPasajero("Mario Andres");
        Assertions.assertTrue(listado.size() > 0, "Error, no se encontró pasajero con el nombre Mario Andres");
    }
    
    @Test
    @Disabled        
    void probrarSiEncuentroPasajeroConId1(){
        Pasajeros encontrado = servicio.consultarPasajero(1);
        Assertions.assertNotNull(encontrado, "Error, no se encontró pasajero con id 1 ");
    }
    
    
    // espacio para actualizar pasajero
    
    // espacio para eliminar pasajero
    
    
    
    // fin de pruebas pasajeros 
}
