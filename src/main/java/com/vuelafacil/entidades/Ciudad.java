/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author mariojurado
 */
@Entity(name ="ciudad")
public class Ciudad {
    
    @Id
    @Column(name = "ciudid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identificador;
    
    @Column(name = "ciudnombre", nullable = false, length = 80)
    private String nombreCiudad;
    
    @Column(name = "ciudnombreaeropuerto", nullable = false, length = 100)    
    private String nombreAeropuerto;

    @Column(name = "ciudcodigoaeropuerto", nullable = false, length = 3)    
    private String codigoAeropuerto;

    @Column(name = "ciudhabilitado", columnDefinition = "TinyINT")    
    private boolean estadoAeropuerto;
    
    
    
    public Ciudad(){
        
    }
    
    public Ciudad (int identificador, String nombreCiudad, String nombreAeropuerto, String codigoAeropuerto, boolean estadoAeropuerto){
        this.identificador = identificador;
        this.nombreCiudad = nombreCiudad;
        this.nombreAeropuerto = nombreAeropuerto;
        this.codigoAeropuerto = codigoAeropuerto;
        this.estadoAeropuerto = estadoAeropuerto;
    }

    public Ciudad (String nombreCiudad, String nombreAeropuerto, String codigoAeropuerto, boolean estadoAeropuerto){
        this.nombreCiudad = nombreCiudad;
        this.nombreAeropuerto = nombreAeropuerto;
        this.codigoAeropuerto = codigoAeropuerto;
        this.estadoAeropuerto = estadoAeropuerto;
    }
    //  metodos set
    
    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }
    
    public void setNombreCiudad(String nombreCiudad){
        this.nombreCiudad = nombreCiudad;
    }
    
    public void setNombreAeropuerto(String nombreAeropuerto){
        this.nombreAeropuerto = nombreAeropuerto;
    }
    
    public void setCodigoAeropuerto(String codigoAeropuerto){
        this.codigoAeropuerto = codigoAeropuerto;
    }

    public void setEstadoAeropuerto(boolean estadoAeropuerto){
        this.estadoAeropuerto = estadoAeropuerto;
    }
  
    // métodos get
    
    public int getIdentificador(){
        return this.identificador;
    }
    
    
    public String getNombreCiudad(){
        return this.nombreCiudad;
    }
    
    public String getNombreAeropuerto(){
        return this.nombreAeropuerto;
    }
    
    public String getCodigoAeropuerto(){
       return this.codigoAeropuerto;
    }
    
    public boolean getEstadoAeropuerto(){
        return this.estadoAeropuerto;
    }

    
}
    