/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil.entidades;

/**
 *
 * @author mariojurado
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name ="rutaid")
public class Rutas {
    @Id
    @Column(name = "rutaid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rutaid;
    
    @Column(name = "rutanombre", nullable = false, length = 100)    
    private String nombreRuta;

    @Column(name = "rutacodigo", nullable = false, length = 100)
    private String codigoRuta;
    
    @Column(name = "rutaciudadorigen", nullable = false, length = 100)
    private int rutaciudadorigen;
    
    
    @Column(name = "rutaciudaddestino", nullable = false, length = 100)
    private int rutaciudaddestino;

    @Column(name = "rutafrecuencia", nullable = false, length = 100)
    private int frecuenciaRuta;

    @Column(name = "rutafechahorasalida", nullable = false, length = 100)
    private int horaSalida;

    @Column(name = "rutafechahorallegada", nullable = false, length = 100)
    private int horaLlegada;

    public Rutas (int rutaid, String nombreRuta, String codigoRuta, int rutaciudadorigen, int rutaciudaddestino, int frecuenciaRuta, int horaSalida, int horaLlegada){
        this.rutaid = rutaid;
        this.nombreRuta = nombreRuta;
        this.codigoRuta = codigoRuta;
        this.rutaciudadorigen = rutaciudadorigen;
        this.rutaciudaddestino = rutaciudaddestino;
        this.frecuenciaRuta = frecuenciaRuta;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;

    }
 
    public Rutas ( String nombreRuta, String codigoRuta, int frecuenciaRuta, int horaSalida, int horaLlegada){
        
        this.nombreRuta = nombreRuta;
        this.codigoRuta = codigoRuta;
        this.frecuenciaRuta = frecuenciaRuta;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;

    }

    public void setRutaid(int rutaid){
       this.rutaid = rutaid;
    }
    

    public void setNombreRuta(String nombreRuta){
        this.nombreRuta = nombreRuta;
    }

    public void setRutaCiudadOrigen(int rutaciudadorigen) {
        this.rutaciudadorigen = rutaciudadorigen;
    }

    public void setRutaCiudadDestino(int rutaciudaddestino) {
        this.rutaciudaddestino = rutaciudaddestino;
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

    public int getRutaid(){
        return this.rutaid;
    }
    

    public String getNombreRuta(){
        return this.nombreRuta;
    }

    public String getCodigoRuta(){
        return this.codigoRuta;
    }

    public int getRutaCiudadOrigen() {
        return rutaciudadorigen;
    }

    public int getRutaCiudadDestino() {
        return rutaciudaddestino;
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


