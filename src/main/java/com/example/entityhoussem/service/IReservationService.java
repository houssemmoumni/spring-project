package com.example.entityhoussem.service;

import com.example.entityhoussem.entity.Reservation;

import java.util.List;

public interface IReservationService {

    List<Reservation> getAllReservations();  // Method to get all reservations
    Reservation getReservationById(String id); // Optional method for getting reservation by ID
    Reservation saveReservation(Reservation reservation); // Optional for saving a new reservation
    Reservation updateReservation(String id, Reservation reservation); // Optional for updating an existing reservation
    void deleteReservation(String id); // Optional for deleting a reservation
}
