package com.example.examenblancp2021.Controller;

import com.example.examenblancp2021.entity.Contrat;
import com.example.examenblancp2021.services.ContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contract")
public class ContratController {
    private final ContratService contratService;

    @Autowired
    public ContratController(ContratService contratService) {
        this.contratService = contratService;
    }

    @PostMapping
    public void ajoutcontract(@RequestBody Contrat contrat) {
        contratService.ajoutContract(contrat);
    }
}
