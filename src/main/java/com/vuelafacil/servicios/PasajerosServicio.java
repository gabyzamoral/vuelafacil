/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil.servicios;
import com.vuelafacil.entidades.Pasajeros;
import com.vuelafacil.respositorios.IPasajerosrepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author mariojurado
 */
@Service
public class PasajerosServicio {
    
    @Autowired
    private IPasajerosrepository repo;
    
    public Pasajeros crearNuevoPasajero(Pasajeros c){
        Pasajeros pas = repo.save(c);
        return pas;
    }
    
    public List<Pasajeros> consultarPasajero(){
        List<Pasajeros> lista = repo.findAll();
        return lista;
    }
    
    public List<Pasajeros> consultarPasajero(String criterio){
        List<Pasajeros> lista = repo.findByNombreContaining(criterio);
        return lista;
    }    
    
     public Pasajeros actualizarPasajeros(Pasajeros c){
        Pasajeros pas = repo.save(c);
        return pas;
    }
    
}
