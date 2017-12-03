package atividade3;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Quantas horas o carro ficou no estacionamento: ");
        double horas = leitor.nextDouble();
        
        System.out.println("Quantas minutos o carro ficou no estacionamento: ");
        double minutos = leitor.nextDouble();
        
        System.out.println("Quantas segundos o carro ficou no estacionamento: ");
        double segundos = leitor.nextDouble();
        
        System.out.println("Digite o valor da hora no estacionamento: ");
        double valor = leitor.nextDouble();
        
        double tempo =  (valor * horas) / 0.60;
        
        System.out.println(" Sr(a)" +nome+", sua conta ficou em " +tempo+".");
        
        
        
        
        
        
      
    }
    
}
