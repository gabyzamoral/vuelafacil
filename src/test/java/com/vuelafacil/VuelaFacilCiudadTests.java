package com.vuelafacil;

import com.vuelafacil.entidades.Ciudad;
import com.vuelafacil.servicios.CiudadServicio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VuelaFacilCiudadTests {

    @Autowired
    private CiudadServicio servicio;
    
    
    @Test
    @Disabled     
    void probarSiSeCreaUnaNuevaCiudad(){
        Ciudad c = new Ciudad("Bucaramanga", "PaloNegro", "BUC", true);
        Ciudad guardado = servicio.crearNuevaCiudad(c);
        Assertions.assertTrue(guardado.getIdentificador() > 0 , "Error no se guardo el nuevo objeto");
        
    }
}
