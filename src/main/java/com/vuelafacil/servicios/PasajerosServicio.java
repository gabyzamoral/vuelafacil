/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil.servicios;
import com.vuelafacil.entidades.Pasajeros;
import com.vuelafacil.repositorios.IPasajerosrepository;
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
        List<Pasajeros> lista = repo.findByNombresContaining(criterio);
        return lista;
    }

    public Pasajeros consultarPasajero(int Pasaid){
        Pasajeros c = repo.findById(Pasaid).get();
        return c;
    }    
    
     public Pasajeros actualizarPasajeros(Pasajeros c){
        Pasajeros pas = repo.save(c);
        return pas;
    }
     
     public void eliminarPasajero(Pasajeros c){
         repo.deleteById(c.getPasaid());
     }
    
}
