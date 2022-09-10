/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vuelafacil.respositorios;
import com.vuelafacil.entidades.Usuarios;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author mariojurado
 */
@Repository
public interface IUsuariorepository extends JpaRepository<Usuarios, Integer> {
    public List<Usuarios> findByNombreContaining(String criterio);
}
