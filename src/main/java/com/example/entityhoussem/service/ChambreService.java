package com.example.entityhoussem.service;

import com.example.entityhoussem.entity.Chambre;
import com.example.entityhoussem.repositories.ChambreRepositories;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChambreService implements IChambreService {
    ChambreRepositories chambreRepositories;

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepositories.save(chambre);
    }

    @Override
    public Chambre updateChambre(Long id, Chambre chambreDetails) {
        Optional<Chambre> optionalChambre = chambreRepositories.findById(id);
        if (optionalChambre.isPresent()) {
            Chambre existingChambre = optionalChambre.get();
           existingChambre.setNumeroChambre(chambreDetails.getNumeroChambre());
            existingChambre.setTypeC(chambreDetails.getTypeC());
            // Update other fields if needed
            return chambreRepositories.save(existingChambre);
        }
        return null;
    }

    @Override
    public void deleteChambre(Long id) {
        chambreRepositories.deleteById(id);
    }

    @Override
    public Chambre getChambreById(Long id) {
        return chambreRepositories.findById(id).orElse(null);
    }

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepositories.findAll();
    }
}
