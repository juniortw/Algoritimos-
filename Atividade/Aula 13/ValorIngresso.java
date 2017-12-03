
package valoringresso;

import java.util.Scanner;

public class ValorIngresso {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual valor do ingresso ?");
        
        int valor = leitor.nextInt(); 
        
        System.out.println("Qual tipo do ingresso\n"
                              + "1. Inteira\n"
                              + "2. Meia\n"
                              + "3. Cortesia\n");
                       
        String resposta = leitor.next();
        
        switch (resposta){
            case "1":
                double v1 = (valor * 0.05) + valor;
                System.out.println("O seu ingresso sera de R$"+v1);
                break;
            case "2":
                double v2 = (valor * 0.55) + valor;
                System.out.println("O seu ingresso sera de R$"+v2);
                break;
            case "3":
                double v3 = valor;
                System.out.println("O seu ingresso sera de R$"+v3);
                break;
            default: 
                System.out.println("Qual parte de 1 a 3 não entendeu?");
                
        }
        
    }
    
}
