
package projetorepeticoes;

import javax.swing.JOptionPane;


public class ProjetoRepeticoes {

    
    public static void main(String[] args) {
        
              
        /*Crie um programa que pergunte ao usuário:
          "Digite 1 para continuar ou qualquer outra coisa para sair"
           então, caso ele digite "1", exiba "Programa rolando"
           caso contrário, saia do programa
           faça a pergunta novamente em caso de "1"        
        */
        
        // Solução com "loop infinito" com interrupção brusca 
       while (true){ //loop infinito
            String leitura = JOptionPane.showInputDialog("Digite 1 para continuar");
            
            if(!leitura.equals("1")){ // se leitura != "1"
                break; // interrompa o "while" imediatamente
            } else {
                System.out.println("Programa rolando");
            }
        }
                System.out.println("Programa encerrado!");  
                
                
                                        
             // É comum usar o while para "validar" entradas.
             
             // ex: só permita que o usuário digite valores maiores que 0
             
             int formigas = 0;
             while (formigas <= 0){
                 formigas = Integer.valueOf(JOptionPane.showInputDialog("Quantas formigas há no mundo?"));
             }
             System.out.println("Existem "+formigas+" nom mundo");

                 
       
        // ex: só permita que o usuário digite "SP" ou "RJ"
        
            String estado = "";
            while (!estado.equals("SP") && !estado.equals("RJ")){
                estado = JOptionPane.showInputDialog("Qual o estado?");
            }
            
            System.out.println("O estado escolhido foi: "+estado);
    } 
    
}
