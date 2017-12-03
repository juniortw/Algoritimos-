package atividade2;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual a porcentagem de carros para novos: ");
        double novo = leitor.nextDouble();
        
        System.out.println("Qual a porcentagem de carros para usados: ");
        double usado = leitor.nextDouble();
        
        System.out.println("Salário do funcionário: ");
        double salario = leitor.nextDouble();
        
        System.out.println("Quantos carros novos e quantos usados ele vendeu: ");
        double venda = leitor.nextDouble();
        
        double porcentagem = (novo + usado) /100 * venda;  
        
        double salariofinal = porcentagem + salario;
                
        System.out.println("Seu salário bruto é "+salariofinal);
        
        
    }
    
}
