
package notaaluno;

import java.util.Scanner;


public class NotaAluno {

   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        String nome = "";
        while(nome.equals("")){ 
        System.out.println("Qual seu nome?");
         nome = leitor.nextLine();
        }
        
        System.out.println("Qual a idade?");
        int idade = 0;
        while(idade < 16 || idade >80 ){
            idade = leitor.nextInt();
        }
           
       double nota1 , nota2;
       
       System.out.println("Qual a nota 1");
       nota1 = 11;
       while(nota1 < 0 || nota1 > 10){
           nota1 = leitor.nextDouble();
       }
       System.out.println("Qual a nota 2");
       nota2 = 11;
       while(nota2 < 0 || nota2 > 10){
           nota2 = leitor.nextDouble();
       }
               
        double notafinal = (nota1 + nota2) / 2;
        
        System.out.println(nome+" ,você tem "+idade+"anos e sua média foi de "+notafinal);
        
    }
    
}
