
package projetorepeticoeswhile;


public class ProjetoRepeticoesWhile {

    
    public static void main(String[] args) {
        
        //Crie um programa que exiba a frase "I love you!" 25 vezes 
        
        int contador = 0;        
        // Enquanto for verdade entra nas chaves e quando for mentira ele sai
        // Contador for menor que 25, repetir o código 
        while (contador < 25){
            System.out.println("I love you!");
            contador++;
        }
        
        int contador1 = 0;
        while (contador1 < 4){
            System.out.println("Amor e ódio");
            contador1++;
        }
        
        int contador2 = 0;
        while (contador2 < 12){
            System.out.println((++contador)+ "ª Linha loka");
            contador2++;            
            
        }
       


    }
    
}
