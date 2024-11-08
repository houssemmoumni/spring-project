package com.example.entityhoussem.repositories;

import com.example.entityhoussem.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UniversiteRepositories extends JpaRepository<Universite, Long> {
    Optional<Universite> findByNomUniversite(String nomUniversite);
}
