package com.example.examenblancp2021.Controller;

import com.example.examenblancp2021.entity.CentreCommercial;
import com.example.examenblancp2021.services.CentreCommercialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/centres")
public class CentreCommercialController {
    private final CentreCommercialService centreCommercialService;
    @Autowired
    public CentreCommercialController(CentreCommercialService centreCommercialService) {
        this.centreCommercialService = centreCommercialService;
    }

    @PostMapping
    public void ajoutCentreCommercial(@RequestBody CentreCommercial centreCommercial) {
        centreCommercialService.ajoutCentre(centreCommercial);
    }
}
