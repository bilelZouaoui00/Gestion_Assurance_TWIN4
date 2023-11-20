package com.example.examenblancp2021.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Assurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  idAssurance;
    private String designation;
    private float montant;
}
