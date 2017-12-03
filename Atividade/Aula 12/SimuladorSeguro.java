
package simuladorseguro;

import java.util.Scanner;

public class SimuladorSeguro {
   
    public static void main(String[] args) {
        
     Scanner leitor = new Scanner(System.in);
		 
		 System.out.println("Qual seu sexo?");
		 String sexo = leitor.nextLine();
		 if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")){
		     System.exit(0);
		 }
		 		 		 
		 System.out.println("Qual sua idade?");
		 int idade = leitor.nextInt();
		 if (idade < 18 || idade > 50){
			 System.exit(0);
		 }
		 		 	 
		 System.out.println("Qual a quantidade de filhos?");
		 int filhos = leitor.nextInt();
		 if (filhos < 0){
			 System.exit(0);
		 }
		 
		 System.out.println("Qual o valor do seguro?");
		 double seguro = leitor.nextDouble();
		 if (seguro < 10000){
			 System.exit(0);
		 }
		 
		 if (filhos == 0){
			 if (sexo.equals("f")){
				 
				 if (idade >= 18 && idade <= 25){
					 // seguro 0,25%
					 double sf1 = seguro * 1.25;
					 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sf1);
				  }
				 
				 if  (idade >= 26 && idade <= 35){
					 // seguro 0,35%
					 double sf2 = seguro * 1.35;
					 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sf2);
				  }
				 
				 if (idade >= 36 && idade <= 49){
					 // seguro 0,40%
					 double sf3 = seguro * 1.40;
					 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sf3);
				  }
				 }
				 
				 
				 if (sexo.equals("m")) {
					 
				 if	(idade >= 18 && idade <= 25){
					 // seguro 0,28%
					 double sm1 = seguro * 1.28;
					 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sm1);
				  }
				 
				 if (idade >= 26 && idade <= 35){
					 // seguro 0,40%
					 double sm2 = seguro * 1.40;
					 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sm2);
				  }
				 
				 if (idade >= 36 && idade <= 49){
					 // seguro 0,45%
					 double sm3 = seguro * 1.45;
					 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sm3);
				  }
				 }
			 
		 }
		 
		 if (filhos > 1 && filhos < 2){
			 // desconto de 2%
			 double desconto = (seguro - 2) / 100;
			 
                 if (sexo.equals("f")){
				 
				 if (idade >= 18 && idade <= 25){
					 // seguro 0,25%
					 double sf1 = (seguro * 1.25) - desconto;
					 
					 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sf1);
				  }
				 
				 if  (idade >= 26 && idade <= 35){
					 // seguro 0,35%
					 double sf2 = (seguro * 1.35) - desconto;
					 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sf2);
				  }
				 
				 if (idade >= 36 && idade <= 49){
					 // seguro 0,40%
					 double sf3 = (seguro * 1.40) - desconto;
					 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sf3);
				  }
				 }
				 
				 
				 if (sexo.equals("m")) {
					 
				 if	(idade >= 18 && idade <= 25){
					 // seguro 0,28%
					 double sm1 = (seguro * 1.28) - desconto;
					 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sm1);
				  }
				 
				 if (idade >= 26 && idade <= 35){
					 // seguro 0,40%
					 double sm2 = (seguro * 1.40) - desconto;
					 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sm2);
				  }
				 
				 if (idade >= 36 && idade <= 49){
					 // seguro 0,45%
					 double sm3 = (seguro * 1.45) - desconto;
					 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sm3);
				  }
				 }
		 }
		 if (filhos > 3 && filhos < 4){
			 // desconto de 3%
			 double desconto2 = (seguro - 3) / 100;
			 			 
             if (sexo.equals("f")){
			 
			 if (idade >= 18 && idade <= 25){
				 // seguro 0,25%
				 double sf1 = (seguro * 1.25) - desconto2;
				 
				 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sf1);
			  }
			 
			 if  (idade >= 26 && idade <= 35){
				 // seguro 0,35%
				 double sf2 = (seguro * 1.35) - desconto2;
				 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sf2);
			  }
			 
			 if (idade >= 36 && idade <= 49){
				 // seguro 0,40%
				 double sf3 = (seguro * 1.40) - desconto2;
				 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sf3);
			  }
			 }
			 
			 
			 if (sexo.equals("m")) {
				 
			 if	(idade >= 18 && idade <= 25){
				 // seguro 0,28%
				 double sm1 = (seguro * 1.28) - desconto2;
				 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sm1);
			  }
			 
			 if (idade >= 26 && idade <= 35){
				 // seguro 0,40%
				 double sm2 = (seguro * 1.40) - desconto2;
				 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sm2);
			  }
			 
			 if (idade >= 36 && idade <= 49){
				 // seguro 0,45%
				 double sm3 = (seguro * 1.45) - desconto2;
				 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sm3);
			  }
			 }
		 }
		 if (filhos > 5){
			 // desconto de 5%
			 double desconto3 = (seguro - 5) / 100;
			 			 
             if (sexo.equals("f")){
			 
			 if (idade >= 18 && idade <= 25){
				 // seguro 0,25%
				 double sf1 = (seguro * 1.25) - desconto3;
				 
				 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sf1);
			  }
			 
			 if  (idade >= 26 && idade <= 35){
				 // seguro 0,35%
				 double sf2 = (seguro * 1.35) - desconto3;
				 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sf2);
			  }
			 
			 if (idade >= 36 && idade <= 49){
				 // seguro 0,40%
				 double sf3 = (seguro * 1.40) - desconto3;
				 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sf3);
			  }
			 }
			 
			 
			 if (sexo.equals("m")) {
				 
			 if	(idade >= 18 && idade <= 25){
				 // seguro 0,28%
				 double sm1 = (seguro * 1.28) - desconto3;
				 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sm1);
			  }
			 
			 if (idade >= 26 && idade <= 35){
				 // seguro 0,40%
				 double sm2 = (seguro * 1.40) - desconto3;
				 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sm2);
			  }
			 
			 if (idade >= 36 && idade <= 49){
				 // seguro 0,45%
				 double sm3 = (seguro * 1.45) - desconto3;
				 System.out.println("Por um seguro de R$"+seguro+" você precisa pagar R$"+sm3);
			  }
			 }
		 }


       
    }
    
}
