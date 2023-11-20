package com.example.examenblancp2021.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat;
    private String matricule;
    private LocalDate dateEffet;
    private TypeContrat type;
    @OneToMany(mappedBy = "contrat")
    private List<Assurance> assurances;

}
