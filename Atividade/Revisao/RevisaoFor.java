
package revisaofor;

import java.util.Scanner;


public class RevisaoFor {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        
        // ~~~~~~~~Atividade1~~~~~~~~
        
       // Exiba a frase "AMOR E PAIXÃO" 5x
      
       for (int i=0 ; i < 5; i++){
           System.out.println("Amor e Paixão");
       }
       
      
      
      // ~~~~~~~~Atividade2~~~~~~~~
      
      // Exiba o dobro de todos os números de 1 a 10
      // soluçao1 
      for (int i=1 ; i <= 10 ; i++){
          System.out.println(i*2);
      }
      // soluçao2
      for (int i=1 ; i <= 20 ; i++){
          System.out.println(++i);
      }
      // soluçao3
      for (int i=2 ; i <= 20 ; i+=2){
          System.out.println(i);
      }
      
    }
    
}
