/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.Cinelitas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author johan
 */
@Entity
@Table(name="sala")
public class Sala implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long num_sala;
    private String peli_muestra;

    public long getNum_sala() {
        return num_sala;
    }

    public void setNum_sala(long num_sala) {
        this.num_sala = num_sala;
    }

    public String getPeli_muestra() {
        return peli_muestra;
    }

    public void setPeli_muestra(String peli_muestra) {
        this.peli_muestra = peli_muestra;
    }
    
    
    
}
