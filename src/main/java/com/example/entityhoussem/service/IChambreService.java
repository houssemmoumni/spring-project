package com.example.entityhoussem.service;

import com.example.entityhoussem.entity.Chambre;
import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Long id, Chambre chambre);
    void deleteChambre(Long id);
    Chambre getChambreById(Long id);
    List<Chambre> getAllChambres();
}
