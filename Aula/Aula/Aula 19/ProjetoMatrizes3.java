
package projetomatrizes3;

import java.util.Scanner;


public class ProjetoMatrizes3 {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        /*
          Um mini mercado possui:
          3 categorias de produtos
          8 produtos em cada categoria 
          Solicite ao usuário que cadastre os nomes de todos esses produtos
          ~> Use matriz 
          ~> Use "for" para evitar repetição de código
        */
        
        String[][] produtos = new String [3][8];
        for (int c=0; c<3; c++){
            for (int p=0; p<8; p++){            
        System.out.println("Qual o nome de cada produto");
        produtos[c][p] = leitor.next();
        
         }
        } 
                
                
    }
    
}
