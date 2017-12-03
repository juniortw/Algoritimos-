
package aula16exercicio3;

import java.util.Scanner;

public class Aula16Exercicio3 {

   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        double produto = 0, valorfinal = 0;
                
        int contador = 0;
        
        while (contador <= 4){
            System.out.println("Qual o valor do produto?");
            produto = leitor.nextDouble();
         
        if (produto > 0){
            valorfinal += produto;
        }else{
            break;
        }
        contador++;
        }
        
        System.out.println("Valor total dos produtos R$ "+valorfinal);
        
        
                
         
         
        
        
        
        
        
    }
    
}
