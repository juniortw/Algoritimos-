
package projetomatrizes;

import java.util.Scanner;


public class ProjetoMatrizes {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        //Matriz de 7X3
        // Ou seja, 7 vetores, cada um contendo um vetor de 3 posições
        String [][] ap = new String [7][3];
        // 2ª posição do 3º vetor
        ap [2][1] = "Ap do 'A'";
        
        //4º vetor, 1ªposição
        ap [3][0] = "Ap do 'B'";
        
        //3ª posição do 7º vetor
        ap [6][2] = "Ap do 'c'";
        
        //2ª posição do 2º vetor
        ap [1][1] = "Ap do 'D'";
                
        //6º vetor 3ª posição
        ap [5][2] = "Ap do 'E'";       
        
        /*
          Pergunte ao usuário de qual andar e apartamento quer conhecer a dona
          Considere que o andar é o índice do vetor
          e o AP o índice no vetor do vetor
          Caso não tenha nenhum morador no andar e AP indicado 
          exiba: "AP vazio"
        */
        
        System.out.println("Qual andar?");
        int andar = leitor.nextInt();
        System.out.println("Qual AP");
        int apart = leitor.nextInt();
        
        String DonoDoAp = ap[andar][apart];
        if (DonoDoAp == null){
            System.out.println("AP vazio");
        } else {
            System.out.println(DonoDoAp);
        }
    }
    
}
