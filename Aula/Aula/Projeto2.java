package projeto2;

import java.util.Scanner;

public class Projeto2 {

    public static void main(String[] args) {

        //Função "Scanner" para o usuário digitar um texto
        // 1. Criamos um Scanner
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite alguma coisa");
        // 2. Para ler um texto (String)
        // Invocar o "nextline()"
        String texto1 = leitor.nextLine();
        // O que o usuário digitar, ficará guardado em "texto1"

        System.out.println("Você digitou " + texto1);

        // 3. Para ler como número inteiro
        System.out.println("Quantos filhos você tem?");
        int filhos = leitor.nextInt();
        System.out.println("Você informou ter " + filhos + " filhos");

        // 4. Para ler números real
        // Invocar o "nextDouble()"
        System.out.println("Qual sua altura?");
        double altura = leitor.nextDouble();
        System.out.println("Sua altura é " + altura);
        
      
        // Exemplo: Ler 2 números, calcular e exibir a soma:
        System.out.println("Primeiro número");
        double numero1 = leitor.nextDouble();
        System.out.println("Segundo número");
        double numero2 = leitor.nextDouble();
        double soma = numero1 + numero2;
        System.out.println("A soma é: "+soma);
        
        
        

    }

}
