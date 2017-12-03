
package br.com.jr.projetotextosmagicos;

import org.apache.commons.lang3.StringUtils;


public class ProjetoTextosMagicos {
    
    public static void main(String[] args) {
      
      String texto = "amor"; 
      System.out.println("Qual o nome?");
      
        
      String s1 = StringUtils.leftPad(texto, 12, ".");
      System.out.println(s1);


        
     
        
    }
    
}
