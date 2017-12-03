package atividade1;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Bom dia " + nome);

        System.out.println("Informe sua idade: ");
        int idade = leitor.nextInt();

        System.out.println("Com quantos anos deseja morrer: ");
        int morrer = leitor.nextInt();

        int morte = morrer - idade;
        int meses = morte * 12;
        int dias = morte * 365;
        int horas = 8760 * morte;
        

        System.out.println("Você irá viver mais " +morte+ " anos, ou " +meses+ " meses ou " +dias+ " dias ou " +horas+ " horas");

    }

}
