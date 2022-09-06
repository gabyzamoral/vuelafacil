/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vuelafacil.repositorios;
import com.vuelafacil.entidades.Pasajeros;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author mariojurado
 */
@Repository
public interface IPasajerosrepository extends JpaRepository<Pasajeros, Integer> {
    public List<Pasajeros> findByNombresContaining(String criterio);
}
