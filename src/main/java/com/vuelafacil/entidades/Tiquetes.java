/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil.entidades;

/**
 *
 * @author mariojurado
 */
public class Tiquetes {
    
    private boolean tipoClase;
    private boolean adicionalEquipaje;
    private String puertaAbordaje;
    private String puertaSalida;
    private int valorTiquete;
    
    public Tiquetes (boolean tipoClase, boolean adicionalEquipaje, String puertaAbordaje, String puertaSalida, int valorTiquete){

        this.tipoClase = tipoClase;
        this.adicionalEquipaje = adicionalEquipaje;
        this.puertaAbordaje = puertaAbordaje;
        this.puertaSalida = puertaSalida;
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
