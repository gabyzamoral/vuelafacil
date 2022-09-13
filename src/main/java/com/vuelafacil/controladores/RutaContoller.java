
package com.vuelafacil.controladores;
import com.vuelafacil.entidades.Rutas;
import com.vuelafacil.servicios.RutasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RutaContoller {
    @Autowired
    private RutasServicio servicio;

    @GetMapping("/ruta")
    public String cargarListaRutas(Model model, @RequestParam(value="criterio", required=false) String criterio){
        if (criterio == null){
            model.addAttribute("rutas", servicio.consultarRutas());
        }
        else {
            model.addAttribute("rutas", servicio.consultarRutas(criterio));
            model.addAttribute("criterio", criterio);
        }

        return "ruta/list";
    }
    
    @PostMapping("/ruta")
    public String guardarRuta(@ModelAttribute ("ruta") Rutas c){
        servicio.crearRuta(c);
        return "redirect:/ruta";
    }
    
    @GetMapping("/ruta/form")
    public String cargarFormNuevoRuta(Model modelo){
        Rutas c = new Rutas();    
        modelo.addAttribute("ruta", c); 
        return "ruta/frm";
    }
    
    @GetMapping("/ruta/form/{id}")
    public String actualizarRuta( Model modelo, @PathVariable int id){
        Rutas c = servicio.consultarRuta(id);
        modelo.addAttribute("ruta", c);
        return "ruta/frm";
    }
}
