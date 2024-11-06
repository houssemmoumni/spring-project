package com.example.entityhoussem.service;


import com.example.entityhoussem.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Long id, Etudiant etudiant);
    void deleteEtudiant(Long id);
    Etudiant getEtudiantById(Long id);
    List<Etudiant> getAllEtudiants();
}
