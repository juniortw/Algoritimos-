
package cartaofidelidademetro;

import java.util.Scanner;

public class CartaoFidelidadeMetro {
   
    public static void main(String[] args) {
        
      System.out.println("Qual valor atual da passagem");
		 double passagem = leitor.nextDouble();
		 if (passagem <= 0){
			 System.exit(0);
		 }
		 
		 System.out.println("Quantas viagens você faz por dia?");
		 int viagemDia = leitor.nextInt();
		 if (viagemDia < 2){
			 System.exit(0);
		 }
		 
		 System.out.println("Quntos dias no mês você usa o metrô?");
		 int metroMes = leitor.nextInt();
		 if (metroMes < 1){
			 System.exit(0);
		 }
		 
		 		 
		 double gastoMensal = (passagem * viagemDia) * metroMes; 
		 double gastoAnual = gastoMensal * 12;
		 		 
		 double gastoMensalDesconto = gastoMensal * 0.055 ;
		 double gastoAnualDes = gastoAnual * 0.055;
		 
		 System.out.println("Você gasta por mês R$"+gastoMensal+". E por ano R$"+gastoAnual+ 
				                "Com o cartão fidelidade você economiza por mês R$"+gastoMensalDesconto+
				                    ". E por ano R$"+gastoAnualDes);



       
    }
    
}
