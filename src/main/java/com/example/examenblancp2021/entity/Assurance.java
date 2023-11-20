package com.example.examenblancp2021.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Setter
@Getter
public class Assurance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  idAssurance;
    private String designation;
    private float montant;

    @ManyToOne
    @JoinColumn(name = "beneficiaire_id")
    private Beneficiaire beneficiaire;

    @ManyToOne
    @JoinColumn(name = "contrat_id")
    private Contrat contrat;
}
