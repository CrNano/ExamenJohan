/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.Cinelitas.controller;

import com.Cinelitas.Cinelitas.entity.Pelicula;
import com.Cinelitas.Cinelitas.entity.Sala;
import com.Cinelitas.Cinelitas.service.IPeliculaService;
import com.Cinelitas.Cinelitas.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author johan
 */
@Controller
public class PeliculaController {
    @Autowired
    private IPeliculaService peliServi;
    
    @Autowired
    private ISalaService salaServi;
    
    @GetMapping("/pelicula")
    public String index(Model model){
        List<Pelicula> listaPelicula = peliServi.getAllPelicula();
        model.addAttribute("titulo", "Tabla Pelicula");
        model.addAttribute("pelicula", listaPelicula);
        return "pelicula";
    }
    
    @GetMapping("/peliculaN")
    public String crearPelicula(Model model){
        List<Sala> listaSala = salaServi.listSalas();
        model.addAttribute("titulo", new Pelicula());
        model.addAttribute("sala", listaSala);
        return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id") Long idPelicula){
        peliServi.deletePelicula(idPelicula);
        return "redirect:/pelicula";
    }
    
    @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula){
        peliServi.savePelicula(pelicula);
        return "redirect:/pelicula";
    }
    
}
