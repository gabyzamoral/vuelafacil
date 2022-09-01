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


@Entity(name ="tiquete")
public class Tiquetes {
    
    @Id
    @Column(name = "tiquid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tiquid;
    
    @Column(name = "tiquclasepreferencial", columnDefinition = "TinyINT")      
    private boolean tiquclasepreferencial;
    
    @Column(name = "tiqupuesto", nullable = false, length = 100)
    private int tiqupuesto;
  
    @Column(name = "tiqufechahoraregistro", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")    
    private Date tiqufechahoraregistro;

    public Tiquetes() {
    }

    
    
    public Tiquetes(int tiquid, boolean tiquclasepreferencial, int tiqupuesto, Date tiqufechahoraregistro) {
        this.tiquid = tiquid;
        this.tiquclasepreferencial = tiquclasepreferencial;
        this.tiqupuesto = tiqupuesto;
        this.tiqufechahoraregistro = tiqufechahoraregistro;
    }

    public Tiquetes(boolean tiquclasepreferencial, int tiqupuesto, Date tiqufechahoraregistro) {
        this.tiquclasepreferencial = tiquclasepreferencial;
        this.tiqupuesto = tiqupuesto;
        this.tiqufechahoraregistro = tiqufechahoraregistro;
    }

    public int getTiquid() {
        return tiquid;
    }

    public void setTiquid(int tiquid) {
        this.tiquid = tiquid;
    }

    public boolean isTiquclasepreferencial() {
        return tiquclasepreferencial;
    }

    public void setTiquclasepreferencial(boolean tiquclasepreferencial) {
        this.tiquclasepreferencial = tiquclasepreferencial;
    }

    public int getTiqupuesto() {
        return tiqupuesto;
    }

    public void setTiqupuesto(int tiqupuesto) {
        this.tiqupuesto = tiqupuesto;
    }

    public Date getTiqufechahoraregistro() {
        return tiqufechahoraregistro;
    }

    public void setTiqufechahoraregistro(Date tiqufechahoraregistro) {
        this.tiqufechahoraregistro = tiqufechahoraregistro;
    }

    

}
