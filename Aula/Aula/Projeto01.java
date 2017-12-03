package projeto01;
/*
   Saída padrão
   Variável de texto e número
   Concatenação
   Operações matemáticas básicas 
*/
public class Projeto01 {

    public static void main(String[] args) {
        // Todo o codigo escrito deve estar aqui

        //Exibindo mensagem no "console" (ou "saída padrão").
        System.out.println("Boa noite!");

        System.out.println("Boa noite jovens");

        //Criação de uma variável de texto (String)
        String time = "Corinthians!";

        System.out.println(time);

        /* para juntar o texto ocm variável, use-se "+"
        Quando fizermos isso, dizemos que estamos concatenando
         */
        System.out.println("Griteeee!!!! " + time + " O melhor.");

        System.out.println("1" + "1");

        String somaloka = "1" + "1";

        System.out.println(somaloka);

        String somaMaisloka = "1" + 1;

        System.out.println(somaMaisloka);

        // Números em Java
        // ~> Números inteiros 
        int idade = 18;
        int filhos = 2;
        int patas = 4;

        // ~> Números reais
        double altura = 1.7;
        double peso = 70.5;
        double salario = 5100.75;

        //Operações matemáticas básicas
        int soma1 = 1 + 1; // 1 mais 1 
        int multiplicacao1 = 2 * 10; // 2 vezes 10
        int subtracao1 = 8 - 1; // 8 menos 1
        double divisao1 = 144.0 / 12.0; // 144 dividido por 12

        System.out.println("Soma: " + soma1);
        System.out.println("Subtracao: " + subtracao1);
        System.out.println("Multiplicacao: " + multiplicacao1);
        System.out.println("Divisao: " + divisao1);

        // A ordem das operações segue a mesma do maundo real
        double media = (15.0 + 25.0) / 2.0;
        System.out.println("A média entre 15 e 25 é " + media);

        System.out.println("Tcharam..." + (1 + 1));//Entre paranteses ele soma
        System.out.println("Tcharam..." + 1 + 1);//Concatena 
       
    }

}
