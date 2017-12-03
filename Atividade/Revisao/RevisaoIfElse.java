
package revisaoifelse;

import java.util.Scanner;


public class RevisaoIfElse {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        
        
        // ~~~~~~~~Atividade1~~~~~~~~ 
        
        
        //leia um número e se for menos que 10 exibir "MENOR QUE 10"
        
        System.out.println("Digite um número");
        int numero = leitor.nextInt();
        
        if (numero < 10){
            System.out.println("Menor que dez");
        }
        
        
        
        
        // ~~~~~~~~Atividade2~~~~~~~~
        
        /*
           Leia 2 números inteiros 
           caso o primeiro for maior ou igual a 5 
           e o segundo for maior ou igual ao 70 
           exiba "UMA BOA COMBINAÇÃO"
        */
        
        
        System.out.println("Digite o primeiro número");
        int num1 = leitor.nextInt();
        
        System.out.println("Digite o segundo número");
        int num2 = leitor.nextInt();
        
        if (num1 >= 5 && num2 >= 70){
            System.out.println("Uma Boa combinação");
        }
        
        
        
        
        //~~~~~~~~Atividade3~~~~~~~~
        
        /*
          Leia 2 números inteiros 
          caso o primeiro for par e o segundo for ímpar 
          exiba "PAR E ÍMPAR"
        */
        
        
        System.out.println("Digite um número");
        int nume1 = leitor.nextInt();
        
        System.out.println("Digite outro número");
        int nume2 = leitor.nextInt();
        
        if (nume1 % 2 == 0 && nume2 % 2 != 0){
            System.out.println("Par e Ímpar");
        }
         
        
        
        
        //~~~~~~~~Atividade4~~~~~~~~
        
        /* 
          Leia a idade da filha e o valor guardado 
          se a idade for igual a 15 e o valor for maior que 15mil 
          exibir "#VaiTerBaile"
        */
        
        System.out.println("Qual a idade da filha?");
        int idade = leitor.nextInt();
        
        System.out.println("Qual o valor?");
        double valor = leitor.nextDouble();
        
        if(idade == 15 && valor > 15000){
            System.out.println("#VaiTerBaile");
        }
        
        
        
        
        //~~~~~~~~Atividade5~~~~~~~~
        
        /*
          Leia um número de faltas que um funcionário teve 
          e a idade do fincionário, se ele não tiver faltas 
          e sua idade for a partir de 60 anos 
          exibir "GANHOU 10 DIAS DE FOLGA!"
        */
        
        System.out.println("Qual a quantidade de faltas");
        int faltas = leitor.nextInt();
        
        System.out.println("Qual a idade do funcionário");
        int idadea = leitor.nextInt();
        
        if (faltas <= 0 && idadea >= 60){
            System.out.println("Ganhou 10 dias de folga!");
        } 
         
        
        
        
        // ~~~~~~~~Atividade6~~~~~~~~
        
        /*
          Leia o valor da mesada e o salário do usuário 
          se sua mesada for maior que R$3000,00 ou seu salário maior que R$5.000,00
          exibir "OSTENTAÇÃO"
        */
        
        System.out.println("Qual o valor da mesada?");
        double mesada = leitor.nextDouble();
        
        System.out.println("Qual o seu salário?");
        double salario = leitor.nextDouble();
        
        if (mesada > 3000 || salario > 5000){
            System.out.println("Ostentação");
        }
        
        
        
        
        //~~~~~~~~Atividade7~~~~~~~~
        
        /*
          Leia o valor da temperatura ambiente 
          se ela for menor que 20 ou maior que 25 
          exibir "TEMPERATURA DESCONFORTÁVEL"
        */
        
        System.out.println("Qual o valor da temperatura?");
        double temperatura = leitor.nextDouble();
        
        if (temperatura < 20 || temperatura > 25){
            System.out.println("Temperatura desconfortável");
        }
                
        
        
        
        //~~~~~~~~Atividade8~~~~~~~~
        
        /*
          Leia o nome do usuário 
          caso ele for exatamente "Mário",
          exibir "Cadê o Luigi!"
        */
        
        System.out.println("Digite seu nome");
        String nome = leitor.next();
        
        if (nome.equals("Mario")){
            System.out.println("Cadê o Luigi?");
        }
        
        
        
        
         //~~~~~~~~Atividade9~~~~~~~~
         
         /*
            Leia a cidade do usuário.
            Caso ele for de "brasilia"(tanto faz, maiúsculas e minúsculas) 
            exibir "VOCÊ MORA NA CAPITAL DO BRASIL"
         */
         
         System.out.println("Qual cidade você mora?");
         String cidade = leitor.next();
         
         if (cidade.equalsIgnoreCase("brasilia")){
             System.out.println("Você mora na capital do Brasil");
         }
          
        
         
         
         //~~~~~~~~Atividade10~~~~~~~~
         
         /*
            Leia o estado do usuário 
            caso ela não for "RS" 
            exibir "VOCÊ´NÃO É GAÚCHO"
         */
         
         System.out.println("Qual o estado que você mora?");
         String estado = leitor.next();
         
         if (!estado.equalsIgnoreCase("RS")){
             System.out.println("Você não é gaúcho");
         }
          
         
         
         
         //~~~~~~~~Atividade11~~~~~~~~
         
         /*
           Use o ELSE quando temos a situação oposta do IF 
           caso ele seja até R$ 940,00 
           exiba "VOCÊ GANHA UM SALÁRIO"
           caso contrário "VOCÊ GANHA MAIS QUE A MAIORIA" 
         */
         
         System.out.println("Qual seu salário?");
         double salarioa = leitor.nextDouble();
         
         if (salarioa <= 940){
             System.out.println("Você ganha um salário");
         }else{
             System.out.println("Você ganha mais que a maioria");
         }
         
         
         
         //~~~~~~~~Atividade12~~~~~~~~
         
         /*
            Leia o país do usuário 
            caso ele for "Australia"
            exibia "VIZINHO DE CANGURUS"
            caso contrário
            exiba "NÃO É AUSTRALIANO"
         */
         
         System.out.println("Qual seu país?");
         String pais = leitor.next();
         
         if (pais.equalsIgnoreCase("Australia")){
             System.out.println("Vizinho de cangurus");
         }else{
             System.out.println("Não é australiano");
         }
         
         
         
                  

    }
    
}
