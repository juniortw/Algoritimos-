package projetoatividade1;

import java.util.Scanner;

public class ProjetoAtividade1 {

    public static void main(String[] args) {

      Scanner leitor = new Scanner(System.in);

        System.out.println("Digite número 1");
        double numero1 = leitor.nextDouble();

        System.out.println("Digite número 2");
        double numero2 = leitor.nextDouble();

        System.out.println("Digite número 3");
        double numero3 = leitor.nextDouble();
        
        double media = (numero1 + numero2 + numero3) /3;

        System.out.println("A média aritmética é: "+media);
        
    }
    
}
