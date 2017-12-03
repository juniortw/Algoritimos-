
package projetojanelas;

import javax.swing.JOptionPane;


public class ProjetoJanelas {

    
    public static void main(String[] args) {
        
        // exibindo frases em janelas 
        JOptionPane.showMessageDialog(null, "Boa noite galera");
        
        String nome = "Juh";
        int idade = 25;
        
        JOptionPane.showMessageDialog(null, "Olá "+nome+ " Você esta velho em "+idade+" anos");
        
        // recebendo valores do usuário
        String cidade = JOptionPane.showInputDialog("Qual sua cidade?");
        
        // recebendo números inteiros 
        int anos = Integer.valueOf(JOptionPane.showInputDialog("Quantos anos?"));
        
        // recebendo números reais 
        double peso = Double.valueOf(JOptionPane.showInputDialog("Qual seu peso?"));
       
       
                
                
                
    }
    
}
