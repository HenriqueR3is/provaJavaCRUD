package com.example.projetoCRUD_main.demo.service;

import com.example.projetoCRUD_main.demo.model.Trabalho;
import com.example.projetoCRUD_main.demo.repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrabalhoService {

    @Autowired
    private TrabalhoRepository trabalhoRepository;

    public Trabalho insertTrabalho(Trabalho trabalho){
        return trabalhoRepository.save(trabalho);
    }

    public List<Trabalho> selectAllTrabalho(){
        return trabalhoRepository.findAll();
    }

    // select * from trabalho where "id"=id
    public Trabalho selectTrabalhoById(int id){
        Optional<Trabalho> oc = trabalhoRepository.findById(id);
        if(oc.isPresent()){
            return oc.get();
        }else{
            throw new RuntimeException("Trabalho nao encotrado.");
        }
    }

    // status Junior -> Pleno

    public Trabalho aprovarTrabalho(int id){
        Trabalho oc = selectTrabalhoById(id);
        oc.setCargo("Pleno");
        return trabalhoRepository.save(oc);
    }

    public void deletarTrabalho(int id){
        trabalhoRepository.deleteById(id);
    }
}
