
package revisaometodos1;

import javax.swing.JOptionPane;

public class RevisaoMetodos1 {

    //Ecemplo de método para EXIBIR uma JOPtionPane
    public static void exibirJanela(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
    //Ecemplo de método para LER uma JOPtionPane
    public static String lerString(String orientacao) {
        return JOptionPane.showInputDialog(orientacao);
        
    }
    
    //Ecemplo de método para LER uma int com JOPtionPane
    public static int lerInt(String orientacao) {
        return Integer.valueOf(lerString(orientacao));
        
    }
    
    //Ecemplo de método para LER um double com JOPtionPane
    public static double lerDouble(String orientacao) {
        return Double.valueOf(lerString(orientacao));
        
    }
    
    public static void main(String[] args) {
        
        exibirJanela("Boa noite");
        exibirJanela("Quero minha propina! Mintira ^^");
        exibirJanela("Meus algoritimos");
        
        
        String mae = lerString("Nome da mãe?");
        int idade = lerInt("Qual idade da sua veria?");
        double altura = lerDouble("Qual a altura da coroa?");
        
             
    }
    
}
