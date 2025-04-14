package com.example.projetoCRUD_main.demo.repository;

import com.example.projetoCRUD_main.demo.model.Trabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabalhoRepository extends JpaRepository<Trabalho, Integer> {
}
