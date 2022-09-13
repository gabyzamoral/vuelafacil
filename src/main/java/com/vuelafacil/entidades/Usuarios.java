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
@Entity(name ="usuario")
public class Usuarios {

    @Id
    @Column(name = "usuaid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identificador;

    @Column(name = "tipdocid", nullable = false, length = 2)   
    private int tipoDocumento;
    
    @Column(name = "usuanombre", nullable = false, length = 50)
    private String nombre;
    
    @Column(name = "usuaapellido", nullable = false, length = 50)
    private String apellido;
    
    @Column(name = "usuadocumento", nullable = false, length = 20)
    private String documento;
    
    @Column(name = "usuadireccion", nullable = false, length = 60)
    private String direccion;
    
    @Column(name = "usuatelefono", nullable = false, length = 20)
    private String telefono;
    
    @Column(name = "usuausuario", nullable = false, length = 20)   
    private String nickUsuario;
    
    @Column(name = "usuacontrasena", nullable = false, length = 200)   
    private String password;
    
    @Column(name = "usuatipousuario", nullable = false, length = 2)   
    private int tipoUsuario;

    //@ManyToOne(fetch = FetchType.LAZY)

    public Usuarios() {
    }

    public Usuarios(int identificador, int tipoDocumento, String nombre, String apellido, String documento, String direccion, String telefono, String nickUsuario, String password, int tipoUsuario) {
        this.identificador = identificador;
        this.tipoDocumento = tipoDocumento;
        this.nombre      = nombre;
        this.apellido    = apellido;
        this.documento   = documento;
        this.direccion   = direccion;
        this.telefono    = telefono;
        this.nickUsuario = nickUsuario;
        this.password    = password;
        this.tipoUsuario = tipoUsuario;
    }

    public Usuarios(int tipoDocumento, String nombre, String apellido, String documento, String direccion, String telefono, String nickUsuario, String password, int tipoUsuario) {
        this.tipoDocumento = tipoDocumento;
        this.nombre      = nombre;
        this.apellido    = apellido;
        this.documento   = documento;
        this.direccion   = direccion;
        this.telefono    = telefono;
        this.nickUsuario = nickUsuario;
        this.password    = password;
        this.tipoUsuario = tipoUsuario;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNickUsuario(String nickUsuario) {
        this.nickUsuario = nickUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }    
    
    public int getIdentificador() {
        return identificador;
    }

    public int getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNickUsuario() {
        return nickUsuario;
    }

    public String getPassword() {
        return password;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }         
}