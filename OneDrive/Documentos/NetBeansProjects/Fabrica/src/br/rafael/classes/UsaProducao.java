
package br.rafael.classes;

import java.util.Scanner;

public class UsaProducao extends Producao {
    
    public static void main(String[] args) {
        
        Producao prod = new Producao(0, 0, 0);
        
        Scanner ler = new Scanner(System.in);
        
    prod.calcularHMS();
    
        System.out.println(prod.toString());
        
   System.out.println("Nome da nova peça: ");
   
        prod.setPeca(ler.nextLine());
        
    System.out.println("Segundos: ");
    
        prod.setSegundos(ler.nextInt());
        
        prod.calcularHMS();
        
        System.out.println(prod.toString());
    }  

    public UsaProducao(String peca, int segundos, int hora, int minuto, int segundo) {
        super(peca, segundos, hora, minuto, segundo);
    }
}