
package fgtseinss;

import java.util.Scanner;

public class FGTSeINSS {

    
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu salário para calcular o FGTS");
        double salario = leitor.nextDouble();
        
        double fgts = salario  * 0.08 ;        
            
        System.out.println("Sua contribuição mensal é de: " +fgts);
        
        System.out.println("Digite seu salário para calcular o INSS");
        double salario2 = leitor.nextDouble();
        
        if (salario2 <= 1659.39 ){
         double baixo = salario2 * 0.08;
            System.out.println("Sua contribuição mensal é de: "+baixo);
        }    
        if (salario2 > 1659.39 && salario2 <= 2765.66){
        double medio = salario2 * 0.09;
            System.out.println("Sua contribuição mensal é de: "+medio);
        } 
        if (salario2 > 2765.66 && salario2 <= 5531.31 ){
        double alto = salario2 * 0.11;
            System.out.println("Sua contribuição mensal é de: "+alto);
        }    
    }
}
