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

@Entity(name ="pasajero")
public class Pasajeros {
    @Id
    @Column(name = "pasaid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identificador;    
    
    @Column(name = "pasanombre", nullable = false, length = 50)    
    private String nombres;
    
    @Column(name = "pasaapellido", nullable = false, length = 50)    
    private String apellidos;
    
    @Column(name = "pasacorreoelectronico", nullable = false, length = 80)    
    private String correoElectronico;
    
    @Column(name = "pasacelular", nullable = false, length = 20)    
    private String numCelular;

    public Pasajeros(){
        
    }
    
    public Pasajeros (int identificador, String nombres, String apellidos, String correoElectronico, String numCelular){
        this.identificador = identificador;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.numCelular = numCelular;
    }

    public Pasajeros ( String nombres, String apellidos, String correoElectronico, String numCelular){       
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.numCelular = numCelular;
    }

    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }
    
    public void setNombres(String nombres){
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos){
         this.apellidos = apellidos;
    }

    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }
    
    public void setNumCelular(String numCelular){
        this.numCelular = numCelular;
    }

    public int getIdentificador(){
        return this.identificador;
    }    

    public String getNombres(){
        return this.nombres;
    }
    
    public String getApellidos(){
        return this.apellidos;
    }
    
    public String getCorreoElectronico(){
        return this.correoElectronico;
    }
    
    public String  getNumCelular(){
        return this.numCelular;
    }

    public String toString() 
    {
    	return  "Nombres: " + this.nombres + "\n" +
    		    "Apellidos: " + this.apellidos + "\n" +
                "Correo Electronico: " + this.correoElectronico + "\n" +
                "Numero de celular: " + this.numCelular;
    	
    } 
}