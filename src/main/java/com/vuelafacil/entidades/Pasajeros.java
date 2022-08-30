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

@Entity(name ="pasaid")
public class Pasajeros {
    @Id
    @Column(name = "pasaid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pasaid;
    
    
    @Column(name = "pasanombre", nullable = false, length = 100)    
    private String nombres;
    
    @Column(name = "pasaapellido", nullable = false, length = 100)    
    private String apellidos;
    
    @Column(name = "pasacorreoelectronico", nullable = false, length = 100)    
    private String correoElectronico;
    
    @Column(name = "pasacelular", nullable = false, length = 100)    
    private int numCelular;


    public Pasajeros (int pasaid, String nombres, String apellidos, String correoElectronico, int numCelular){

        this.pasaid = pasaid;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.numCelular = numCelular;

    }

    public Pasajeros ( String nombres, String apellidos, String correoElectronico, int numCelular){

        
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.numCelular = numCelular;

    }

    public void setPasaid(int pasaid){
        this.pasaid = pasaid;
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
    
    public void setNumeroCelular(int numCelular){
        this.numCelular = numCelular;
    }

    public int getPasaid(){
        return this.pasaid;
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
    
    public int  getNumCelular(){
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
