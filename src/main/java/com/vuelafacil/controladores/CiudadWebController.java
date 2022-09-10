/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil.controladores;

import com.vuelafacil.entidades.Ciudad;
import com.vuelafacil.servicios.CiudadServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mariojurado
 */

@RestController
public class CiudadWebController {
    
    @Autowired
    private CiudadServicio serv;
    
    @GetMapping("/api/ciudad")
    private ResponseEntity <List<Ciudad>> consultarCiudad(){
        return new ResponseEntity<>(serv.consultarCiudad(),HttpStatus.OK);
        
    }
}
