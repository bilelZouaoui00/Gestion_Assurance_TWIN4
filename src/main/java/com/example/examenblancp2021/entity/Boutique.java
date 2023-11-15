package com.example.examenblancp2021.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Boutique implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   private String nom;
   private Categorie categorie;

    @ManyToOne
    @JoinColumn(name = "centre_commercial_id")
    private CentreCommercial centreCommercial;

    @ManyToMany
    @JoinTable(name = "boutique_client",
            joinColumns = @JoinColumn(name = "boutique_id"),
            inverseJoinColumns = @JoinColumn(name = "client_id"))
    private List<Client> clients;
}
