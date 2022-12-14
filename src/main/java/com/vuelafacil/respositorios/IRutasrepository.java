/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vuelafacil.respositorios;
import com.vuelafacil.entidades.Rutas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author mariojurado
 */
public interface IRutasrepository extends JpaRepository<Rutas, Integer> {
    public List<Rutas> findByNombreRutaContaining(String criterio);
}
