package animefavorito;

import java.util.Scanner;

public class AnimeFavorito {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual sua idade");
        int idade = leitor.nextInt();
        if (idade < 3) {
            System.out.println("Idade inválida");
            System.exit(0);
        }

        System.out.println("Qual seu anime favorito\n"
                + "1 - DragonBall Z\n"
                + "2 - Fly\n"
                + "3 - Pokemon\n"
                + "4 - Ursinhos carinhosos");

        String resposta = leitor.next();

        double desconto = 1;
        if (idade <= 6) {
            desconto = 0.9;
        }
        switch (resposta) {
            case "1":
                double vf = desconto * 35.00;
                System.out.println("DragonBall Z: R$" + vf);
                break;
            case "2":
                double vf2 = desconto * 30.00;
                System.out.println("Fly: R$" + vf2);
                break;
            case "3":
                double vf3 = desconto * 25.00;
                System.out.println("Pokemon: R$" + vf3);
                break;
            case "4":
                double vf4 = desconto * 3.00;
                System.out.println("Ursinhos carinhosos: R$" + vf4);
        }
       
        if (idade >= 16) {
            System.out.println("Que não seja criança nas responsabilidades, apenas no coração");
        }

        
    }

}
