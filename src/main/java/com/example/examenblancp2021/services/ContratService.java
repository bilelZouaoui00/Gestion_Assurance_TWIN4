package com.example.examenblancp2021.services;

import com.example.examenblancp2021.entity.Contrat;
import com.example.examenblancp2021.repositories.IContratRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ContratService implements IContract {
    final IContratRepository contratRepository;

    @Autowired
    public ContratService(IContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }

    @Override
    public void ajoutContract(Contrat contrat) {
        contratRepository.save(contrat);
    }
}
