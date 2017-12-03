
package exercicio24;

import java.util.Scanner;


public class Exercicio24 {
    
    public static boolean validarDoador(int idade, double peso, int qntMeses) {
       if ((idade > 16 && idade < 69) && peso > 50 && qntMeses > 6){
           
        return true;
       }else {
           return false; 
       }
       
    }

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
                
        System.out.println("Qual a sua idade?");
        int idade = leitor.nextInt();
        System.out.println("Qual seu peso?");
        double peso = leitor.nextDouble();
        System.out.println("Qual a quantidade de meses que já passaram da última doação?");
        int qntMeses = leitor.nextInt();
        
        
        
        
        
        
    }
    
}
