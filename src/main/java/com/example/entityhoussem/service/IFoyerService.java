package com.example.entityhoussem.service;

import com.example.entityhoussem.entity.Foyer;

import java.util.List;

public interface IFoyerService {

    // Method to get all Foyers
    List<Foyer> getAllFoyers();

    // Method to get a Foyer by ID
    Foyer getFoyerById(Long id);

    // Method to add a new Foyer
    Foyer addFoyer(Foyer foyer);

    // Method to update an existing Foyer
    Foyer updateFoyer(Long id, Foyer foyer);

    // Method to delete a Foyer by ID
    void deleteFoyer(Long id);
}
