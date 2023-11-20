package com.example.examenblancp2021.services;

import com.example.examenblancp2021.entity.CentreCommercial;
import com.example.examenblancp2021.repositories.IBoutiqueRepository;
import com.example.examenblancp2021.repositories.ICentreCommercialRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CentreCommercialService implements ICentreCommercial{
    final ICentreCommercialRepository centreCommercialRepository;
    final IBoutiqueRepository boutiqueRepository;

    @Autowired
    public CentreCommercialService(ICentreCommercialRepository centreCommercialRepository, IBoutiqueRepository boutiqueRepository) {
        this.centreCommercialRepository = centreCommercialRepository;
        this.boutiqueRepository = boutiqueRepository;
    }

    @Override
    public void ajoutCentre(CentreCommercial centre) {
        centreCommercialRepository.save(centre);
    }
}
