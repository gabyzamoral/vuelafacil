package com.vuelafacil.servicios;

import com.vuelafacil.entidades.TipoDocumento;
import com.vuelafacil.respositorios.ITipoDocumentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoDocumentoServicio {
    
    @Autowired
    private ITipoDocumentoRepository repo;
   
    public List<TipoDocumento> listarTipoDocumentos(){
        List<TipoDocumento> lista = repo.findAll();
        return lista;
    }

    public List<TipoDocumento> consultarTipoDocumento(){
        List<TipoDocumento> lista = repo.findAll();
        return lista;
    } 
}
