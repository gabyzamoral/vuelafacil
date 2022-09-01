package com.vuelafacil;

import com.vuelafacil.entidades.Ciudad;
import com.vuelafacil.servicios.CiudadServicio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VuelafacilApplicationTests {

        @Autowired
        private CiudadServicio servicio;
	@Test
	void probarSiSeCreaUnaNuevaCategoria() {
            Ciudad c = new Ciudad("Bucaramanga","PaloNegro", "BUC", true );
            Ciudad guardado = servicio.crearNuevaCiudad(c);
            Assertions.assertTrue(guardado.getIdentificador() >0, "Eror, no se guardo el nuevoo objeto");
	}

}
