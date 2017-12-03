
package senhacofre;

import java.util.Scanner;


public class SenhaCofre {

    
    public static void main(String[] args) {

          		 Scanner leitor = new Scanner(System.in);
		 
		 System.out.println("Digite sua senha, só é válido: número, letra, número, letra.");
		 
		 System.out.println("Digite o primeiro número da senha: ");
		 String senha1 = leitor.nextLine();
		 
		 System.out.println("Digite a primeira letra da senha: ");
		 String senha2 = leitor.nextLine();
		 
		 System.out.println("Digite o segundo número da senha: ");
		 String senha3 = leitor.nextLine();
		 
		 System.out.println("Digite a segunda letra da senha: ");
		 String senha4 = leitor.nextLine();
		 
		 System.out.println("Quanto de dinheiro vai guardar no cofre?");
		 double dinheiro = leitor.nextDouble();
		 
		 if (dinheiro >= 1000);
		 if (dinheiro < 1000){
			 System.out.println("Pra que cofre pra isso, mano?");
		 }
		 
		 System.out.println("Qual a combinação do cofre?");
		 String senhaCofre = leitor.next();
		 
		  if (senhaCofre.equals (senha1) || senhaCofre.equals (senha2) || 
				 senhaCofre.equals(senha3) || senhaCofre.equals(senha4)){ 
		   System.out.println("Cofre aberto! #partiu ostentação");
		 System.exit(0);
		 }else{
		   System.out.println("1ª tentativa falhou. Você tem mais 1");
		 }
		 
		 System.out.println("Qual a combinação do cofre?");
		 String senhaCofre2 = leitor.next();
		 		 
		 if (senhaCofre2.equals (senha1) || senhaCofre2.equals (senha2) || 
				 senhaCofre2.equals(senha3) || senhaCofre2.equals(senha4)){ 
		   System.out.println("Aberto na 2ª tentativa");
		 System.exit(0);
		 }else{
		   System.out.println("Cofre vai explodir!");{
			 System.exit(0);  
		   }
		 }





   }
    
}