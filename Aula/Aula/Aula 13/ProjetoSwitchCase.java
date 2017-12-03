
package projetoswitchcase;

import javax.swing.JOptionPane;


public class ProjetoSwitchCase {

    
    public static void main(String[] args) {
        
         String mensagemMenu =
                 "Crie um programa que solicite ao usuario que escolha entre\n" +
                 "1. Poupança\n" +
                 "2. Tesouro Direto\n" +
                 "3. Renda fiza\n" +
                 "4. Ações\n" + 
                 "NDA. Porquinho";
         String resposta = JOptionPane.showInputDialog(mensagemMenu);
         
         // Escolha - Caso
         
         switch (resposta) {
             case "1":
                 JOptionPane.showMessageDialog(null, "60 anos");
                 break;                   
             case "2":
                 JOptionPane.showMessageDialog(null, "50 anos");
                 break;
             case "3":
                 JOptionPane.showMessageDialog(null, "47 anos");
                 break;
             case "4":
                 JOptionPane.showMessageDialog(null, "40 anos");
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "30 de fevereiro");
                 
                 
                 
         }
         
    }
    
}
