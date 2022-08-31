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
@Entity(name ="usuaid")
public class Usuarios {

    @Id
    @Column(name = "ciudid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usuaid;
    
    @Column(name = "usuanombre", nullable = false, length = 100)
    private String nombreUsuario;
    
    @Column(name = "usuaapellido", nullable = false, length = 100)
    private String usuaapellido;
    
    @Column(name = "usuadocumento", nullable = false, length = 100)
    private String usuadocumento;
    
    @Column(name = "usuadireccion", nullable = false, length = 100)
    private String usuadireccion;
    
    @Column(name = "usuatelefono", nullable = false, length = 100)
    private String usuatelefono;
    
    @Column(name = "usuausuario", nullable = false, length = 100)   
    private String usuausuario;
    
    @Column(name = "usuacontraseña", nullable = false, length = 100)   
    private String usuacontraseña;
    
    @Column(name = "usuatipousuario", nullable = false, length = 100)   
    private int usuatipousuario;

    public Usuarios(int usuaid, String nombreUsuario, String usuaapellido, String usuadocumento, String usuadireccion, String usuatelefono, String usuausuario, String usuacontraseña, int usuatipousuario) {
        this.usuaid = usuaid;
        this.nombreUsuario = nombreUsuario;
        this.usuaapellido = usuaapellido;
        this.usuadocumento = usuadocumento;
        this.usuadireccion = usuadireccion;
        this.usuatelefono = usuatelefono;
        this.usuausuario = usuausuario;
        this.usuacontraseña = usuacontraseña;
        this.usuatipousuario = usuatipousuario;
    }

    public Usuarios(String nombreUsuario, String usuaapellido, String usuadocumento, String usuadireccion, String usuatelefono, String usuausuario, String usuacontraseña, int usuatipousuario) {
        this.nombreUsuario = nombreUsuario;
        this.usuaapellido = usuaapellido;
        this.usuadocumento = usuadocumento;
        this.usuadireccion = usuadireccion;
        this.usuatelefono = usuatelefono;
        this.usuausuario = usuausuario;
        this.usuacontraseña = usuacontraseña;
        this.usuatipousuario = usuatipousuario;
    }

    public void setUsuaid(int usuaid) {
        this.usuaid = usuaid;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setUsuaApellido(String usuaapellido) {
        this.usuaapellido = usuaapellido;
    }

    public void setUsuaDocumento(String usuadocumento) {
        this.usuadocumento = usuadocumento;
    }

    public void setUsuaDireccion(String usuadireccion) {
        this.usuadireccion = usuadireccion;
    }

    public void setUsuaTelefono(String usuatelefono) {
        this.usuatelefono = usuatelefono;
    }

    public void setUsuausuario(String usuausuario) {
        this.usuausuario = usuausuario;
    }

    public void setUsuaContraseña(String usuacontraseña) {
        this.usuacontraseña = usuacontraseña;
    }

    public void setUsuaTipoUsuario(int usuatipousuario) {
        this.usuatipousuario = usuatipousuario;
    }
    
    
    public int getUsuaid() {
        return usuaid;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getUsuaApellido() {
        return usuaapellido;
    }

    public String getUsuaDocumento() {
        return usuadocumento;
    }

    public String getUsuaDireccion() {
        return usuadireccion;
    }

    public String getUsuaTelefono() {
        return usuatelefono;
    }

    public String getUsuaUsuario() {
        return usuausuario;
    }

    public String getUsuaContraseña() {
        return usuacontraseña;
    }

    public int getUsuaTipoUsuario() {
        return usuatipousuario;
    }
    
    
    


    
        
}
