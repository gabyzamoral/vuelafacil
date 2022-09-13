
package com.vuelafacil.controladores;
import com.vuelafacil.entidades.Usuarios;
import com.vuelafacil.entidades.TipoDocumento;
import com.vuelafacil.servicios.UsuarioServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioContoller {
    @Autowired
    private UsuarioServicios servicio;    

    @GetMapping("/usuario")
    public String cargarListaUsuarios(Model model, @RequestParam(value="criterio", required=false) String criterio){
        if (criterio == null){
            model.addAttribute("usuarios", servicio.consultarUsuarios());
        }
        else {
            model.addAttribute("usuarios", servicio.consultarUsuarios(criterio));
            model.addAttribute("criterio", criterio);
        }

        return "usuario/list";
    }
    
    @PostMapping("/usuario")
    public String guardarUsuario(@ModelAttribute ("usuario") Usuarios c){
        servicio.crearUsuario(c);
        return "redirect:/usuario";
    }
    
    @GetMapping("/usuario/form")
    public String cargarFormNuevoUsuario(Model modelo){
        Usuarios c = new Usuarios();
       //TipoDocumento td = new TipoDocumento();
        modelo.addAttribute("usuario", c);
        //modelo.addAttribute("tipoDocumento", td);
        return "usuario/frm";
    }
    
    @GetMapping("/usuario/form/{id}")
    public String actualizarUsuario( Model modelo, @PathVariable int id){
        Usuarios c = servicio.consultarUsuario(id);
        modelo.addAttribute("usuario", c);
        return "usuario/frm";
    }
}
