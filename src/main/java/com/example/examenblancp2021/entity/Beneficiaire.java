package com.example.examenblancp2021.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.xml.crypto.Data;

public class Beneficiaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBenef;

    private int cin;
    private String nom;
    private String prenom;
    private String proffession;
    private float salaire;
}
