package miniboletim;

import java.util.Scanner;

public class MiniBoletim {

    public static void main(String[] args) {
        
        
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome da disciplina: ");
        String disciplina = leitor.nextLine();
        
        if (disciplina.equals("")){
        System.exit (0);
        }
        
        System.out.println("Digite 3 notas: ");

        double nota1, nota2, nota3;

        nota1 = leitor.nextDouble();
        nota2 = leitor.nextDouble();
        nota3 = leitor.nextDouble();

        double soma = (nota1 + nota2 + nota3) / 3 * 0.40;

        if (soma <= 2) {
            System.out.println("Deu muito ruim");
        }

        System.out.println("Digite mais 2 notas");

        double nota4, nota5;

        nota4 = leitor.nextDouble();
        nota5 = leitor.nextDouble();

        double soma2 = (nota4 + nota5) / 2 * 0.06;

        if (soma2 <= 3) {
            System.out.println("Deu ruim");
        }

        double resultado = soma + soma2;

        if (resultado < 5) {
            System.out.println("Reprovou");
        }
        if (resultado >= 5 && resultado < 7) {
            System.out.println("Na média");
        }
        if (resultado >= 7 && resultado < 9) {
            System.out.println("Acima da média");
        }
        if (resultado >= 9) {
            System.out.println("Excelente média");
        }

    }

}
