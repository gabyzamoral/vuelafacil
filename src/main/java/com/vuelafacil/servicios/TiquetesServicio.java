/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil.servicios;

import com.vuelafacil.entidades.Tiquetes;
import com.vuelafacil.respositorios.ITiquetesrepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author mariojurado
 */
@Service
public class TiquetesServicio {
    @Autowired
    private ITiquetesrepository repo;

    public Tiquetes crearNuevoTiquete(Tiquetes c){
        Tiquetes  tiq =repo.save(c);
        return tiq;
    }
 
    public List<Tiquetes> consultarTiquetes(){
        List<Tiquetes> lista = repo.findAll();
        return lista;
    } 
 
    public List<Tiquetes> consultarTiquetes(String criterio){
        List<Tiquetes> lista = repo.findByTiquclasepreferencialContaining(criterio);
        return lista;
    }

    public Tiquetes consultarCiudad(int Tiquid){
        Tiquetes c = repo.findById(Tiquid).get();
        return c;
    }    

    public Tiquetes actualizarCiudad(Tiquetes c){
        Tiquetes ciu = repo.save(c);
        return ciu;
    }
    
}
