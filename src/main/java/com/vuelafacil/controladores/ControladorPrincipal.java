
package com.vuelafacil.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Edward Henao1
 */

@Controller
public class ControladorPrincipal 
{
    @GetMapping("/")
    public  String cargarPaginaPrincipal()
    {
        return "index";
    }    
}
