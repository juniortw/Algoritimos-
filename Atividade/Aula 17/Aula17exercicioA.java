package aula17exercicioa;

import java.util.Scanner;

public class Aula17exercicioA {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int sacaCafe = 0, contador = 0, tipoCafe = 0;
        double valorSaca1 = 0, valorSaca2 = 0, valorSaca3 = 0, valorImposto = 0;
        String resposta = "";

        System.out.println("Quantas sacas de café você vendeu?");
        sacaCafe = leitor.nextInt();

        System.out.println("Qual o valor da saca de café, tipo exportação?");
        valorSaca1 = leitor.nextDouble();

        System.out.println("Qual o valor da saca de café, tipo comum?");
        valorSaca2 = leitor.nextDouble();

        System.out.println("Qual o valor da saca de café, tipo popular?");
        valorSaca3 = leitor.nextDouble();

        while (contador <= sacaCafe) {

            while (!resposta.equals("1") && !resposta.equals("2") && !resposta.equals("3")) {

                System.out.println("Qual o tipo de café?\n"
                        + "Digite 1. para Exportação;\n"
                        + "Digite 2. para Comum;\n"
                        + "Digite 3. para Popular.");
                resposta = leitor.next();
                
                contador++;
            }
            while (valorImposto <= 0) {
                System.out.println("Digite o valor da porcentagem do imposto");
                valorImposto = leitor.nextDouble();
            }
            switch (resposta) {
                case "1":
                    
                    break;

                case "2":
                    
                    break;

                case "3":
                    
                    break;

            }

            contador++;
        }

        
    }

}
