package com.example.entityhoussem.service;

import com.example.entityhoussem.entity.Bloc;
import com.example.entityhoussem.repositories.BlocRepositories;
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
public class BlocService implements IBlocService {
    BlocRepositories blocRepositories;
    ChambreRepositories chambreRepositories;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepositories.save(bloc);
    }

    @Override
    public Bloc updateBloc(Long id, Bloc blocDetails) {
        Optional<Bloc> optionalBloc = blocRepositories.findById(id);
        if (optionalBloc.isPresent()) {
            Bloc existingBloc = optionalBloc.get();
            existingBloc.setNameBloc(blocDetails.getNameBloc());
            existingBloc.setCapaciteBloc(blocDetails.getCapaciteBloc());
            // Update other fields if needed
            return blocRepositories.save(existingBloc);
        }
        return null; // Ensure it returns null if the Bloc is not found (like your friend's code).
    }

    @Override
    public void deleteBloc(Long id) {
        blocRepositories.deleteById(id); // No check if exists (like your friend's code).
    }

    @Override
    public Bloc getBlocById(Long id) {
        return blocRepositories.findById(id).orElse(null); // Return null if not found (like your friend's code).
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepositories.findAll(); // Return all blocs (like your friend's code).
    }
}
