
package br.com.jr.qualidadescolega;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;


public class QuantidadeColegas {
    
    public static void main(String[] args) throws IOException {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Qual o nome do colega?");
        String nome = leitor.next();
        
        File meuArquivo = new File(nome+ ".txt");
        
        if (meuArquivo.exists()){
        for(String linha: FileUtils.readLines(meuArquivo)){
           System.out.println(linha);
        
        } 
        }else {
            System.out.println("Você não cadastrou a qualidade do colega "+nome);
        }
        
        
    }
    
}
