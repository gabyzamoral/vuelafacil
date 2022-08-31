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


@Entity(name ="tiquid")
public class Tiquetes {
    
    @Id
    @Column(name = "tiquid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tiquid;
    
    private boolean tipoClase;
    private boolean adicionalEquipaje;
    private String puertaAbordaje;
    private String puertaSalida;
    private int valorTiquete;
    
    public Tiquetes(){
    
        }
    
    public Tiquetes (int tiquid, boolean tipoClase, boolean adicionalEquipaje, String puertaAbordaje, String puertaSalida, int valorTiquete){

        this.tiquid = tiquid;
        this.tipoClase = tipoClase;
        this.adicionalEquipaje = adicionalEquipaje;
        this.puertaAbordaje = puertaAbordaje;
        this.puertaSalida = puertaSalida;
        }
    
    public Tiquetes ( boolean tipoClase, boolean adicionalEquipaje, String puertaAbordaje, String puertaSalida, int valorTiquete){

        
        this.tipoClase = tipoClase;
        this.adicionalEquipaje = adicionalEquipaje;
        this.puertaAbordaje = puertaAbordaje;
        this.puertaSalida = puertaSalida;
        }

    public void setTiquid(int tiquid) {
        this.tiquid = tiquid;
        }

    
    
    public void setTipoClase(boolean tipoClase){
        this.tipoClase = tipoClase;
        }

    public void setAdicionalEquipaje(boolean adicionalEquipaje){
        this.adicionalEquipaje = adicionalEquipaje;
        }

    public void setPuertaAbordaje(String puertaAbordaje){
        this.puertaAbordaje = puertaAbordaje;
        }

    public void setPuertaSalida(String puertaSalida){
        this.puertaSalida = puertaSalida;
        }
    
    public void setValorTiquete(int valorTiquete){
        this.valorTiquete = valorTiquete;
        }

    
    public int getTiquid() {
        return tiquid;
        }
    
    public boolean getTipoClase(){
        return this.tipoClase;
        }

    public boolean getAdicionalEquipaje(){
        return this.adicionalEquipaje;
        }

    public String getPuertaAbordaje(){
        return this.puertaAbordaje;
        }

    public String getPuertaSalida(){
        return this.puertaSalida;
        }
    
    public int getValorTiquete(){
        return this.valorTiquete;
        }


}
