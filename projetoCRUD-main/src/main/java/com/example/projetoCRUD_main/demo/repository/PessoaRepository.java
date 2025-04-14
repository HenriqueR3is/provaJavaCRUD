package com.example.projetoCRUD_main.demo.repository;

import com.example.projetoCRUD_main.demo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
