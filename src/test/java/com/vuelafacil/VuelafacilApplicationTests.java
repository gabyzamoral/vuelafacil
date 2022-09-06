package com.vuelafacil;

import com.vuelafacil.entidades.Ciudad;
import com.vuelafacil.servicios.CiudadServicio;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VuelafacilApplicationTests {

    @Autowired
    private CiudadServicio servicio;
    
    
    @Test
    @Disabled     
    void probarSiSeCreaUnaNuevaCiudad(){
        Ciudad c = new Ciudad("Bucaramanga", "PaloNegro", "BUC", true);
        Assertions.assertDoesNotThrow(() -> servicio.crearNuevaCiudad(c), " Error al guardar nueva ciudad. " );
        servicio.crearNuevaCiudad(c);
        
    }
    
    @Test
    @Disabled
    void probarSiEncuentraBucaramangaEnCiudad(){
        List<Ciudad> listado = servicio.consultarCiudad("Bucaramanga");
        Assertions.assertTrue(listado.size() > 0, "Error, no se encontró ciudad con la palabra Bucaramanga");
    }
    
    
    @Test
    @Disabled
    
    void probrarSiEncuentroCategoriaConId1(){
        Ciudad encontrado = servicio.consultarCiudad(1);
        Assertions.assertNotNull(encontrado, "Error, no se encontró categoria con id 1 ");
    }
    
    @Test
    
    void porbrarSiSeActualizanCiudades(){
        Ciudad actualizada = servicio.actualizarCiudad(1);
    }
}
