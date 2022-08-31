/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil.servicios;

import com.vuelafacil.entidades.Ciudad;
import com.vuelafacil.respositorios.ICiudadrepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mariojurado
 */
@Service
public class CiudadServicio {
    
    @Autowired
    private ICiudadrepository repo;
   
    public Ciudad crearNuevaCiudad(Ciudad c){
        Ciudad  ciu =repo.save(c);
        return ciu;
    }
   
    public List<Ciudad> consultarCiudad(){
        List<Ciudad> lista = repo.findAll();
        return lista;
    }   
    
    public List<Ciudad> consultarCiudad(String criterio){
        List<Ciudad> lista = repo.findByNombreContaining(criterio);
        return lista;
    }
    public Ciudad consularltarCiudad(int ciudid){
        Ciudad c = repo.findById(ciudid).get();
        return c;
    }
    
    public void deshabilitarCiudad(Ciudad c){
        
    }
    
    public Ciudad actualizarCiudad(Ciudad c){
        Ciudad ciu = repo.save(c);
        return ciu;
    }
    
}
