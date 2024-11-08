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

            return blocRepositories.save(existingBloc);
        }
        return null;
    }

    @Override
    public void deleteBloc(Long id) {
        blocRepositories.deleteById(id);
    }

    @Override
    public Bloc getBlocById(Long id) {
        return blocRepositories.findById(id).orElse(null);
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepositories.findAll();
    }
}
