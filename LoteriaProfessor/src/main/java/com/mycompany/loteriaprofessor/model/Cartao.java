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
    }

    public Cartao(String numero, ArrayList<Jogo> jogos) {
        this.numero = numero;
        this.jogos = jogos;
    }
    
    
}
