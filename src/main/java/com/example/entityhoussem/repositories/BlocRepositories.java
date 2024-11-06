package com.example.entityhoussem.repositories;

import com.example.entityhoussem.entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepositories extends JpaRepository<Bloc,Long> {

}
