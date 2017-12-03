
package projetooperadorternario;

import javax.swing.JOptionPane;


public class ProjetoOperadorTernario {

    
    public static void main(String[] args) {
                
        int idade = Integer.valueOf(JOptionPane.showInputDialog("Idade?"));
        
        // solução com IF - Else
        if (idade >= 18){
            JOptionPane.showConfirmDialog(null, "Maior de idade");
        }else{
            JOptionPane.showConfirmDialog(null, "Menor de idade");
        }
        // solução operador ternario
        JOptionPane.showMessageDialog(null,(idade >= 18 ? "maior" : "menor")+ " de idade");
        
        //outros exeplos
        JOptionPane.showMessageDialog(null, idade > 2 ? "É criança" : "É bebê");
        JOptionPane.showMessageDialog(null, idade >= 13 ? "Teen" : "Criança");
        JOptionPane.showMessageDialog(null, idade >= 55 ? "Idoso" : "Adulto");
    }
    
}
