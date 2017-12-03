
package revisaovetor;

import java.util.Scanner;


public class RevisaoVetor {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        //Vetor de 3 strings (texto)
        String [] cidades = {"Rio de Janeiro", "São Paulo", "Bahia"};
        
        //Vetor de 5 números reais criado com valores
        double[] notas = {10.0, 8.5, 6.5, 9.5, 5.0};
        
        //Vetor de 4 strings SEM valores
        String[] bairros = new String[4];
        
        //Vetor de 10 números SEM valores
        int [] apartamento = new int[10];
        
        
        //Exiba o 3º valor do vetor "notas"
        System.out.println(notas[2]);
        
        //Exiba o 2º valor do vetor "cidade"
        System.out.println(cidades[1]);
        
        //Mude 4º valor do vetor de notas e depois exiba ele
        notas[3] = 7;
        System.out.println("4ª nota: "+notas[3]);
        
        //Mude o 1º valor do vetor de cidades e depois exiba ele
        cidades[0] = "Curiba";
        System.out.println("Cidade "+cidades[0]);
        
        /*
           Mude o 2º valor do vetor de bairros preenchendo ele
           com o 3º valor do vetor de cidades, depois exiba ele
        */
        bairros[1] = cidades[2];
        System.out.println("2º bairro: "+bairros[1]);
        
        
        
        
    }
    
}
