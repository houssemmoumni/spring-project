package com.example.entityhoussem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
@Entity

public class Reservation {
    @Id

    private String idReservation;

    private Date anneeUniversite;
    private Boolean estvalide;

}
