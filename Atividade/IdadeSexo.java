
package idadesexo;

import java.util.Scanner;

public class IdadeSexo {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
            System.out.println("Informe seu sexo");
	        String sex  = leitor.nextLine();
	        
	        System.out.println("Informe sua idade");
	        int idade = leitor.nextInt();
	       
	        	       
	       if (sex.equalsIgnoreCase("masculino"))
	    	   
	    	   if (idade >= 18 || sex == "masculino"){
	           System.out.println("Você é um Homem maior de idade");
	    	   }else{
	           System.out.println("Você é um Homem menor de idade");
	    	   }
	       
	       if (sex.equalsIgnoreCase("feminino"))
	    	   
	    	   if (idade >= 18 || sex == "feminino"){
		       System.out.println("Você é uma Mulher maior de idade");
	    	   }else{
		       System.out.println("Você é uma Mulher menor de idade");
		       }
       
       }    
  }




     
       
    

