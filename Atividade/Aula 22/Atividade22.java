package atividade22;

import java.util.Scanner;

public class Atividade22 {

    public static void main(String[] args) {
        
          Scanner leitor = new Scanner(System.in);
        
        int vidas = 2;
		 
		 boolean [][] campo = new boolean [5][5];
		 
		 System.out.println("Vamos começar o jogo!");
		 System.out.println();
		 
		 for (int l = 0; l < 5; l++){
			 for (int c = 0; c < 5; c++){

				 boolean bomba = (campo[4][1] && campo[3][2] && campo[2][3] && campo[1][4] && campo[5][5]);
                   if (bomba) {
                      System.out.println("Booom! Você ainda tem 1 vida");
                     vidas--;
           
                  if (vidas == 0) {
        	         System.out.println("Boom! Aqui jaz um ex-soldado!");
                     System.exit(0);
                    }
                }

			System.out.println("Digite a "+(l+1)+" linha de 1 a 5");
			int resposta = leitor.nextInt();
				 
			 while(resposta < 1 || resposta > 4) {
	                System.out.print("Quadrado não existe!");
	                resposta = leitor.nextInt();
	            }
					 
	     }
       }		 

		System.out.println("Parabéns! Missão cumprida!"); 
        
        
        
        
    }
    
}
