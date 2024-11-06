package com.example.entityhoussem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;

    private String nomEtudiant;
    private String PrenomEtudiant;
    private long cinEtudiant;
    private String EcoleEtudiant;
    private Date dateNaissance;

    // Getter and Setter for idEtudiant
    public long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    // Getter and Setter for other fields
    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public String getPrenomEtudiant() {
        return PrenomEtudiant;
    }

    public void setPrenomEtudiant(String prenomEtudiant) {
        PrenomEtudiant = prenomEtudiant;
    }

    public long getCinEtudiant() {
        return cinEtudiant;
    }

    public void setCinEtudiant(long cinEtudiant) {
        this.cinEtudiant = cinEtudiant;
    }

    public String getEcoleEtudiant() {
        return EcoleEtudiant;
    }

    public void setEcoleEtudiant(String ecoleEtudiant) {
        EcoleEtudiant = ecoleEtudiant;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
