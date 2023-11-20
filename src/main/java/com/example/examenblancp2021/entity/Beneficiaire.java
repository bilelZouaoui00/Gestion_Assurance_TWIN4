package com.example.examenblancp2021.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import javax.xml.crypto.Data;
import java.util.List;

public class Beneficiaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBenef;

    private int cin;
    private String nom;
    private String prenom;
    private String proffession;
    private float salaire;

    @OneToMany(mappedBy = "beneficiaire")
    private List<Assurance> assurances;
}
