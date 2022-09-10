/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil.entidades;

/**
 *
 * @author mariojurado
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name ="ruta")
public class Rutas {
    @Id
    @Column(name = "rutaid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rutaid;
    
    @Column(name = "rutanombre", nullable = false, length = 100)    
    private String nombreRuta;

    @Column(name = "rutacodigo", nullable = false, length = 100)
    private String codigoRuta;
    
    @Column(name = "ciudidorigen", nullable = false, length = 100)
    private int rutaciudadorigen;
    
    
    @Column(name = "ciudiddestino", nullable = false, length = 100)
    private int rutaciudaddestino;

    @Column(name = "rutahabilitado", columnDefinition = "TinyINT")
    private boolean rutahabilitado;

    @Column(name = "rutafechahorasalida", columnDefinition="TIMESTAMP")
    private LocalDateTime horaSalida;

    @Column(name = "rutafechahorallegada", columnDefinition="TIMESTAMP")
    private LocalDateTime horaLlegada;

    public Rutas(){
        
    }
            
    public Rutas (int rutaid, String nombreRuta, String codigoRuta, int rutaciudadorigen, int rutaciudaddestino, LocalDateTime horaSalida, LocalDateTime horaLlegada, boolean rutahabilitado){
        this.rutaid = rutaid;
        this.nombreRuta = nombreRuta;
        this.codigoRuta = codigoRuta;
        this.rutaciudadorigen = rutaciudadorigen;
        this.rutaciudaddestino = rutaciudaddestino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;

    }
 
    public Rutas ( String nombreRuta, String codigoRuta, int rutaciudadorigen, int rutaciudaddestino, LocalDateTime horaSalida, LocalDateTime horaLlegada, boolean rutahabilitado){
        
        this.nombreRuta = nombreRuta;
        this.codigoRuta = codigoRuta;
        this.rutaciudadorigen = rutaciudadorigen;
        this.rutaciudaddestino = rutaciudaddestino;
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

    public void setRutaHabilitado(boolean rutahabilitado) {
        this.rutahabilitado = rutahabilitado;
    }

    public void setHoraSalida(LocalDateTime horaSalida){
        this.horaSalida = horaSalida;
    }

    public void setHoraLlegada(LocalDateTime horaLlegada){
        this.horaLlegada = horaLlegada;
    }

    public int getRutaId(){
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

    public LocalDateTime getHoraSalida(){
        return this.horaSalida;
    }

    public LocalDateTime getHoraLlegada(){
        return this.horaLlegada;
    }

    public boolean isRutahabilitado() {
        return rutahabilitado;
    }
    
}