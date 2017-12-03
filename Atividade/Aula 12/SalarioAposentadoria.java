
package salarioaposentadoria;

import java.util.Scanner;


public class SalarioAposentadoria {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o sexo");
        String sexo = leitor.nextLine();        
        if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")){
        System.exit(0);
        }
        
        System.out.println("Digite sua idade");
        int idade = leitor.nextInt();        
        if (idade < 0 || idade > 49){
        System.exit(0);
        } 
                                 
        System.out.println("Digite seu salário");
        double salario = leitor.nextDouble();           
        if (salario <= 0){
        System.exit(0);
        }
        
        double aposentadoria = salario * 0.7; 
        double aposentadoria2 = salario * 0.8; 
        int ap  = 2017 - idade; 
        int result = 65 + ap; 
        int result2 = 60 + ap;
        int result3 = 55 + ap;  
        
                
        if (sexo.equals("m") && idade <= 20){
           System.out.println("Você vai se aposentar em "+result+" ,recebendo o valor de R$ "+aposentadoria);
        } 
        if (sexo.equals("m") && idade > 20){
           System.out.println("Você vai se aposentar em "+result2+" , recebendo o valor de R$ "+aposentadoria2);
        }
                
        if (sexo.equals("f") && idade <= 20){
           System.out.println("Você vai se aposentar em "+result+" , recebendo o valor de R$ "+aposentadoria);
        }
        if (sexo.equals("f") && idade > 20) {
           System.out.println("Você vai se aposentar em "+result3+" , recebendo o valor de R$ "+aposentadoria2);
        }
        
        
        
        
        
        
        
    }
    
}
