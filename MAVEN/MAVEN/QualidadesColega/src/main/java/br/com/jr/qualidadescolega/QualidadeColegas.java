package br.com.jr.qualidadescolega;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;

public class QualidadeColegas {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos colegas?");
        int colegas = leitor.nextInt();

       
        for (int i = 0; i < colegas; i++) {

            System.out.println("Qual seu nome ?");
            String nome = leitor.next();

            System.out.println("Qual sua principal qualidade ?");
            String qualidade = leitor.next();

            File meuArquivo = new File(nome + ".txt");

            FileUtils.writeStringToFile(meuArquivo, qualidade);
        }

    }

}
