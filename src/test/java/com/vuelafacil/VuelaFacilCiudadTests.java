package com.vuelafacil;

import com.vuelafacil.entidades.Ciudad;
import com.vuelafacil.servicios.CiudadServicio;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;

@SpringBootTest
class VuelaFacilCiudadTests {

    @Autowired
    private CiudadServicio servicios;
    
    // Pruebas de creación 
    
    @Test
    @Disabled     
    void probarSiSeCreaUnaNuevaCiudad(){
        Ciudad c = new Ciudad("Bucaramanga", "PaloNegro", "BUC", true);
        Assertions.assertDoesNotThrow(() ->{ 
                servicios.crearNuevaCiudad(c);
            }," Error al guardar nueva ciudad. ");   
    }
    
    @Test 
    @Disabled //No se probó         
    void probarSiNoSeCreUnaCiudadRepetida(){
        Ciudad c = new Ciudad ("Bucaramanga", "PaloNegro", "BUC", true);
        Assertions.assertThrows(DataIntegrityViolationException.class, () -> {
            servicios.crearNuevaCiudad(c);
        }, "Se esperaba error de violacion de integridad");
    }
    
    @Test
    @Disabled //No se probó          
    void probarSiNoSeCreUnaCiudadNoValida(){
        Ciudad c = new Ciudad (null, "PaloNegro", null, true);
        Assertions.assertThrows(DataIntegrityViolationException.class, () -> {
            servicios.crearNuevaCiudad(c);
        }, "Se esperaba error de violacion de integridad");
    }
    
    // Pruebas de busqueda
    
    @Test
    @Disabled // no se probó 
    void probarSiEncuentraCiudad(){
        List<Ciudad> listado = servicios.consultarCiudad();
        Assertions.assertTrue(listado.size() > 0, "No se encontraron ciudades");
    }   
    
    
    @Test
    @Disabled
    void probarSiEncuentraBucaramangaEnCiudad(){
        List<Ciudad> listado = servicios.consultarCiudad("Bucaramanga");
        Assertions.assertTrue(listado.size() > 0, "Error, no se encontró ciudad con la palabra Bucaramanga");
    }
    
    @Test
    @Disabled // no se probó
    void probarSiNoEncuentraBogotaEnCiudad(){
        List<Ciudad> listado = servicios.consultarCiudad("Bogota");
        Assertions.assertTrue(listado.isEmpty(), "Se encontró ciudad Bogotá que no existe");
    }
    
    
    @Test
    @Disabled
    
    void probrarSiEncuentroCategoriaConId1(){
        Ciudad encontrado = servicios.consultarCiudad(1);
        Assertions.assertNotNull(encontrado, "No se encontró pasajero con id 1 ");
    }

    @Test
    @Disabled // no se probó 
    
    void probrarSiNoEncuentroCategoriaConId1(){
        Ciudad encontrado = servicios.consultarCiudad(1000000);
        Assertions.assertNotNull(encontrado, "Se econtró Ciudad con id 1000000 que no existe ");
    }
    
    @Test
    @Disabled // no se probó         
    void probarSiActualizoUnaCiudad(){
        Ciudad encontrado = servicios.consultarCiudad(1);
        boolean valorInicial = encontrado.getEstadoAeropuerto();
        encontrado.setEstadoAeropuerto(!valorInicial);
        servicios.actualizarCiudad(encontrado);
        Ciudad actualizado = servicios.consultarCiudad(1);
        Assertions.assertEquals(actualizado, !valorInicial, "No se actualizó la ciudad 1" );
    }
    
    // ESpacio para deshabilitar ciudad 
    
    @Test
    @Disabled
    void probrarSiSeInhabilitaCiudad(){
        Ciudad guardado = servicios.inhabilitarCiudad(1, true);
        Assertions.assertTrue(guardado.getEstadoAeropuerto() == true, " Error al inhabilitar la categoria");
    }
    
    // Fin de pruebas Ciudad
    

    
    // Inicio pruebas Rutas
    
    
    
    
}
