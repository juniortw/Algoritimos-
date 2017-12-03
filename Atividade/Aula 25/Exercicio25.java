
package exercicio25;


public class Exercicio25 {
    
    public static String calcularResultado(double nota1, double nota2 ) {
        String mensagem = ""; 
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10){
            mensagem = "Uma das notas esta inválida";
        }else{
            double media = (nota1 + nota2) / 2;
            
            if (media <=3){
                mensagem = "Deu ruim. Precisa estudar muito mais!";
            }
            if (media > 3 && media <=5){
                mensagem = "Super mediano";
            }
            if (media > 5 && media <= 7){
                mensagem = "Bom aluno"; 
            }
            if (media > 7 && media <=9){
                mensagem = "Aluno muito bom";
            }
            if (media > 9){
                mensagem = "Aluno fora de série";
            }
        }
        return mensagem;
    }

    
    public static void main(String[] args) {
        
        System.out.println(calcularResultado(2, 2));
        System.out.println(calcularResultado(4, 4));
        System.out.println(calcularResultado(5, 6));
        System.out.println(calcularResultado(7, 8));
        System.out.println(calcularResultado(10, 10));
    }
    
}
