package com.example.demo.controllers;

import com.example.demo.models.BienImmobilier;
import com.example.demo.services.BienImmobilierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BienImmobilierController {

    @Autowired
    private BienImmobilierService bienImmobilierService;

    @GetMapping("/biensImmobilier")
    public List<BienImmobilier> allBiensImmobilier() {

        List<BienImmobilier> bienImmobilierList = bienImmobilierService.allBiensImmobilierService();

        return bienImmobilierList;
    }
}
