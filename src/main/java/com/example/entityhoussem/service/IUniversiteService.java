package com.example.entityhoussem.service;

import com.example.entityhoussem.entity.Universite;
import java.util.List;

public interface IUniversiteService {

    List<Universite> getAllUniversites();  // Method to get all universites

    Universite getUniversiteById(Long id); // Corrected to Long, as idUniversite is of type Long

    Universite saveUniversite(Universite universite); // Method for saving a new universite

    Universite updateUniversite(Long id, Universite universite); // Method for updating an existing universite

    void deleteUniversite(Long id); // Method for deleting a universite by ID
}
