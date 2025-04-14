package com.example.projetoCRUD_main.demo.service;

import com.example.projetoCRUD_main.demo.model.Pessoa;
import com.example.projetoCRUD_main.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    public Pessoa findById(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }

    public Pessoa save(Pessoa product) {
        return pessoaRepository.save(product);
    }

    public void deleteById(Long id) {
        pessoaRepository.deleteById(id);
    }
}
