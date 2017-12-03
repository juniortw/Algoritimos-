package produtos;

import java.util.Scanner;

public class Produtos {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int produto = 0;

        while (produto < 1 || produto > 11) {
            System.out.println("Quantos produtos você comprou?");
            produto = leitor.nextInt();
        }

        double valor = 0;

        int contador = 0;

        while (contador < produto) {
            contador++;

            while (valor <= 0) {
                System.out.println("Qual o valor unitário?");
                valor = leitor.nextDouble();
            }

            double unidade = 0;

            while (unidade <= 0) {
                System.out.println("Quantas unidade?");
                unidade = leitor.nextDouble();
            }

        double total = (produto * valor) + unidade;
        }

        System.out.println("Você comprou " + produto + " produtos e sua compra deu um total de R$" + total);
    }

}
