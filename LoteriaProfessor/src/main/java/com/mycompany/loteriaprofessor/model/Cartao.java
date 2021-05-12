package com.mycompany.loteriaprofessor.model;

import java.util.ArrayList;
/**
 *
 * @author joaod
 */
public class Cartao {
    private String numero;
    private ArrayList<Jogo> jogos;

    public Cartao() {
        this("");
    }

    public Cartao(String numero) {
        this.numero = numero;
        jogos = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }
    
    public void addJogo(Jogo j) {
        this.jogos.add(j);
    }

    //public void setJogos(ArrayList<Jogo> jogos) {
    //    this.jogos = jogos;
    //}
    
    
    
    
}
