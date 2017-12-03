
package projetometodos;

import java.util.Random;


public class ProjetoMetodos {
    
    // Método SEM RETORNO chamado "darBoasVindas"
    public static void darBoasVindas() {
        System.out.println("Boas vindas!!!");
        
    }
    // Método COM RETORNO String chamado "mensagemBoasVindas"
    public static String mensagemBoasVindas(){
        return "Olá, seja bem vindo(a)";
    }
    
    public static int numeroInteiroAleatorio(){
        Random r = new Random();
        int aleatorio = r.nextInt(1000);
        return aleatorio;
    }
    
    public static void main(String[] args) {
        // Invocando o método "darBoasVindas"
        darBoasVindas();
        
        String msg = mensagemBoasVindas();
        System.out.println(msg);
        
        System.out.println(mensagemBoasVindas());
        
        int numeroLoko = numeroInteiroAleatorio();
        System.out.println("Número loko: "+numeroLoko);
        System.out.println(numeroInteiroAleatorio());
        
        
        
    }
    
}
