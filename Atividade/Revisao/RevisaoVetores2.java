
package revisaovetores2;

import java.util.Scanner;


public class RevisaoVetores2 {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        //~~~~~~~~Atividade1~~~~~~~~
        
        //Leia 10 palavras e coloque elas em um vetor
        
        System.out.println("Digite 10 palavras");            
        String[] MinhasPalavras = new String[10];
        
        for (int i=0; i<10; i++) {
            MinhasPalavras[i] = leitor.next();
          
        }
        System.out.println("3ª palavra "+MinhasPalavras[2]);
        System.out.println("1ª palavra "+MinhasPalavras[0]);
        System.out.println("10ª palavra "+MinhasPalavras[9]);
        
        
        
        
        //~~~~~~~~Atividade2~~~~~~~~
        
        /*
          Leia o nome de 17 cidades. A cada leitura, pergunte:
          "Digite o nome da xª cidade"
          Os nomes devem ficar armazenador em um vetor.
          Ao final exiba o valor da 1ª cidade, 8ª cidade e da 17ª cidade.
        */
                  
        System.out.println("Digite o nome de 17 cidades");
        
        String[] cidades = new String[17];
        
        for (int i=0; i<17; i++) {
        
        System.out.println("Digite o nome da " +(i+1)+"ª cidade");
        cidades[i] = leitor.next();
        
        }
        
        System.out.println("O valor da 1ª cidade é "+cidades[0]);
        System.out.println("O valor da 8ª cidade é "+cidades[7]);
        System.out.println("O valor da 17ª cidade é "+cidades[16]);
       
        
        
        
        //~~~~~~~~Atividade2~~~~~~~~
        
        /*
          Leia 8 preços de produtos e guarde ele em um vetor. 
          Para cada leitura pergunte "Digite o xº preço".
          Ao final pergunte ao usuário de qual produto quer rever o preço
          "Qual produto quer rever? 1 a 4"
          Caso ele digite 1, exiba o preço do 1º produto, e assim por diante.
        */
        
        System.out.println("Digite o preço de 8 produtos");
        
        double [] produtos = new double[8];
        
        for (int i=0; i<8; i++) {
        
        System.out.println("Digite o valor do "+(i+1)+"º produto");
        produtos[i] = leitor.nextDouble();
             
        }
        
        System.out.println("Qual produto você quer rever? 1 a 4");
        int valor = leitor.nextInt();
        
        System.out.println("O valor do produto "+valor+ " é "+produtos[valor-1]);
        
        
        
        
        //~~~~~~~~Atividade3~~~~~~~~
        
        /*
          Leia os 7 depósitos de uma poupança e guarde-os num vetor
          A cada depósito pergunte: "Valor do xº depósito".
          Depois, exiba a soma poupada e a média dos depósitos.
        */
        
        System.out.println("Digite 7 depósitos");
        
        double media = 0;
        double soma = 0;           
        double [] depositos = new double[7];
        
        for (int i=0; i<7; i++){
            
        System.out.println("Valor do " +(i+1)+"º depósito");   
        depositos[i] = leitor.nextDouble();
        
        soma += depositos[i];
        
        } 
        
        media = soma/7;
        
        System.out.println("A soma da poupança é "+soma);
        System.out.println("A média da poupança é " +media);
        
    }
    
    
}
