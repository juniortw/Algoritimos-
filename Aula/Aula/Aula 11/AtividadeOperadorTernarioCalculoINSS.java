
package atividadeoperadorternariocalculoinss;

import javax.swing.JOptionPane;

public class AtividadeOperadorTernarioCalculoINSS {

    
    public static void main(String[] args) {
         double salario = Double.valueOf(JOptionPane.showInputDialog("Digite seu salário"));
         
         double liquido = salario < 2000 ? salario * 0.95 : salario * 0.08;
         
         double inss = salario > 1000 ? salario * 0.08 : salario * 0.10; 
         
       JOptionPane.showMessageDialog(null, "Se líquido é "+liquido+ "e seu INSS é " +inss);
         
    }
    
}
