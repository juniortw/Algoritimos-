
package revisaooperadorternario;

import java.util.Scanner;


public class RevisaoOperadorTernario {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        
        
        // ~~~~~~~~Atividade1~~~~~~~~ 
        
        /*
           Use o operador ternário para criar o seguinte programa:
           leia a idade de uma criança
           se a idade for até 2 anos 
           exiba "É UMA CRIANÇA DE COLO"
           se já tiver mais de 2 anos, exiba "#PartiuFilaGrande"
        */
        
        System.out.println("Qual a idade da criança?");
        int idade = leitor.nextInt();
        
        System.out.println(idade <= 2 ? "É uma criança de colo":"#PartiuFilaGrande");
        
        
        
        
        // ~~~~~~~~Atividade2~~~~~~~~ 
        
        /*
           Leia o mês de aniversário do usuário (o número(1 a 12), não o nome)
           caso o mês for 11
           exiba "PROVAVELMENTE VOCÊ FOI FEITO NO CARNAVAL"
           se não, "PROVAVELMENTE VOCÊ FOI PLANEJADO"
        */
        
        System.out.println("Qual o mes de aniversário?");
        int mes = leitor.nextInt();
        
        System.out.println(mes == 11? "Provavelmente você foi feito no carnaval":
                "Provavelmente você foi planejado");
        
    }
    
}
