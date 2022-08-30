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
    private int identificador;
    private String nombreCiudad;
    private String nombreAeropuerto;
    private String codigoAeropuerto;
    private boolean estadoAeropuerto;
    
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
    
    // Formato para imprimir la información
    public String toString(){
           return "Nombre Ciudad: " + this.nombreCiudad + "\n" +
                  "Nombre Aeropuerto: " + this.nombreAeropuerto + "\n" +
                  "código Aeropuerto: " + this.codigoAeropuerto + "\n" +
                  "Estado Aeropuerto: " + this.estadoAeropuerto;
    	
    }
    
}
