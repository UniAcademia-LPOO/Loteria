package com.mycompany.loteriaprofessor.model;

import java.util.ArrayList;
/**
 *
 * @author joaod
 */
public class Cartao {
    private String numero;
    private ArrayList<Jogo> jogos;
    private Apostador dono;

    public Cartao(String numero, Apostador dono) {
        this.numero = numero;
        this.dono = dono;
        jogos = new ArrayList<>();
    }   

    public Apostador getDono() {
        return dono;
    }

    public void setDono(Apostador dono) {
        this.dono = dono;
    }

    public Cartao() {
        this("");
    }

    public Cartao(String numero) {
        this(numero, null);
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

    public void setJogos(ArrayList<Jogo> jogos) {
        this.jogos = jogos;
    }

    int quantidadeAcertos(Cartao gabarito) {
        int qtde =0;
        for (int i=0; i < jogos.size(); i++) {
            if (jogos.get(i).getRessultado() == gabarito.getJogos().get(i).getRessultado())
                qtde++;
        }return qtde;
    }
    
    
    
    
}
