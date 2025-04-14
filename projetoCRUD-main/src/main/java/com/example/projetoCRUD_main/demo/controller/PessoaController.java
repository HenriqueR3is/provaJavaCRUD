package com.example.projetoCRUD_main.demo.controller;

import com.example.projetoCRUD_main.demo.model.Pessoa;
import com.example.projetoCRUD_main.demo.service.PessoaService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> getAllProducts() {
        return pessoaService.findAll();
    }

    @PostMapping
    public Pessoa createProduct(@RequestBody Pessoa pessoa) {
        return pessoaService.save(pessoa);
    }
}
