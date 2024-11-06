package com.example.entityhoussem.service;

import com.example.entityhoussem.entity.Etudiant;
import com.example.entityhoussem.repositories.EtudiantRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService implements IEtudiantService {

    @Autowired
    private EtudiantRepositories etudiantRepositories;

    // Get all Etudiants
    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepositories.findAll();
    }

    // Get an Etudiant by ID
    @Override
    public Etudiant getEtudiantById(Long id) {
        Optional<Etudiant> etudiant = etudiantRepositories.findById(id);
        if (etudiant.isPresent()) {
            return etudiant.get();
        } else {
            throw new RuntimeException("Etudiant not found with id: " + id);
        }
    }

    // Save a new Etudiant
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepositories.save(etudiant);
    }

    // Update an existing Etudiant
    @Override
    public Etudiant updateEtudiant(Long id, Etudiant etudiant) {
        Optional<Etudiant> existingEtudiant = etudiantRepositories.findById(id);

        if (existingEtudiant.isPresent()) {
            Etudiant updatedEtudiant = existingEtudiant.get();
            updatedEtudiant.setNomEtudiant(etudiant.getNomEtudiant());
            updatedEtudiant.setPrenomEtudiant(etudiant.getPrenomEtudiant());
            updatedEtudiant.setCinEtudiant(etudiant.getCinEtudiant());
            updatedEtudiant.setEcoleEtudiant(etudiant.getEcoleEtudiant());
            updatedEtudiant.setDateNaissance(etudiant.getDateNaissance());

            return etudiantRepositories.save(updatedEtudiant);
        } else {
            // Handle if Etudiant not found
            throw new RuntimeException("Etudiant not found with id: " + id);
        }
    }

    // Delete an Etudiant by ID
    @Override
    public void deleteEtudiant(Long id) {
        Optional<Etudiant> existingEtudiant = etudiantRepositories.findById(id);
        if (existingEtudiant.isPresent()) {
            etudiantRepositories.deleteById(id);
        } else {
            throw new RuntimeException("Etudiant not found with id: " + id);
        }
    }
}
