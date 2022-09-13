
package com.vuelafacil.controladores;
import com.vuelafacil.entidades.Pasajeros;
import com.vuelafacil.servicios.PasajerosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PasajeroContoller {
    @Autowired
    private PasajerosServicio servicio;    

    @GetMapping("/pasajero")
    public String cargarListaPasajeros(Model model, @RequestParam(value="criterio", required=false) String criterio){
        if (criterio == null){
            model.addAttribute("pasajeros", servicio.consultarPasajero());
        }
        else {
            model.addAttribute("pasajeros", servicio.consultarPasajero(criterio));
            model.addAttribute("criterio", criterio);
        }

        return "pasajero/list";
    }
    
    @PostMapping("/pasajero")
    public String guardarPasajero(@ModelAttribute ("pasajero") Pasajeros c){
        servicio.crearPasajero(c);
        return "redirect:/pasajero";
    }
    
    @GetMapping("/pasajero/form")
    public String cargarFormNuevoPasajero(Model modelo){
        Pasajeros c = new Pasajeros(); 
        modelo.addAttribute("pasajero", c);
        return "pasajero/frm";
    }
    
    @GetMapping("/pasajero/form/{id}")
    public String actualizarPasajero( Model modelo, @PathVariable int id){
        Pasajeros c = servicio.consultarPasajero(id);
        modelo.addAttribute("pasajero", c);
        return "pasajero/frm";
    }
}
