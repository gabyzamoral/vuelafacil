/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil.servicios;
import com.vuelafacil.entidades.Usuarios;
import com.vuelafacil.respositorios.IUsuariorepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author mariojurado
 */
@Service
public class UsuarioServicios {
    @Autowired
    private IUsuariorepository repo;
    
    public Usuarios crearUsuario(Usuarios c){
        Usuarios  usu =repo.save(c);
        return usu;
    }
    
    public List<Usuarios> consultarUsuarios(){
        List<Usuarios> lista = repo.findAll();
        return lista;
    }     
    
   public List<Usuarios> consultarUsuarios(String criterio){
        List<Usuarios> lista = repo.findByNombreContaining(criterio);
        return lista;    
    }
   
    public Usuarios consultarUsuario(int Usuaid){
        Usuarios c = repo.findById(Usuaid).get();
        return c;
    }  
    
    public Usuarios actualizarUsuario(Usuarios c){
        Usuarios usu = repo.save(c);
        return usu;
    }
}
