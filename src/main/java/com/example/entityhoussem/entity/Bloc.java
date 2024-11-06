package com.example.entityhoussem.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;
    private String nameBloc;
    private long CapaciteBloc;

    @ManyToOne
    @JoinColumn(name="foyer_Id")
    private Foyer foyer;

    @OneToMany(mappedBy = "bloc",cascade=CascadeType.ALL)
    private List<Chambre> chambres;

    public long getIdBloc() {
        return idBloc;
    }

    public void setIdBloc(long idBloc) {
        this.idBloc = idBloc;
    }


    public String getNameBloc() {
        return nameBloc;
    }

    public void setNameBloc(String nameBloc) {
        this.nameBloc = nameBloc;
    }

    public long getCapaciteBloc() {
        return CapaciteBloc;
    }

    public void setCapaciteBloc(long capaciteBloc) {
        CapaciteBloc = capaciteBloc;
    }
}