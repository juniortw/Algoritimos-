
package aula17exercicio16b;

import java.util.Scanner;


public class Aula17exercicio16b {

    
    public static void main(String[] args) {
        
       Scanner leitor = new Scanner(System.in);
       
       System.out.println("Quan número quer começar?");

        int num1 = leitor.nextInt();

        

        System.out.println("Quan número quer terminar?");

        int num2 = leitor.nextInt();


        if (num2 <= num1){
            System.exit(0);
        }

        for (num1=0; num1 <= num2; num2 -= 2){
            System.out.println(num2);
          }
        

        

       

        

        

    
       
    }
    
}
