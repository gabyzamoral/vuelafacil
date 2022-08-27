/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil.entidades;

/**
 *
 * @author mariojurado
 */
public class Vuelos {
    private String namCiudadOrigen;
    private String namCiudadDestino;
    private String nombrePiloto;
    private String  nombreCopiloto;
    private String  [] azafatas;
    private String  [] pasajeros;
    
    public Vuelos(String namCiudadOrigen, String namCiudadDestino, String nombrePiloto, String nombreCopiloto, String [] azafatas, String [] pasajeros){
        this.namCiudadOrigen = namCiudadOrigen;
        this.namCiudadDestino = namCiudadDestino;
        this.nombrePiloto = nombrePiloto;
        this.nombreCopiloto = nombreCopiloto;
        this.azafatas = azafatas;
        this.pasajeros = pasajeros;
    }

    public void setNamCiudadOrigen(String nombreCiudad){
        this.namCiudadOrigen = namCiudadOrigen;
    }

    public void setNamCiudadDestino(String namCiudadDestino){
        this.namCiudadDestino = namCiudadDestino;
    }

    public void setNombrePiloto(String nombrePiloto){
        this.nombrePiloto = nombrePiloto;
    }

    public void setNombreCopiloto(String nombreCopiloto){
        this.nombreCopiloto = nombreCopiloto;
    }

    public void setAzafatas(String [] azafatas){
        this.azafatas = azafatas;
    }

    public void setPasajeros(String [] pasajeros){
        this.pasajeros = pasajeros;
    }

    public String getNamCiudadOrigen(){
        return this.namCiudadOrigen;
    }

    public String getNamCiudadDestino(){
        return this.namCiudadDestino;
    }

    public String getNombrePiloto(){
        return this.nombrePiloto;
    }

    public String getNombreCopiloto(){
        return this.nombreCopiloto;
    }

    public String [] getAzafatas(){
        return this.azafatas;
    }

    public String [] getPasajeros(){
        return this.pasajeros;
    }

}
