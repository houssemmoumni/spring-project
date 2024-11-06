package com.example.entityhoussem.service;

import com.example.entityhoussem.entity.Universite;
import com.example.entityhoussem.repositories.UniversiteRepositories;
import com.example.entityhoussem.repositories.UniversiteRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversiteService {

    @Autowired
    private UniversiteRepositories universiteRepositories;

    // Get all Universites
    public List<Universite> getAllUniversites() {
        return universiteRepositories.findAll();
    }

    // Get Universite by ID
    public Optional<Universite> getUniversiteById(Long id) {
        return universiteRepositories.findById(id);
    }

    // Save a new Universite
    public Universite saveUniversite(Universite universite) {
        return universiteRepositories.save(universite);
    }

    // Update an existing Universite
    public Universite updateUniversite(Long id, Universite universite) {
        if (universiteRepositories.existsById(id)) {
            universite.setIdUniversite(id);
            return universiteRepositories.save(universite);
        } else {
            throw new RuntimeException("Universite not found with id: " + id);
        }
    }

    // Delete Universite by ID
    public void deleteUniversite(Long id) {
        universiteRepositories.deleteById(id);
    }
}
