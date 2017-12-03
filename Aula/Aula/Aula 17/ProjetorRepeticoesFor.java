
package projetorrepeticoesfor;

import java.util.Scanner;

public class ProjetorRepeticoesFor {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        // ex1: Crie um programa que exiba a frase "I love you!" 25x
        for (int contador=0; contador<25; contador++){
            System.out.println("I love you!");
        }
        
        // ex2: solicite ao usuário quantas vezes quer seu bairro
        System.out.println("Quantas vezes quer ver seu bairro ?");
        int bairro = leitor.nextInt();
        for (int contador=0; contador<bairro; contador++){
            System.out.println("Francisco Morato");
        }
           
        // ex3: exibir todos os ímpares de 0 a 100
        for (int contador=1; contador<100; contador+=2){
            System.out.println(contador);
        }
        
        // ex4: loop infinito
        for (;;){
            System.out.println("Eu deveria ser eterno se não fosse o break.....");
            break;
        }
        
        
        
    }
    
}
