
package projetometodoscomparametro;


public class ProjetoMetodosComParametro {
    
    // Método com retorno de String e 1 parâmetro String
    public static String mensagemBoasVindas(String nome){
        String msg = "Seja bem vindo(a), "+nome;
        return msg;
    }
    
    //
    public static String mensagemIdade (String nome, int idade){
        String msgIdade = idade >= 18 ?"Maior de idade":"Menor de idade";
        String msg = "Seu nome é "+nome+" e você é "+msgIdade;
        return msg;
    }
    
    /*
      Crie um método que receba a altura e o peso 
      e retorne o IMC 
      invoque este método no main()
    */
    public static String pesoAltura (double peso, double altura){
        return ((altura*altura)/peso);
              
    }
    /*
      Crie um programa que receba o nome do país, do estado e da cidade 
      Retorne a frese "Você mora na cidade "X", estado "Y" e país "Z""
      Invoque esse método no main() 2x com valores diferentes
    */
    
    
    public static void main(String[] args) {
        System.out.println(mensagemBoasVindas("Zé"));
        
        String nomeLoko = "Maria";
        System.out.println(mensagemBoasVindas(nomeLoko));
        
        
        System.out.println(mensagemIdade("Zé", 40));
        System.out.println(mensagemIdade("Maria", 15));
        
        
        System.out.println(pesoAltura(1.75, 80));
        System.out.println(pesoAltura(1.9, 130));
        
    }
    
}
