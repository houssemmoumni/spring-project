package com.example.entityhoussem.service;

import com.example.entityhoussem.entity.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);

    Bloc updateBloc(Long id, Bloc blocDetails);

    void deleteBloc(Long id);

    Bloc getBlocById(Long id);

    List<Bloc> getAllBlocs();
}
