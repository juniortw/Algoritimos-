package atividade1;

    import java.util.Scanner;
        
        public class ATIVIDADE1 {

    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
         
         System.out.println("Bimestre 1 digite o valor sua venda");
         double bimestre1 = leitor.nextDouble();
         
         System.out.println("Bimestre 2 digite o valor sua venda");
         double bimestre2 = leitor.nextDouble();
         
         System.out.println("Bimestre 3 digite o valor sua venda");
         double bimestre3 = leitor.nextDouble();
         
         System.out.println("Bimestre 4 digite o valor sua venda");
         double bimestre4 = leitor.nextDouble();
         
         double media = (bimestre1 + bimestre2 + bimestre3 + bimestre4) /4;
         
        System.out.println("A média de venda anual em R$ "+media);
    }
    
}
