
package projetomatrizes2;

import java.util.Scanner;




public class ProjetoMatrizes2 {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        /*
          Pergunte ao usuário quantas turmas há na escola 
          Depois pergunte quantos alunos há em cada turma 
          Crie uma matriz de String conforme esses 2 valores 
        */
        
        System.out.println("Quantas turmas tem na escola");
        int turmas = leitor.nextInt();
        System.out.println("Quantos alunos");
        int alunos = leitor.nextInt();
        
        String[][] escola = new String[turmas][alunos];
        
        /*
          Pergunte ao usuário de qual turma e qual aluno 
          quer informar o nome e mude o respectivo valor na matriz 
        */
        
        System.out.println("Qual turma quer matricular o aluno?");
        int turma = leitor.nextInt();
        
        System.out.println("Escolha o aluno?");
        int aluno = leitor.nextInt();
        
        System.out.println("Qual o nome do aluno?");
        String nome = leitor.next();
        
        escola[turma][aluno] = nome; 
        
        
    }
    
}
