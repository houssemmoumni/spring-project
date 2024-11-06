package com.example.entityhoussem.repositories;

import com.example.entityhoussem.entity.Chambre;
import com.example.entityhoussem.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepositories extends JpaRepository<Etudiant, Long> {
}
