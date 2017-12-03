package fallflight;

import java.util.Scanner;

public class FallFlight {

    /* 
       Cria o sistema de vendas de passagens do único avião da empresa Fall Flight. 
       Esse avião possui 6 fileiras com 2 poltronas cada.
       Antes de começar as vendas, pergunte o valor da passagem.
       Comece então a vender as passagens. Pergunte ao usuário primeiro a fileira (1 a 6), depois a poltrona (1 ou 2). 
       Caso o usuário informe uma fileira/poltrona já vendidos, exiba "Essa poltrona já foi vendida" e pergunte novamente até que sejam informados valores corretos.
       Caso o usuário informe uma combinação de fileira/poltrona que não existe, 
       exiba "Poltrona não existe" e pergunte novamente até que sejam informados valores corretos.
       Ao final, exiba "Voo lotado. A empresa arrecadou um total de R$X.".
    */

    public static void main(String[] args) {

       
        
        Scanner leitor = new Scanner(System.in);

        int aviao[][] = new int[6][2];

        System.out.println("Qual o valor de cada passagem ?");
        double passagem = leitor.nextInt();

        int i = 0;

        while (i < 12) {
            System.out.println("Qual a fileira?");
            int fileira = leitor.nextInt();

            System.out.println("Qual a poltrona?");
            int poltrona = leitor.nextInt();

            boolean fileiraValida = fileira < 7 && fileira > 0;
            boolean poltronaValida = poltrona < 3 && poltrona > 0;

            if (fileiraValida && poltronaValida) {
                if (aviao[fileira - 1][poltrona - 1] == 0) {
                    aviao[fileira - 1][poltrona - 1] = 1;
                    i++;
                } else {
                    System.out.println("Essa poltrona já foi vendida");
                }
            } else {
                System.out.println("Poltrona não existe");
            }

        }
        System.out.println("Voo lotado. A empresa arrecadou um total de R$ " + (passagem * 12));

    }

}
