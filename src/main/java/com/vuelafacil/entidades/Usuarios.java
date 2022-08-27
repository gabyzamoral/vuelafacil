/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuelafacil.entidades;

/**
 *
 * @author mariojurado
 */
public class Usuarios {
    private String nombreAdministrador;
    private String nombreUsuario;
    private String contraseñaAdm;
    private String contraseñaUsuario;

        public  Usuarios(String nombreAdministrador, String nombreUsuario, String contraseñaAdm, String contraseñaUsuario){
            this.nombreAdministrador = nombreAdministrador;
            this.nombreUsuario = nombreUsuario;
            this.contraseñaAdm = contraseñaAdm;
            this.contraseñaUsuario = contraseñaUsuario;

        }
    
        public void setNombreAdministrador(String nombreAdministrador){
            this.nombreAdministrador = nombreAdministrador;
        }

        public void setNombreUsuario(String nombreUsuario){
            this.nombreUsuario = nombreUsuario;
        }

        public void setContraseñaAdm(String contraseñaAdm){
            this.contraseñaAdm = contraseñaAdm;
        }

        public void setContraseñaUsuario(String contraseñaUsuario){
            this.contraseñaUsuario = contraseñaUsuario;
        }


        public String getNombreAdministrador(String nombreAdministrador){
            return this.nombreAdministrador;
        }

        public String getNombreUsuario(String nombreUsuario){
            return this.nombreUsuario;
        }

        public String getContraseñaAdm(String contraseñaAdm){
            return this.contraseñaAdm;
        }
        
        public String getContraseñaUsuario(String contraseñaUsuario){
            return this.contraseñaUsuario;
        }
        
}
