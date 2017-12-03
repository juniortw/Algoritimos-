

package br.com.bandtec.projetoarquivotexto;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;


public class EscritorArquivos {
    
    public static void main(String[] args) throws IOException {
        
        String conteudo = "Fui me confessar ao mar \r\n"+
                            "O que ele disse? 'Nada'";
        
        File novoArquivo = new File("h:/poema.txt");
        
        FileUtils.writeStringToFile(novoArquivo, conteudo);
    }
    
}
