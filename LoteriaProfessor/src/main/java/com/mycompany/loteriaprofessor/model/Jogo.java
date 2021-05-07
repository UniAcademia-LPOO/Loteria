package com.mycompany.loteriaprofessor.model;


public class Jogo {
    private Time timeA,timeB;
    private EResultado ressultado;

    public Jogo() {
    }

    public Jogo(Time timeA, Time timeB, EResultado ressultado) {
        this.timeA = timeA;
        this.timeB = timeB;
        this.ressultado = ressultado;
    }

    public Time getTimeA() {
        return timeA;
    }

    public void setTimeA(Time timeA) {
        this.timeA = timeA;
    }

    public Time getTimeB() {
        return timeB;
    }

    public void setTimeB(Time timeB) {
        this.timeB = timeB;
    }

    public EResultado getRessultado() {
        return ressultado;
    }

    public void setRessultado(EResultado ressultado) {
        this.ressultado = ressultado;
    }
    
    
    
    
}
