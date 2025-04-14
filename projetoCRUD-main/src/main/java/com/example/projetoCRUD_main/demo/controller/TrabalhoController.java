package com.example.projetoCRUD_main.demo.controller;


import com.example.projetoCRUD_main.demo.model.Trabalho;
import com.example.projetoCRUD_main.demo.service.TrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trabalho")
public class TrabalhoController {

    @Autowired
    private TrabalhoService trabalhoService;

    @PostMapping
    public Trabalho criarTrabalho(@RequestBody Trabalho trabalho){
        return trabalhoService.insertTrabalho(trabalho);
    }

    @GetMapping
    public List<Trabalho> listarTrabalho(){
        return trabalhoService.selectAllTrabalho();
    }

    @PutMapping("/{id}/aprovar")
    public Trabalho aprovarTrabalho(@PathVariable int id){
        return trabalhoService.aprovarTrabalho(id);
    }

    @GetMapping("/{id}")
    public Trabalho buscarById(@PathVariable int id){
        return trabalhoService.selectTrabalhoById(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        trabalhoService.deletarTrabalho(id);
    }
}
