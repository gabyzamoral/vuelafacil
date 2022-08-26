
package com.vuelafacil.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorPrincipal 
{
    @GetMapping("/")//Aqui escribo la ruta para cargar la ruta base
    public  String cargarPaginaPrincipal()
    {
        return "index";
    }

    @GetMapping("/login")
    public String iniciarSesion()
    {
        return "login";
    }
}
