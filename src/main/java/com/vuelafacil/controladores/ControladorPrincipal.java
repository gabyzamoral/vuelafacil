
package com.vuelafacil.controladores;

import com.vuelafacil.servicios.CiudadServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public  String cargarPaginaPrincipal()
    {
        return "index";
    }

    @GetMapping("/ciudad")
    public String cargarListaCiudaddes(Model model){
        model.addAttribute("ciudades", servicio.consultarCiudad());
        return "listaciudades";
    }
    
    @GetMapping("/ciudad/form")
    public String cargarFormCiudades(){
        return "formciudades";
    }
    
}
