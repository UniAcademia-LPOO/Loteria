package com.mycompany.loteriaprofessor;

import com.mycompany.loteriaprofessor.model.Apostador;
import com.mycompany.loteriaprofessor.model.Cartao;
import com.mycompany.loteriaprofessor.model.EResultado;
import com.mycompany.loteriaprofessor.model.Jogo;
import com.mycompany.loteriaprofessor.model.Loteria;
import com.mycompany.loteriaprofessor.model.Time;
import java.util.ArrayList;
import java.util.Scanner;



public class Principal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Loteria lot = new Loteria("07/05/2021", 1000000);
        
        while(true) {
            lot.addAposta( lerCartao() );
            
            System.out.println("Deseja cadastrar outro Cartão ? (S)Sim (N)Não ");
            if (scan.next().equalsIgnoreCase("n"))
                break;
        }
        
        lot.setGabarito(lerGabarito());
        
        ArrayList<Cartao> ganhadores = lot.ganhador();
        if (ganhadores.isEmpty())
            System.out.println("## Não há ganhadores");
        else 
            for (Cartao c : ganhadores) {
                System.out.println("## Ganhador : " + c.getDono().getNome() + " " + c.getNumero());
            }
        
    }
    
    
    private static Cartao lerGabarito() {
        Scanner scan = new Scanner(System.in);
        Cartao gab = new Cartao("Gabarito");
        gab.setJogos(inicializaJogos());
        System.out.println("## Informe o Gabarito : ");
        lerResultadoJogos(gab, scan);
        return gab;
        
        
    }

    private static void lerResultadoJogos(Cartao gab, Scanner scan) {
        for (Jogo jogo : gab.getJogos()){
            System.out.println(jogo.getTimeA().getTime() + " x " + jogo.getTimeB().getTime());
            int escolha = scan.nextInt();
            if (escolha==1)
                jogo.setRessultado(EResultado.Coluna_1);
            else if (escolha==2)
                jogo.setRessultado(EResultado.Coluna_2);
            else
                jogo.setRessultado(EResultado.Coluna_Meio);
            
        }
    }
    
    
    private static Cartao lerCartao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("## Informe o numero do Cartão");
        Cartao c = new Cartao(scan.nextLine());
        System.out.println("## Informe o nome do apostador ");
        Apostador ap = new Apostador(scan.nextLine());
        
        
        c.setDono(ap);
        
        c.setJogos(inicializaJogos());
        System.out.println("##Informe o resultado :\n (1)Coluna 1 (0) Coluna Meio (2) Coluna 2");        
        lerResultadoJogos(c, scan);
        
        return c;
    }

    private static ArrayList<Jogo> inicializaJogos() {
        ArrayList<Jogo> jogos = new ArrayList<>();
        jogos.add(new Jogo (new Time("São Paulo"), new Time ("Flamengo")) );
        jogos.add(new Jogo (new Time("Vasco"), new Time ("Fluminense")) );
        jogos.add(new Jogo (new Time("Palmeiras"), new Time ("Santos")) );
        jogos.add(new Jogo (new Time("Cruzeiro"), new Time ("Atletico")) );
        
        return jogos;
        
    }

    
}
