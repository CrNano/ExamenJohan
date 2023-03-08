/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.Cinelitas.repository;
import com.Cinelitas.Cinelitas.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author johan
 */
public interface PeliculaRepository extends CrudRepository<Pelicula,Long>{
    
    
}
