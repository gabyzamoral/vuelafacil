/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil.servicios;
import com.vuelafacil.entidades.Rutas;
import com.vuelafacil.respositorios.IRutasrepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author mariojurado
 */
@Service
public class RutasServicio{
    @Autowired
    private IRutasrepository repo;
    
    public Rutas crearRuta(Rutas c){
        Rutas  rut =repo.save(c);
        return rut;
    }

    public List<Rutas> consultarRutas(){
        List<Rutas> lista = repo.findAll();
        return lista;
    }

    public List<Rutas> consultarRutas(String criterio){
        List<Rutas> lista = repo.findByNombreRutaContaining(criterio);
        return lista; 
    }
    
    public Rutas consultarRuta(int Rutaid){
        Rutas c = repo.findById(Rutaid).orElse(null);
        return c;
    }
 
    public Rutas actualizarRuta(Rutas c){
        Rutas rut = repo.save(c);
        return rut;
    }
    
    public Rutas inhabilitarRutas(int RutaId,boolean estado){
        Rutas c = repo.findById(RutaId).get();
        c.setEstado(estado);
        Rutas result = repo.save(c);
        return result;
    }

    /*public Object consultarRutas() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }*/
    
}
