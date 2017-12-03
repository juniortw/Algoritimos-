 
package liquidopj;

import java.util.Scanner;
 
public class LiquidoPJ {

     
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe seu ganho bruto");
        double ganho = leitor.nextDouble();
        
        System.out.println("Informe o desconto do contador");
        double contador = leitor.nextDouble();
        
        System.out.println("Digite seu TFE (Taxa de Fiscalizaçao de Estabelecimento)");
        double tfe = leitor.nextDouble();
        
        double liquido = (ganho - contador - tfe) * 0.6; 
        
        System.out.println("Sua despesa é: "+liquido);
    }
    
}
