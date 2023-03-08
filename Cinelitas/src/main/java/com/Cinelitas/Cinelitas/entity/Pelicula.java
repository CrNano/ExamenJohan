/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.Cinelitas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author johan
 */
@Entity
@Table(name = "pelicula")
public class Pelicula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Peli;
    private String nombre;
    private double costo_entrada;
    private String fecha;
    private int capacidad_max_personas;
    
    @ManyToOne
    @JoinColumn(name="num_sala")
    
    private Sala num_sala;

    public long getId_Peli() {
        return id_Peli;
    }

    public void setId_Peli(long id_Peli) {
        this.id_Peli = id_Peli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto_entrada() {
        return costo_entrada;
    }

    public void setCosto_entrada(double costo_entrada) {
        this.costo_entrada = costo_entrada;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCapacidad_max_personas() {
        return capacidad_max_personas;
    }

    public void setCapacidad_max_personas(int capacidad_max_personas) {
        this.capacidad_max_personas = capacidad_max_personas;
    }

    public Sala getNum_sala() {
        return num_sala;
    }

    public void setNum_sala(Sala num_sala) {
        this.num_sala = num_sala;
    }

    
    
    
}
