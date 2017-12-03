package atividade4;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        
          Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual seu salário bruto? ");
        double salario = leitor.nextDouble();
        
        System.out.println("Quantos porcentos vai pro INSS? ");
        double inss = leitor.nextDouble ();
        
        System.out.println("Quantos porcentos vai pro FGTS? ");
        double fgts = leitor.nextDouble ();
        
        System.out.println("Quantos porcentos vai pro IR? ");
        double ir = leitor.nextDouble ();
        
        System.out.println("Você ganha VR, qual valor? ");
        double vr = leitor.nextDouble ();
        
        double salarioferias = salario * 0.03 + salario; 
        
        double salarioferias2 = salario * 0.09 + salario;
        
        double salariobruto = salario - inss - fgts - ir ;
        
        System.out.println("Seu salário líquido ordinário é R$"+salariobruto+".  No seu mês de férias, ganha líquido R$" +salarioferias+".  Em dezembro seu líquido é R$"+salarioferias2+".");
        
        
        
        
        
    }
    
}
