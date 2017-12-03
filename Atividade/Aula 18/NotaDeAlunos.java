
package notadealunos;

import java.util.Scanner;


public class NotaDeAlunos {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int notas = 4;
        double[] nota = new double[notas];
        double total = 0;
       
        
        for (int i = 0; i < 4; i++) {
        System.out.println("Digite 4 notas do aluno ");
        nota[i] = leitor.nextDouble();
        total = total + nota[i];
        
        }
        double media = total/4; 
        
        if (media >= 5){
            System.out.println("Aprovado! Sua média foi: "+media);
        }else{
            System.out.println("Reprovado! Sua média foi: "+media);
        }
               
        
         
        
    }
    
}
