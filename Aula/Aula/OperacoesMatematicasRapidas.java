
package operacoesmatematicasrapidas;


public class OperacoesMatematicasRapidas {

    
    public static void main(String[] args) {
        
        int numeroX = 10;
        
        // numeroX é igual a ele mesmo mais 8
        //numeroX = numeroX + 8;
        
        numeroX += 8;        
        System.out.println(numeroX);
        
        numeroX -= 8;        
        System.out.println(numeroX);
        
        numeroX *= 8;        
        System.out.println(numeroX);
        
        numeroX /= 8;        
        System.out.println(numeroX);
        
        //número é igual a ele mesmo +1 
        numeroX++; //o ++ aumenta o valor em +1
        System.out.println(numeroX);
        
        //número é igual a ele mesmo -1 
        numeroX--; //o -- reduz o valor em -1
        System.out.println(numeroX);
        
        ++numeroX; //é a mesma coisa?
        System.out.println(numeroX);
        
        //NÂO É A MESMA COISA 
        System.out.println(numeroX++);// Pega o valor e soma depois +1
        System.out.println(++numeroX);// Pega o valor 1 e soma antes 
        
        //O operador += também funciona para texto! Ele concatena! 
        String gago = "Olá ";
        gago += gago; 
        System.out.println(gago);
        
        // Quando a linha fica vermelha se chama "Erro de compilação"
        // Quando fica vermelho quando o codigo esta em execução, se chama "Erro em tempo de execução"
    }
    
}
