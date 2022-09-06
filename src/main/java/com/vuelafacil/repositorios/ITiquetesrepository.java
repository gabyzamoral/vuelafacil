/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vuelafacil.repositorios;
import com.vuelafacil.entidades.Tiquetes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author mariojurado
 */
public interface ITiquetesrepository extends JpaRepository<Tiquetes, Integer> {
    public List<Tiquetes> findByTiquclasepreferencialContaining(String criterio);
}
