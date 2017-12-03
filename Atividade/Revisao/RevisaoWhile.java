
package revisaowhile;

import java.util.Scanner;


public class RevisaoWhile {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        //~~~~~~~~Atividade1~~~~~~~~
        
         /*
          Solicite ao usuário que informe a quantidade de formigas 
          que há em sua casa. Insista na pergunta quando digitar 0 ou menos
        */
        
        int formigas = 0;
                
        while (formigas <= 0){
          
            System.out.println("Quantas formigas tem na sua casa");
            formigas = leitor.nextInt();
        } 
        
        
        //~~~~~~~~Atividade2~~~~~~~~
        
        /*
          Solicite ao usuário que informe sua nota na prova.
          Insista na pergunta caso a nota não estiver entre 0 e 10.
        */
        
        double nota = 0;
        
        while (nota <= 0 || nota > 10){
            
            System.out.println("Quan a sua nota na prova?");
            nota = leitor.nextDouble();
        }
        
        
        
        //~~~~~~~~Atividade3~~~~~~~~
        
        /*
          Solicite ao usuário que informe o valor de uma temperatura externa 
          Insista na pergunta caso ela não esteja abaixo -10 ou acima de 35
        */
        
        double temperatura = 0;
        
        while (temperatura >= -10 && temperatura <= 35){
            System.out.println("Qual o valor da temperatura");
            temperatura = leitor.nextDouble();
        }
        
        
        
        
        
        //~~~~~~~~Atividade4~~~~~~~~
        
        /*
          leia o nome do usuário 
          Insista na pergunta se o nome for vazio 
        */
        
        String nome = "";
        
        while (nome.equals("")){
            System.out.println("Qual seu nome?");
            nome = leitor.next();
        }
        
        
        
        
        
        //~~~~~~~~Atividade5~~~~~~~~
        
        /*
          Leia o estado do SUL que o usuário mora
          Insista na pergunta enquanto o estado não for "RS", "PR" nem "SC"
        */
        
        String estado = ""; 
       
        
        while (!estado.equals("RS") && !estado.equals("PR") && !estado.equals("SC")){
            System.out.println("Qual estado você mora?");
            estado = leitor.next();
        }
        
        
    }
    
}
