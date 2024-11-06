package com.example.entityhoussem.service;

import com.example.entityhoussem.entity.Reservation;
import com.example.entityhoussem.repositories.ReservationRepositories;
import com.example.entityhoussem.repositories.ReservationRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService implements IReservationService {

    @Autowired
    private ReservationRepositories reservationRepositories;

    // Get all reservations
    public List<Reservation> getAllReservations() {
        return reservationRepositories.findAll();
    }

    // Get a reservation by ID
    @Override
    public Reservation getReservationById(String id) {
        Optional<Reservation> reservation = reservationRepositories.findById(id);
        if (reservation.isPresent()) {
            return reservation.get();
        } else {
            throw new RuntimeException("Reservation not found with id: " + id);
        }
    }

    // Save a new reservation
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepositories.save(reservation);
    }

    // Update an existing reservation
    public Reservation updateReservation(String id, Reservation reservation) {
        if (reservationRepositories.existsById(id)) {
            reservation.setIdReservation(id);
            return reservationRepositories.save(reservation);
        } else {
            throw new RuntimeException("Reservation not found with id: " + id);
        }
    }

    // Delete a reservation by ID
    public void deleteReservation(String id) {
        reservationRepositories.deleteById(id);
    }
}
