
package projetovetores;

import javax.swing.JOptionPane;


public class ProjetoVetores {

    
    public static void main(String[] args) {
        // ex1: vetor de 3 Strings
        String[] frutas = {"uva", "mamão", "maçã"};
        
        // Recuperando elementos de um vetor
        // primeiro
        System.out.println("O primeiro é "+frutas[0]);
        
        // último
        System.out.println("O último é "+frutas[2]);
        
        //trocando o valor em vetor 
        //mudando o valor de 2º:
        frutas[1] = "tomate";
        System.out.println("O segundo é "+frutas[1]);
        
        /*
           O código abaixo resulta em erro em tempo de execução 
           pois não existe indice 3 no vetor "frutas"
           frutas[3] = "jaca";
        */
        
        int numeroFilhos = Integer.valueOf(JOptionPane.showInputDialog("Quantos filhos?"));
        String[] filhos = new String[numeroFilhos];
        
       filhos[3] = "Batman";
       filhos[7] = "Arlequina";
        
        
        // ex2: vetor de numeros inteiros
        int[] numerosInteiros = {3, 4, 7, 10, 12};
        int[] numerosInteirosB = new int[7];// vetor de 7 inteiros
        
        // ex3: vetor de numeros reais
        double[] numerosReais = {3.3, 4.5, 7.2};
        double[] numerosReaisB = new double[80];// vetor de 80 reais
        
        
        
        
    }
    
}
