
package rendamensaldasfamilias;

import java.util.Scanner;

public class RendaMensalDasFamilias {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Qual sua renda mensal?");
        
        double renda = leitor.nextDouble();
        
        if (renda <=1356){
            System.out.println("Sua renda é de 46% dos brasileiros");
        }
        if (renda >= 1357 && renda <= 2034){
            System.out.println("Sua renda é de 20% dos brasileiros");
        }
        if (renda >= 2035 && renda <= 3390){
            System.out.println("Sua renda é de 16% dos brasileiros");
        }
        if (renda >= 3390 && renda <= 6780){
            System.out.println("Sua renda é de 9% dos brasileiros");
        }
        if (renda >= 6781 && renda <= 13560){
            System.out.println("Sua renda é de 4% dos brasileiros");
        }
        if (renda >= 13561 && renda <= 33900){
            System.out.println("Sua renda é de 1% dos brasileiros");
        }
    }
    
}
