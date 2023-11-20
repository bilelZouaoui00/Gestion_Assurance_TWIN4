package com.example.examenblancp2021.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Setter
@Getter
public class Contrat  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat;
    private String matricule;
    private LocalDate dateEffet;
    private TypeContrat type;
    @OneToMany(mappedBy = "contrat")
    private List<Assurance> assurances;

}
