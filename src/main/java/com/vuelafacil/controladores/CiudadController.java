package com.vuelafacil.controladores;
import org.springframework.ui.Model;
import com.vuelafacil.entidades.Ciudad;
import com.vuelafacil.servicios.CiudadServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CiudadController {
    @Autowired
    private CiudadServicio servicio;
    
    @GetMapping("/ciudad")
    public String cargarListaCiudaddes(Model model, @RequestParam(value="criterio", required=false) String criterio){
        if (criterio == null){
                    model.addAttribute("ciudades", servicio.consultarCiudad());
        }
        else {
            model.addAttribute("ciudades", servicio.consultarCiudad(criterio));
            model.addAttribute("criterio", criterio);
        }

        return "ciudad/list";
    }
    
    @PostMapping("/ciudad")
    public String guardarCiudad(@ModelAttribute ("ciudad") Ciudad c){
        servicio.crearNuevaCiudad(c);
        return "redirect:/ciudad";
    }
    
    @GetMapping("/ciudad/form")
    public String cargarFormNuevasCiudades(Model modelo){
        Ciudad c = new Ciudad();
        modelo.addAttribute("ciudad", c);
        return "ciudad/frm";
    }
    
    @GetMapping("/ciudad/form/{id}")
    public String cargarFormCiudadExistente( Model modelo, @PathVariable int id){
        Ciudad c = servicio.consultarCiudad(id);
        modelo.addAttribute("ciudad", c);
        return "ciudad/frm";
    }    
}