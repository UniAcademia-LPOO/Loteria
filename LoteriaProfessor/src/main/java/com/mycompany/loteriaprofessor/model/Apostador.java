package com.mycompany.loteriaprofessor.model;

import java.util.ArrayList;

/**
 *
 * @author joaod
 */
public class Apostador {
    private String nome;
    private ArrayList<Cartao> apostas;

    public Apostador(String nome) {
        this.nome = nome;
        apostas = new ArrayList<>();
    }

    public Apostador() {
        this("");
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Cartao> getApostas() {
        return apostas;
    }
    
    public void addAposta(Cartao cartao){  // ctrl + r select all 
        this.apostas.add(cartao);
    }

    //public void setApostas(ArrayList<Cartao> apostas) {
    //    this.apostas = apostas;
   // }
    
    
    
}


