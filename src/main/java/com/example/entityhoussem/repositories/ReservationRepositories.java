package com.example.entityhoussem.repositories;

import com.example.entityhoussem.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepositories extends JpaRepository<Reservation, String> {
}
