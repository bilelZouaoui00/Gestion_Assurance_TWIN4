package com.example.examenblancp2021.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.List;

@Entity
@Setter
@Getter
public class Beneficiaire implements Serializable {
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
