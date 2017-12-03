
package aula16exercicio4;

import java.util.Scanner;

public class Aula16Exercicio4 {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        double nota1 = 0 , nota2 = 0 , media = 0 , mediaTotal = 0;
        
        int contador = 0;
        
        System.out.println("Quantos alunos há na turma?");
        int alunos = leitor.nextInt();
        
        while(contador < alunos){
            System.out.println("Qual a nota 1?");
            nota1 = leitor.nextDouble();
            
            System.out.println("Qual a nota 2?");
            nota2 = leitor.nextDouble();
                        
            System.out.println("A média do aluno é: "+(media = (nota1 + nota2) / 2));
            
            mediaTotal += media;
            
            contador++;
        }
        mediaTotal /= alunos;
        System.out.println("A media total dos alunos "+mediaTotal);
        
        
        
       
        
    }
    
}
