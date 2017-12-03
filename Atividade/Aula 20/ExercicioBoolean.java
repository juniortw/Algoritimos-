
package exercicioboolean;

import java.util.Scanner;


public class ExercicioBoolean {

   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual seu sexo?");
        String sexo = leitor.next();
        
        System.out.println("Qual sua altura?");
        double altura = leitor.nextDouble();
        
        boolean medida = altura<1.9;
        boolean sexoH = sexo.equals("h");
        boolean sexoF = sexo.equals("m");
        
        
        if (!sexoF && !sexoH && medida){
            System.out.println("Você é uma pessoa que não pode jogar basquete");
        }
        if (sexoF && medida){
            System.out.println("Você é uma menina que não pode jogar basquete");
        }
        if (sexoH && medida){
            System.out.println("Você é um cara que não pode jogar basquete");
        }
        if (!medida){
            System.out.println("Parabéns, você pode jogar basquete!");
        }
    }
    
}
