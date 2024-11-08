package com.example.entityhoussem.entity;

import jakarta.persistence.*;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;
    private String nomUniversite;
    private long adresseUniversite;

    @OneToOne
    @JoinColumn(name = "foyer_id") // Foreign key column to reference Foyer
    private Foyer foyer;

    // Constructors, getters, and setters
    public Universite() {}

    public long getIdUniversite() {
        return idUniversite;
    }

    public void setIdUniversite(long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public long getAdresseUniversite() {
        return adresseUniversite;
    }

    public void setAdresseUniversite(long adresseUniversite) {
        this.adresseUniversite = adresseUniversite;
    }

    public Foyer getFoyer() {
        return foyer;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }
}
