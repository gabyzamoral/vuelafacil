/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil;

import com.vuelafacil.entidades.Rutas;
import com.vuelafacil.servicios.RutasServicio;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
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
    
    //Pruebas de creación
    @Test
    @Disabled     
    void probarSiSeCreaUnaRuta(){
        Rutas c = new Rutas("nameruta", "codruta", "Bucaramanga", " Bogota", LocalDateTime.of(2022,10,25,9,10,00), LocalDateTime.of(2020,10,31,9,10,00),true);
        Rutas guardado = servicio.crearNuevaRuta(c);
        Assertions.assertTrue(guardado.getRutaId() > 0 , "Error no se guardo el nuevo objeto");
        
    }
    
    // pruebas de busqueda
    @Test
    @Disabled
    void probarSiEncuentraUnaRuta(){
        List<Rutas> listado = servicio.consultarRuta();
        Assertions.assertTrue(listado.size() > 0, "No se encontraron las rutas");
    } 

    @Test
    @Disabled
    void probarSiEncuentraNombreRutaEspecifica(){
        List<Rutas> listado = servicio.consultarRutas("nameruta");
        Assertions.assertTrue(listado.size() > 0, "Error, no se encontró rutas con la palabra nameruta");
    }    

    @Test
    @Disabled
    void probarSiNoEncuentraNameRuta2EnRutas(){
        List<Rutas> listado = servicio.consultarRutas("nameruta2");
        Assertions.assertTrue(listado.isEmpty(), "Se encontró ruta nameruta2 que no existe");
    }

    @Test
    @Disabled
    
    void probrarSiEncuentroRutaConId(){
        Rutas encontrado = servicio.consularltarRutas(1);
        Assertions.assertNotNull(encontrado, "No se encontró pasajero con id 1 ");
    }    
    
}
