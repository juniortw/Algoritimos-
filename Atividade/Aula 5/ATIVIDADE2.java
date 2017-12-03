package atividade2;

    import java.util.Scanner;
        
        public class ATIVIDADE2 {

    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
         
         System.out.println("Usuário informe o espaço percorrido");
          double espaco = leitor.nextDouble();
          
         System.out.println("Usuário informe o tempo percorrido");
          double tempo = leitor.nextDouble();
          
         double velocidade = espaco / tempo ; 
         
        System.out.println("A velocidade porcorrida foi: "+velocidade);
    }
    
}
