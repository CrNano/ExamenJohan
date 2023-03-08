/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.Cinelitas.service;

import com.Cinelitas.Cinelitas.entity.Pelicula;
import com.Cinelitas.Cinelitas.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author johan
 */
@Service
public class PeliculaService implements IPeliculaService {

    @Autowired
    private PeliculaRepository peliRepo;

    @Override
    public List<Pelicula> getAllPelicula() {
        return (List<Pelicula>) peliRepo.findAll();

    }

    @Override
    public Pelicula getPeliculaById(long id) {
        return peliRepo.findById(id).orElse(null);
        
    }

    @Override
    public void savePelicula(Pelicula pelicula) {
        peliRepo.save(pelicula);
    }

    @Override
    public void deletePelicula(long id) {
        peliRepo.deleteById(id);
    }

}
