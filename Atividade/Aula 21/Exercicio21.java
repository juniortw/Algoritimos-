package exercicio21;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        /*
           Crie um programa em java que registre a venda de ingressos numa sala de cinema.
           Pergunte ao usuário quantas fileiras existem na sala e quantas poltronas existem por fileira.
           Pergunte o valor do ingresso.
           Inicie então a venda dos ingressos. Pergunte ao usuário a fileira (1-F) e a poltrona (1-P).
           Caso o usuário informe fileira ou poltrona inválida, exiba "Poltrona inválida" e insista na pergunta.
           Caso o usuário informe fileira já vendida, exiba "Poltrona já vendida" e insista na pergunta.
           Caso a poltrona seja válida, pergunte se a venda é "inteira", "meia" ou "convite". 
           Ao final, exiba 
           "Você arrecadou um total de R$X" com os ingressos.
           Considere que a meia é 50% do valor do ingresso e os convites são R0,00.
         */
        System.out.println("Quantas fileiras tem na sala?");
        int fileiras = leitor.nextInt();

        System.out.println("Quantas poltronas tem na sala?");
        int poltronas = leitor.nextInt();

        boolean cinema[][] = new boolean[fileiras][poltronas];

        System.out.println("Qual o valor do ingresso?");
        double ingresso = leitor.nextDouble();

        double Total = 0;
        int pol = 0;
        int fil = 0;
        int i = 0;

        while (i < fileiras * poltronas) {

            System.out.println("Qual a poltrona?");
            pol = leitor.nextInt();
            
            boolean PoltronaValida = pol > 0 && pol <= poltronas;

                if (!PoltronaValida) {
                    System.out.println("Poltrona inválida");
                    i--;
            } else {
                System.out.println("Qual a fileira?");
                fil = leitor.nextInt();
                
            boolean FileiraValida = fil > 0 && fil <= fileiras;
            
                if (!FileiraValida) {
                    System.out.println("Fileira inválida");
                    i--;
                } else {
                    
                    cinema [fil - 1][pol - 1] = true;
                    
                    System.out.println("a venda é: 'inteira'', 'meia' ou 'convite'.");
                    String resposta = leitor.next();
                    switch (resposta) {
                        case "inteira":
                            Total += ingresso;
                            break;
                        case "meia":
                            Total += (ingresso / 2);
                            break;
                        case "convite":
                            Total += (ingresso = 0);
                            break;
                    }
                }
            }

            i++;
        }
        System.out.println("Você arrecadou um total de R$" + Total + "com os ingressos");

    }

}
