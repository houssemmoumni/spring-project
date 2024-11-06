package com.example.entityhoussem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Foyer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;  // Note: Variable name convention should be 'idFoyer'
    private String nomFoyer;
    private Long capa;

    // Default constructor
    public Foyer() {
    }

    // Getters and Setters
    public Long getIdFoyer() {
        return idFoyer;
    }

    public void setIdFoyer(Long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public String getNomFoyer() {
        return nomFoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    public Long getCapa() {
        return capa;
    }

    public void setCapa(Long capa) {
        this.capa = capa;
    }
}
