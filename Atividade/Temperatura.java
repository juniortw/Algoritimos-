
package temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe a temperatura");
        
        int temperatura = leitor.nextInt ();
        
        /*
        && "e"
        Os dois são iguais
        */
        if (temperatura >= 25 && temperatura <= 20){
            System.out.println("Conforto");
        }
        
        /* || "ou"
        Nesse caso com pelo menos 1 verdadeiro, todo o teste é verdade
        */ 
        if (temperatura >= 5 || temperatura <= 35) {
            System.out.println("Perigo");
        }
        

    }
    
}
