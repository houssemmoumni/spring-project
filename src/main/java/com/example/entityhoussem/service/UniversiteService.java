package com.example.entityhoussem.service;

import com.example.entityhoussem.entity.Foyer;
import com.example.entityhoussem.entity.Universite;
import com.example.entityhoussem.repositories.FoyerRepositories;
import com.example.entityhoussem.repositories.UniversiteRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversiteService implements IUniversiteService {

    @Autowired
    private UniversiteRepositories universiteRepositories;

    @Autowired
    private FoyerRepositories foyerRepositories;

    // Get all Universites
    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepositories.findAll();
    }

    // Get Universite by ID
    @Override
    public Universite getUniversiteById(Long id) {
        return universiteRepositories.findById(id)
                .orElseThrow(() -> new RuntimeException("Universite not found with id: " + id));
    }

    // Save a new Universite
    @Override
    public Universite saveUniversite(Universite universite) {
        return universiteRepositories.save(universite);
    }

    // Update an existing Universite
    @Override
    public Universite updateUniversite(Long id, Universite universite) {
        if (universiteRepositories.existsById(id)) {
            universite.setIdUniversite(id);
            return universiteRepositories.save(universite);
        } else {
            throw new RuntimeException("Universite not found with id: " + id);
        }
    }

    // Delete Universite by ID
    @Override
    public void deleteUniversite(Long id) {
        universiteRepositories.deleteById(id);
    }

    // Assign a Foyer to a Universite
    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Optional<Universite> universiteOpt = universiteRepositories.findByNomUniversite(nomUniversite);
        Optional<Foyer> foyerOpt = foyerRepositories.findById(idFoyer);

        if (universiteOpt.isPresent() && foyerOpt.isPresent()) {
            Universite universite = universiteOpt.get();
            Foyer foyer = foyerOpt.get();
            universite.setFoyer(foyer); // Assuming Universite has a Foyer field with a setter
            return universiteRepositories.save(universite);
        } else {
            throw new RuntimeException("Foyer or Universite not found");
        }
    }
}
