
package com.vuelafacil.controladores;

import com.vuelafacil.servicios.CiudadServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String cargarListaCiudaddes(Model model, @RequestParam(value="criterio", required=false) String criterio){
        if (criterio == null){
                    model.addAttribute("ciudades", servicio.consultarCiudad());
        }
        else {
            model.addAttribute("ciudades", servicio.consultarCiudad(criterio));
            model.addAttribute("criterio", criterio);
        }

        return "listaciudades";
    }
    
    @GetMapping("/ciudad/form")
    public String cargarFormCiudades(){
        return "formciudades";
    }
    
}
