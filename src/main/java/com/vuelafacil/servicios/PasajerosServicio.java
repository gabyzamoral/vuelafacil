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
    
    public Pasajeros crearPasajero(Pasajeros c){
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
        Pasajeros c = repo.findById(Pasaid).orElse(null);
        return c;
    }    
    
    public Pasajeros actualizarPasajeros(Pasajeros c){
        Pasajeros pas = repo.save(c);
        return pas;
    }    

    public Object consultarPasajeros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}