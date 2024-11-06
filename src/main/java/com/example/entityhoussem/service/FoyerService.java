package com.example.entityhoussem.service;

import com.example.entityhoussem.entity.Foyer;
import com.example.entityhoussem.repositories.FoyerRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoyerService implements IFoyerService {

    @Autowired
    private FoyerRepositories foyerRepositories;

    // Get all Foyers
    @Override
    public List<Foyer> getAllFoyers() {
        return foyerRepositories.findAll();
    }

    // Get a Foyer by ID
    @Override
    public Foyer getFoyerById(Long id) {
        Optional<Foyer> foyer = foyerRepositories.findById(id);
        if (foyer.isPresent()) {
            return foyer.get();
        } else {
            throw new RuntimeException("Foyer not found with id: " + id);
        }
    }

    // Add a new Foyer
    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepositories.save(foyer);
    }

    // Update an existing Foyer
    @Override
    public Foyer updateFoyer(Long id, Foyer foyer) {
        Optional<Foyer> existingFoyer = foyerRepositories.findById(id);
        if (existingFoyer.isPresent()) {
            Foyer updatedFoyer = existingFoyer.get();
            updatedFoyer.setNomFoyer(foyer.getNomFoyer());
            updatedFoyer.setCapa(foyer.getCapa());
            return foyerRepositories.save(updatedFoyer);
        } else {
            throw new RuntimeException("Foyer not found with id: " + id);
        }
    }

    // Delete a Foyer by ID
    @Override
    public void deleteFoyer(Long id) {
        foyerRepositories.deleteById(id);
    }
}
