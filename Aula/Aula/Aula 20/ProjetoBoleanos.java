
package projetoboleanos;

import java.util.Scanner;


public class ProjetoBoleanos {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        /*
           
        */
        int idade = 0;
        double renda = 0;
        
        System.out.println("Qual sua idade?");
        idade = leitor.nextInt();
        
        System.out.println("Qual sua renda?");
        renda = leitor.nextDouble();
        
        // Se a idade for menor 18 "MenorDeIdade" será TRUE
        // Se a idade for maior 18 "MenorDeIdade" será FALSE        
        boolean MenorDeIdade = idade<18;
        
        
        if (MenorDeIdade && renda<1000){
            System.out.println("Menor liso");
        }
        if (MenorDeIdade && renda>=1000){
            System.out.println("Maior ostentação");
        }
        
        if (!MenorDeIdade && renda<=5000){
            System.out.println("Vive normalmente");
        }
        if (!MenorDeIdade && renda>5000){
            System.out.println("Vive na ostentação");
        }
        
        
    }
    
}
