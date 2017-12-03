package aula16exercicio6;

import java.util.Scanner;

public class Aula16exercicio6 {

   
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int produto = 0, contador = 0;
        double preco = 0, valortotal = 0, maiscaro = 0, maisbarato = 0;

        System.out.println("Quantos produtos você comprou ?");
        produto = leitor.nextInt();

        while (contador < produto) {

            while (preco <= 0) {
                System.out.println("Qual o valor de cada produto ?");
                preco = leitor.nextDouble();
            }

            if (contador == 0) {
                maiscaro = preco;
                maisbarato = preco;
            }
            if (preco < maisbarato) {
                maisbarato = preco;
            }
            if (preco > maiscaro) {
                maiscaro = preco;
            }

            valortotal += preco;
            preco = 0;
            contador++;
        }

        System.out.println("O valor total da compra foi de R$" + valortotal);
        System.out.println("O valor mais barato é R$" + maisbarato);
        System.out.println("O valor mais caro é R$" + maiscaro);

    }

}
