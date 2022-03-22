/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rafael.classes;

import java.util.Scanner;

/**
 *
 * @author pozze
 */
public class Main {
  


public static void main(String[] args) {
        
        Pessoa pessoa =new Pessoa(0, 0);
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Calcule seu IMC:");
         
        
        System.out.println("Digite seu peso: ");
        pessoa.setPeso(ler.nextDouble());
        
        System.out.println("Digite sua altura: ");
        pessoa.setAltura(ler.nextDouble());
        
        System.out.println( pessoa.toString()); 
    }
    
}

