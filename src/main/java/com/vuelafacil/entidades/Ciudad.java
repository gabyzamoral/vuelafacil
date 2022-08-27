/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil.entidades;

/**
 *
 * @author mariojurado
 */
public class Ciudad {
    private String nombreCiudad;
    private String nombreAeropuerto;
    private String codigoAeropuerto;
    private boolean estadoAeropuerto;
    
    public Ciudad (String nombreCiudad, String nombreAeropuerto, String codigoAeropuerto, boolean estadoAeropuerto){
        this.nombreCiudad = nombreCiudad;
        this.nombreAeropuerto = nombreAeropuerto;
        this.codigoAeropuerto = codigoAeropuerto;
        this.estadoAeropuerto = estadoAeropuerto;
        }
    //  metodos set
    
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
    
    public String getNombreCiudad(){
        return this.nombreCiudad;
    }
    
    public String getNombrAeropuerto(){
        return this.nombreAeropuerto;
    }
    
    public String getCodigoAeropuerto(){
       return this.codigoAeropuerto;
    }       
    
}
