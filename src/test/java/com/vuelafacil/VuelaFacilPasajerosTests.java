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
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;

/**
 *
 * @author mariojurado
 */
@SpringBootTest 
class VuelaFacilPasajerosTests {
    @Autowired
    private PasajerosServicio servicio;

    @Test    
    @Disabled
    void probarSiSeCreaUnPasajero(){
        Pasajeros c = new Pasajeros("Mario Andres", "Jurado Herrera", "armitxe71@hotmail.com", "3212011452");
        Assertions.assertDoesNotThrow(() -> servicio.crearNuevoPasajero(c), " Error al guardar nuevo pasajero. " );
        servicio.crearNuevoPasajero(c);
    }
    
    @Test 
    //@Disabled //Se probó y falla, ya que, el id es diferente         
    void probarSiNoSeCreUnPasaejorRepetido(){
        Pasajeros c = new Pasajeros ("Mario Andres", "Jurado Herrera", "armitxe71@hotmail.com", "3212011452");
        Assertions.assertThrows(DataIntegrityViolationException.class, () -> {
            servicio.crearNuevoPasajero(c);
        }, "Se esperaba error de violacion de integridad");
    }    

 
    
    @Test
    //@Disabled          
    void probarSiNoSeCreUnPasajeroNoValida(){
        Pasajeros c = new Pasajeros (null, "Jurado Herrera", null, "3212011452");
        Assertions.assertThrows(DataIntegrityViolationException.class, () -> {
            servicio.crearNuevoPasajero(c);
        }, "Se esperaba error de violacion de integridad");
    }    
    
    @Test
    @Disabled
    void probarSiEncuentraMarioJuradoEnPasajeros(){
        List<Pasajeros> listado = servicio.consultarPasajero("Mario Andres");
        Assertions.assertTrue(listado.size() > 0, "Error, no se encontró pasajero con el nombre Mario Andres");
    }

    @Test
    @Disabled        
    void probrarSiEncuentroPasajeroConId(){
        Pasajeros encontrado = servicio.consultarPasajero(2);
        Assertions.assertNotNull(encontrado, "Error, no se encontró pasajero con id 1 ");
    }
    
    @Test
    @Disabled
    void probarSiNoEncuentraEdgarSantosEnPasajeros(){
        List<Pasajeros> listado = servicio.consultarPasajero("Edgar Santos");
        Assertions.assertTrue(listado.isEmpty(), "Se encontró Pasajero Edgar santos que no existe");
    }
    
    @Test
    @Disabled
    void probrarSiNoEncuentroPasajeroConId(){
        Pasajeros encontrado = servicio.consultarPasajero(10000);
        Assertions.assertNull(encontrado, "Se encontró pasajero con id 1000000 que no existe ");
    }
    
   @Test
   @Disabled         
    void probarSiActualizoUnPasajeroExistente() {
        Pasajeros encontrado = servicio.consultarPasajero(2);
        String valorInicial = encontrado.getNumCelular();
        encontrado.setNumeroCelular(valorInicial);
        servicio.actualizarPasajeros(encontrado);
        
        Pasajeros actualizado = servicio.consultarPasajero(2);
        Assertions.assertEquals(actualizado.getNumCelular(), valorInicial,  "No se actualizó hab en categoría 1");    
    }
    
    @Test
    void probarSiNoActualizoUnPasajeroExistenteConDataInvalida() {
        Pasajeros encontrado = servicio.consultarPasajero(2);
        encontrado.setNombres(null);
        Assertions.assertThrows(DataIntegrityViolationException.class, () -> {
            servicio.actualizarPasajeros(encontrado);
        }, "Se esperaba error de violación de integridad");
    }
}
