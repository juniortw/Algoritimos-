
package exercicio23metodos;


public class Exercicio23Metodos {
   
    
    public static double metodoSomar(double num1, double num2) {
        return  num1 + num2;
        
    }
    
    public static double metodoDividir(double num1, double num2) {
       if (num2 == 0){
        return 0;
       }else {
         return num1 / num2;  
       }  
    }

    
    public static void main(String[] args) {
        
        System.out.println("10 + 20 = "+metodoSomar(10, 20));
        System.out.println("50 + 60 = "+metodoSomar(50, 60));
        System.out.println("89 + 80 = "+metodoSomar(89, 80));
        
        System.out.println("45 / 567 = "+metodoDividir(45, 567));
        System.out.println("412 / 962 = "+metodoDividir(412, 962));
        System.out.println("18283 / 0 = "+metodoDividir(18283, 0));
    }
    
}
