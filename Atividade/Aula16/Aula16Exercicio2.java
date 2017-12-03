
package aula16exercicio2;

import java.util.Scanner;
        

public class Aula16Exercicio2 {

   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quan número quer começar?");
        int num1 = leitor.nextInt();
        
        System.out.println("Quan número quer terminar?");
        int num2 = leitor.nextInt();
        
        if (num2 <= num1){
            System.exit(0);
        }
        
        
        while (num1 <= num2){
            System.out.println(num2);
           num2 -= 2;
        }
        
        
        
    }
    
}
