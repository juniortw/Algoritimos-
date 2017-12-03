
package atividadeoperadorternarioquantfilhos;

import javax.swing.JOptionPane;


public class AtividadeOperadorTernarioQuantFilhos {

    
    public static void main(String[] args) {
       
        int filhos =Integer.valueOf(JOptionPane.showInputDialog("Quantos filhos você tem"));
        
        JOptionPane.showMessageDialog (null, filhos == 0 ? "Você tem internet, TV paga e video game" : 
                                             filhos == 1 ? "Você tem internet e TV paga":
                                             filhos == 2 ? "Você tem internet" : 
                                             "Você não tem internet nem TV paga nem video game");
    }
    
}
