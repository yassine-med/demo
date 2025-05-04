package com.example.demo.services;

import com.example.demo.models.BienImmobilier;
import com.example.demo.repositories.BienImmobilierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BienImmobilierService {

    @Autowired
    private BienImmobilierRepository bienImmobilierRepository;

    public List<BienImmobilier> allBiensImmobilierService() {
        return bienImmobilierRepository.findAll();
    }
}
