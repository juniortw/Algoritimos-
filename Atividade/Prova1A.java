
package prova1a;

import java.util.Scanner;

public class Prova1A {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("O que você quer calcular?\n"
                         + " 1. Área de um Quadrado\n" 
                         + "2. Area de uma Circunferência\n"
                         + "3. Área de um Trapézio ");
        
        String calculo = leitor.next();
        
        switch (calculo){
            case "1":
                System.out.println("Informe o lado do quadrado");
                double lado = leitor.nextDouble();
                if (lado <= 0){
                    System.out.println("Valor Invalido");
                    System.exit(0);
                }
                double quadrado = lado * lado ;
                System.out.println("A área do FIGURA é de? "+quadrado);
                
            case "2":
                System.out.println("Digite o raio?");
                double raio = leitor.nextDouble();
                if (raio <= 0){
                    System.out.println("Valor Invalido");
                    System.exit(0);
                }
                double circulo =  3.14 * Math.pow(raio, 2) ;
                System.out.println("A área do FIGURA é de? "+circulo);
                
            case "3":
                
                System.out.println("Digite a altura?");
                double altura = leitor.nextDouble();
                if (altura <= 0){
                    System.out.println("Valor Invalido");
                    System.exit(0);
                }
                System.out.println("Base maior");
                double basemaior = leitor.nextDouble();
                if (basemaior <= 0){
                    System.out.println("Valor Invalido");
                    System.exit(0);
                }
                
                System.out.println("Base menor");
                double basemenor = leitor.nextDouble();
                if (basemenor <= 0){
                    System.out.println("Valor Invalido");
                    System.exit(0);
                }
                double trapezio = altura*(basemaior + basemenor) / 2;
                System.out.println("A área do FIGURA é de? "+trapezio);
                
                
        }
        
    }
    
}
