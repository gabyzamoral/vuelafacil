
package com.vuelafacil.controladores;

import com.vuelafacil.servicios.CiudadServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Edward Henao1
 */

@Controller
public class ControladorPrincipal 
{
    @Autowired
    private CiudadServicio servicio;
    
    @GetMapping("/")
    public  String index()
    {
        return "index";
    }

    @GetMapping("/login")
    public  String login()
    {
        return "login";
    } 


    @GetMapping("/dashboard")//Ramon aqui le cambie la ruta para que me llegue al Index y no 
                         //   a la dashboard

                    

    public  String dashboard()
    {
        return "dashboard";
    }  

    @GetMapping("/salir")
    public  String salir()
    {
        return "index";
    }
    
}
