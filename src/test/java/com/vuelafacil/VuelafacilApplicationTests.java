package com.vuelafacil;

import com.vuelafacil.entidades.Ciudad;
import com.vuelafacil.entidades.Pasajeros;
import com.vuelafacil.servicios.CiudadServicio;
import com.vuelafacil.servicios.PasajerosServicio;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VuelafacilApplicationTests {

    @Autowired
    private CiudadServicio servicios;
    
    
    @Test
    @Disabled     
    void probarSiSeCreaUnaNuevaCiudad(){
        Ciudad c = new Ciudad("Bucaramanga", "PaloNegro", "BUC", true);
        Assertions.assertDoesNotThrow(() -> servicios.crearNuevaCiudad(c), " Error al guardar nueva ciudad. " );
        servicios.crearNuevaCiudad(c);
        
    }
    
    @Test
    @Disabled
    void probarSiEncuentraBucaramangaEnCiudad(){
        List<Ciudad> listado = servicios.consultarCiudad("Bucaramanga");
        Assertions.assertTrue(listado.size() > 0, "Error, no se encontró ciudad con la palabra Bucaramanga");
    }
    
    
    @Test
    @Disabled
    
    void probrarSiEncuentroCategoriaConId1(){
        Ciudad encontrado = servicios.consultarCiudad(1);
        Assertions.assertNotNull(encontrado, "Error, no se encontró pasajero con id 1 ");
    }
    
    @Test
    @Disabled
    void probrarSiSeActualizanCiudades(){
        Ciudad actualizada = servicios.actualizarCiudad(1);
    }
    
    // ESpacio para deshabilitar ciudad 
    
    // Fin de pruebas Ciudad
    
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
    
    // fin de pruebas ciudad 
    
    // Inicio pruebas Rutas
    
    
    
    
}
