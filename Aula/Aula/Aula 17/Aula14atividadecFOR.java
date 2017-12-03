
package aula14atividadecfor;

import java.util.Scanner;


public class Aula14atividadecFOR {

   
    public static void main(String[] args) {
        
        
        /*
        Crie um programa que exiba a frase 
        "Somos os primeiros" 5 vezes.
        Depois a frase "somos os útimos" 5 vezes.
        E, por fim "Sou o último" 1 vez.
       */
        Scanner leitor = new Scanner(System.in);
        
        for (int contador=0; contador<11; contador++){
            if (contador < 5){
            System.out.println("Somos os primeiros");
        }
            if (contador >= 5 && contador < 10){   
            System.out.println("Somos os últimos");
        }
            if (contador == 10){
            System.out.println("Sou o último");
        }
        
    }
    
  }
}