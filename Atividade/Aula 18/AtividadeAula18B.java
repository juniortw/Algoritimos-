
package atividadeaula18b;

import java.util.Scanner;


public class AtividadeAula18B {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos produtos ele comprou?");
        int produtos = leitor.nextInt();
        
        double[] total = new double[produtos];
        
        for (int i=0; i<produtos; i++){
            System.out.println("Qual o valor unitário?");
            double valor = leitor.nextDouble();
            
            System.out.println("Qual a quantidade comprada?");
            int quantidade = leitor.nextInt();
                      
            total[i] = valor * quantidade;
        }
        
        for (int i=0; i<produtos; i++){
            System.out.println("O valro do item "+(i+1)+ " é " +total[i]  );
        }
        
    }
    
}
