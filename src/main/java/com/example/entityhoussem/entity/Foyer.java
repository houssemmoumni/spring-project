package com.example.entityhoussem.entity;

import jakarta.persistence.*;

@Entity
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long capa;

    @OneToOne(mappedBy = "foyer") // Bidirectional mapping
    private Universite universite;

    // Constructors, getters, and setters
    public Foyer() {}

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

    public Universite getUniversite() {
        return universite;
    }

    public void setUniversite(Universite universite) {
        this.universite = universite;
    }
}
