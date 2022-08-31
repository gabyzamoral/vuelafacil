/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vuelafacil.respositorios;

import com.vuelafacil.entidades.Ciudad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mariojurado
 */
@Repository
public interface ICiudadrepository extends JpaRepository<Ciudad, Integer> {
    public List<Ciudad> findByNombreContaining(String criterio);
}
