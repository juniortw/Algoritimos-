
package calculoimc;

import java.util.Scanner;

public class CalculoIMC {
   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua altura");
        double altura = leitor.nextDouble();
        
        System.out.println("Digite seu peso");
        double peso = leitor.nextDouble();
        
        System.out.println("Digite seu gênero");
        String genero = leitor.next();
        
        double imc = peso / Math.pow(altura, 2);
        
    if (genero.equalsIgnoreCase("masculino"));
        
        if (imc < 20.7 && genero.equals("masculino")){
        System.out.println("Abaixo do peso");
    }    
        if (imc >= 20.7 || imc == 26.4 && genero.equals("masculino")){
        System.out.println("No peso normal");
    } 
        if (imc >= 26.4 || imc == 27.8 && genero.equals("masculino")){
        System.out.println("Marginalmente acima do peso");
    }  
        if (imc >= 27.8 || imc == 31.1 && genero.equals("masculino")){
        System.out.println("Acima do peso normal");
    }  
        if (imc > 31.1 && genero.equals("masculino")){
        System.out.println("Obeso");
    } 
      
    if (genero.equalsIgnoreCase("faminino"));
        
        if (imc < 19.1 && genero.equals("feminino")){
        System.out.println("Abaixo do peso");
    }    
        if (imc >= 19.1 || imc == 25.8 && genero.equals("feminino")){
        System.out.println("No peso normal");
    } 
        if (imc >= 25.8 || imc == 27.3 && genero.equals("feminino")){
        System.out.println("Marginalmente acima do peso");
    }  
        if (imc >= 27.3 || imc == 32.3 && genero.equals("feminino")){
        System.out.println("Acima do peso normal");
    }  
        if (imc > 32.3 && genero.equals("feminino")){
        System.out.println("Obeso");
    } 
       
    }
    
}
