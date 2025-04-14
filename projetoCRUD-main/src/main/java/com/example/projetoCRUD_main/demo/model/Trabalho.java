package com.example.projetoCRUD_main.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String profissao;
    private double salario;
    private String cargo = "Junior";

    public int getId() {
        return id;
    }

    public String getProfissao() {
        return profissao;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
