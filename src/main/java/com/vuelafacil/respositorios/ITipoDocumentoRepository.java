package com.vuelafacil.respositorios;

import com.vuelafacil.entidades.TipoDocumento;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoDocumentoRepository extends JpaRepository<TipoDocumento, Integer>  {
    public List<TipoDocumento> findByNombreContaining(String criterio);    
}