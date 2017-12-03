
package aula16exercicio1;

import java.util.Scanner;

public class Aula16Exercicio1 {

   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual seu nome?");
        String nome = leitor.nextLine();
        
        System.out.println("Quantas vezes você quer ver seu nome?");
        int vezesnome = leitor.nextInt();
                
        int contador = 0;
        while (contador < vezesnome){
        System.out.println(nome);
        contador++; 
    }
        
        
       
    }
    
}
