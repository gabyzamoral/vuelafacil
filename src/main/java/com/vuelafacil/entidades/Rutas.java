/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil.entidades;

/**
 *
 * @author mariojurado
 */
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
    
    @Column(name = "rutaciudadorigen", nullable = false, length = 100)
    private String rutaciudadorigen;
    
    
    @Column(name = "rutaciudaddestino", nullable = false, length = 100)
    private String rutaciudaddestino;



    @Column(name = "rutafechahorasalida", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date horaSalida;

    @Column(name = "rutafechahorallegada", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date horaLlegada;

    public Rutas (int rutaid, String nombreRuta, String codigoRuta, String rutaciudadorigen, String rutaciudaddestino, Date horaSalida, Date horaLlegada){
        this.rutaid = rutaid;
        this.nombreRuta = nombreRuta;
        this.codigoRuta = codigoRuta;
        this.rutaciudadorigen = rutaciudadorigen;
        this.rutaciudaddestino = rutaciudaddestino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;

    }
 
    public Rutas ( String nombreRuta, String codigoRuta, String rutaciudadorigen, String rutaciudaddestino, Date horaSalida, Date horaLlegada){
        
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

    public void setRutaCiudadOrigen(String rutaciudadorigen) {
        this.rutaciudadorigen = rutaciudadorigen;
    }

    public void setRutaCiudadDestino(String rutaciudaddestino) {
        this.rutaciudaddestino = rutaciudaddestino;
    }

    
    public void setCodigoRuta(String codigoRuta){
        this.codigoRuta = codigoRuta;
    }



    public void setHoraSalida(Date horaSalida){
        this.horaSalida = horaSalida;
    }

    public void setHoraLlegada(Date horaLlegada){
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

    public String getRutaCiudadOrigen() {
        return rutaciudadorigen;
    }

    public String getRutaCiudadDestino() {
        return rutaciudaddestino;
    }



    public Date getHoraSalida(){
        return this.horaSalida;
    }

    public Date getHoraLlegada(){
        return this.horaLlegada;
    }

}


