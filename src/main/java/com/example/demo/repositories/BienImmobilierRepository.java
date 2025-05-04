package com.example.demo.repositories;

import com.example.demo.models.BienImmobilier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BienImmobilierRepository extends JpaRepository<BienImmobilier, Long> {

}
