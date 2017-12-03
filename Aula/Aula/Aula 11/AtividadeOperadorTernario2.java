
package atividadeoperadorternario2;

import javax.swing.JOptionPane;


public class AtividadeOperadorTernario2 {

    
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Qual sua senha?");
        
        JOptionPane.showMessageDialog(null, (senha.equalsIgnoreCase("123"))? "Senha válida" : "Senha inválida");
    }
    
}
