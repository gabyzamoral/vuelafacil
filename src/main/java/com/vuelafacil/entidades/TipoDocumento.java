package com.vuelafacil.entidades;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name ="tipodocumento")
public class TipoDocumento {

    @Id
    @Column(name = "tipdocid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identificador;
    
    @Column(name = "tipdocsigla", nullable = false, length = 3)    
    private String sigla;

    @Column(name = "tipdocnombre", nullable = false, length = 50)    
    private String nombre;

    public TipoDocumento(){
        
    }

    public TipoDocumento (int identificador, String sigla, String nombre){
        this.identificador = identificador;
        this.sigla = sigla;
        this.nombre = nombre;   
    }

    public TipoDocumento (String sigla, String nombre){   
        this.sigla = sigla;
        this.nombre = nombre;   
    }

    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }
    
    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getIdentificador(){
        return this.identificador;
    }   
    
    public String getSigla(){
        return this.sigla;
    }
    
    public String getNombre(){
        return this.nombre;
    }    
}