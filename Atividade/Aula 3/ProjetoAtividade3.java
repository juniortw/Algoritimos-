
package ;
        
import java.util.Scanner;

public class ProjetoAtividade3 {

    public static void main(String[] args) {
          Scanner leitor = new Scanner(System.in);
		
         System.out.println("Digite seu nome: ");
         String nome = leitor.nextLine();
         
         System.out.println("Digite seu peso: ");
         double peso = leitor.nextDouble();
         
         System.out.println("Digite sua altura: ");
         double altura = leitor.nextDouble();
         
                
         double imc = (altura * altura) /peso;
         
         
         System.out.println("Olá, " +nome+ " Você tem um IMC de: " +imc);
           
       
    }
    
}
