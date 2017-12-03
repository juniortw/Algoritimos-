
package projetoifelse;

import java.util.Scanner;

public class ProjetoIFELSE {

    public static void main(String[] args) {
        
      Scanner leitor = new Scanner(System.in);
      
      // exemplo 1
      System.out.println("Digite sua idade ");      
      int idade = leitor.nextInt ();
      
      // Se, em java é IF
      if (idade>=16) {
          System.out.println("Já pode votar");
          // Se não, em java é ELSE
      } else {
         System.out.println("Não pode votar");
      } 
      
      
      //exemplo 2
      
        System.out.println("Informe seu peso");
        double peso = leitor.nextDouble ();
        
        System.out.println("Informe sua altura");
        double altura = leitor.nextDouble ();
        
        double imc = peso / Math.pow(altura, 2);
        /*
        Considerar:
        Abaixo: IMC < 20
        No peso: IMC = 20
        Acima: IMC > 20
       */
        
        if (imc < 20){
            System.out.println("Você esta abaixo do texto");
        }
        if (imc == 20){
            System.out.println("Você esta no peso ideal");
        }
        if (imc > 20){
            System.out.println("Você esta acima do peso");
        }   
        
      
      /* Exemplo 3: "Verdadeiro" "Falso"
      Solicite que o usuario difite "Verdadeiro" ou "Falso"
      Se digitar o primeiro, exiba "ok, é verdade"
      caso contrario, exiba "Não, não é verdade"
      */
      
      
        System.out.println("Digite Verdadeiro ou Falso");
        String vouf = leitor.nextLine();
        
        // Em Java, para comparar String, use-se ".equals()"
        if (vouf.equals("Verdadeiro")){
            System.out.println("OK, é verdade");
        }
        if (vouf.equals("Falso")){
            System.out.println("Não, é verdade");
        }
        
      
      /* Para comparar indiferente de maiúsculo e minusculo
      usa-se o ".equalsIgnoreCase"
      */
      
        System.out.println("Digite Verdadeiro ou Falso");
        String vouf2 = leitor.nextLine();
        
        if (vouf2.equalsIgnoreCase("Verdadeiro")){
            System.out.println("OK, é verdade");
        }
        if (vouf2.equalsIgnoreCase("Falso")){
            System.out.println("Não, é verdade");
        }
      
      
    }
    
}
