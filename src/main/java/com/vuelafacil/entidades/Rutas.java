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
    private int identificador;
    
    @Column(name = "rutanombre", nullable = false, length = 80)    
    private String nombreRuta;

    @Column(name = "rutacodigo", nullable = false, length = 10)
    private String codigoRuta;
    
    @Column(name = "ciudidorigen", nullable = false, length = 6)
    private int ciudadOrigen;    
    
    @Column(name = "ciudiddestino", nullable = false, length = 6)
    private int ciudadDestino;

    @Column(name = "rutahabilitado", columnDefinition = "TinyINT")
    private boolean estado;

    @Column(name = "rutafechahorasalida", columnDefinition="TIMESTAMP")
    private LocalDateTime horaSalida;

    @Column(name = "rutafechahorallegada", columnDefinition="TIMESTAMP")
    private LocalDateTime horaLlegada;

    public Rutas(){
        
    }
            
    public Rutas (int identificador, String nombreRuta, String codigoRuta, int ciudadOrigen, int ciudadDestino, LocalDateTime horaSalida, LocalDateTime horaLlegada, boolean estado){
        this.identificador = identificador;
        this.nombreRuta    = nombreRuta;
        this.codigoRuta    = codigoRuta;
        this.ciudadOrigen  = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.horaSalida    = horaSalida;
        this.horaLlegada   = horaLlegada;
    }
 
    public Rutas ( String nombreRuta, String codigoRuta, int ciudadOrigen, int ciudadDestino, LocalDateTime horaSalida, LocalDateTime horaLlegada, boolean estado){
        this.nombreRuta   = nombreRuta;
        this.codigoRuta   = codigoRuta;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.horaSalida   = horaSalida;
        this.horaLlegada  = horaLlegada;
    }

    public void setIdentificador(int identificador){
       this.identificador = identificador;
    }
    
    public void setNombreRuta(String nombreRuta){
        this.nombreRuta = nombreRuta;
    }

    public void setCiudadOrigen(int ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public void setCiudadDestino(int ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }
    
    public void setCodigoRuta(String codigoRuta){
        this.codigoRuta = codigoRuta;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setHoraSalida(LocalDateTime horaSalida){
        this.horaSalida = horaSalida;
    }

    public void setHoraLlegada(LocalDateTime horaLlegada){
        this.horaLlegada = horaLlegada;
    }

    public int getIdentificador(){
        return this.identificador;
    }    

    public String getNombreRuta(){
        return this.nombreRuta;
    }

    public String getCodigoRuta(){
        return this.codigoRuta;
    }

    public int getCiudadOrigen() {
        return ciudadOrigen;
    }

    public int getCiudadDestino() {
        return ciudadDestino;
    }

    public LocalDateTime getHoraSalida(){
        return this.horaSalida;
    }

    public LocalDateTime getHoraLlegada(){
        return this.horaLlegada;
    }

    public boolean isEstado() {
        return estado;
    }
    
}