package com.mycompany.loteriaprofessor.model;

import java.util.ArrayList;

/**
 *
 * @author joaod
 */
public class Loteria {
    private String dataLoteria;
    private double valorPremio;
    private ArrayList<Cartao> apostas;
    private Cartao gabarito;

    public Loteria() {
        this("hoje", 100000);
    }

    public Loteria(String dataLoteria, double valorPremio) {
        this(dataLoteria, valorPremio, null);
    }
    
    public Loteria(String dataLoteria, double valorPremio, Cartao gabarito) {
        this.dataLoteria = dataLoteria;
        this.valorPremio = valorPremio;
        this.gabarito = gabarito;
        apostas = new ArrayList<>();
    }

    public String getDataLoteria() {
        return dataLoteria;
    }

    public void setDataLoteria(String dataLoteria) {
        this.dataLoteria = dataLoteria;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }

    public ArrayList<Cartao> getApostas() {
        return apostas;
    }
    
    public void addAposta(Cartao cartao){
        this.apostas.add(cartao);
    }

    //public void setApostas(ArrayList<Cartao> apostas) {
    //    this.apostas = apostas;
    //}

    public Cartao getGabarito() {
        return gabarito;
    }

    public void setGabarito(Cartao gabarito) {
        this.gabarito = gabarito;
    }   
    
    public ArrayList<Cartao> ganhador(){
        ArrayList<Cartao> ganhadores = new ArrayList<>();
        for (Cartao ap : apostas) {
            if (ap.quantidadeAcertos(gabarito) == gabarito.getJogos().size())
                ganhadores.add(ap);
        }
        
        return ganhadores;
    }
    
}
