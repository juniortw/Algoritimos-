package atividadeaula18;

import java.util.Scanner;

public class AtividadeAula18 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos alunos serão cadastrados?");
        int alunos = leitor.nextInt();

        double[] notas = new double[alunos];

        for (int i = 0; i < alunos; i++) {
            System.out.println("Qual a nota de cada aluno?");
            notas[i] = leitor.nextDouble();
        }
        
        for (int i = 0; i < alunos; i++) {
            System.out.println(notas[i]);
        }

    }

}

}
