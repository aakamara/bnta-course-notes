package com.bnta.vestservice.repositories;

import com.bnta.vestservice.models.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository <Vet, Long> {
}
