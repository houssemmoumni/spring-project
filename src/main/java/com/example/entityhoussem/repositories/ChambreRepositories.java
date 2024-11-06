package com.example.entityhoussem.repositories;
import com.example.entityhoussem.entity.Bloc;
import com.example.entityhoussem.entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface ChambreRepositories extends JpaRepository<Chambre,Long> {


}
