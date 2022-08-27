/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil.entidades;

/**
 *
 * @author mariojurado
 */
public class Rutas {
    private String nombreRuta;
    private String codigoRuta;
    private int frecuenciaRuta;
    private int horaSalida;
    private int horaLlegada;

    public Rutas (String nombreRuta, String codigoRuta, int frecuenciaRuta, int horaSalida, int horaLlegada){
        this.nombreRuta = nombreRuta;
        this.codigoRuta = codigoRuta;
        this.frecuenciaRuta = frecuenciaRuta;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;

    }

    public void setNombreRuta(String nombreRuta){
        this.nombreRuta = nombreRuta;
    }

    public void setCodigoRuta(String codigoRuta){
        this.codigoRuta = codigoRuta;
    }

    public void setFrecuenciaRuta(int frecuenciaRuta){
        this.frecuenciaRuta = frecuenciaRuta;
    }

    public void setHoraSalida(int horaSalida){
        this.horaSalida = horaSalida;
    }

    public void setHoraLlegada(int horaLlegada){
        this.horaLlegada = horaLlegada;
    }

    public String getNombreRuta(){
        return this.nombreRuta;
    }

    public String CodigoRuta(){
        return this.codigoRuta;
    }

    public int getFrecuenciaRuta(){
        return this.frecuenciaRuta;
    }

    public int getHoraSalida(){
        return this.horaSalida;
    }

    public int getHoraLlegada(){
        return this.horaLlegada;
    }

}


