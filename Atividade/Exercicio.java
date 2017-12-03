package exercicio;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o valor da compra");
        double valor = leitor.nextDouble();

        System.out.println("Quantas parcelas quer pagar? ");
        double parcela = leitor.nextDouble();

        if (parcela == 1) {
            double compra = valor * 0.95;
            System.out.println("Valor a pagar " + compra);
        }
        if (parcela > 1) {
            double prestacao = valor / parcela;
            System.out.println("Você vai pagar " + valor + " com parcelas de " + prestacao);
        }
        if (parcela < 1) {
            System.out.println("É mesmo, engraçadinho?");
        }
    }

}
