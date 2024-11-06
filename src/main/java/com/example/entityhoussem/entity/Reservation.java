package com.example.entityhoussem.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use this for auto-generating IDs if needed
    private String idReservation;

    private Date anneeUniversite;
    private Boolean estvalide;

    @ManyToOne
    @JoinColumn(name = "chambre_id") // This column will hold the reference to the Chambre
    private Chambre chambre; // Add this field to resolve the mappedBy issue

    // Getters and Setters
    public String getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public Date getAnneeUniversite() {
        return anneeUniversite;
    }

    public void setAnneeUniversite(Date anneeUniversite) {
        this.anneeUniversite = anneeUniversite;
    }

    public Boolean getEstvalide() {
        return estvalide;
    }

    public void setEstvalide(Boolean estvalide) {
        this.estvalide = estvalide;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }
}
