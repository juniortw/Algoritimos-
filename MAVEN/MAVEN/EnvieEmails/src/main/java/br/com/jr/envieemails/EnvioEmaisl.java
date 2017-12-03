package br.com.jr.envieemails;

import java.util.Scanner;

public class EnvioEmaisl {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o email?");
        String EnvioEmail = leitor.next();
        
        System.out.println("Qual o Assunto?");
        String assunto = leitor.next();
        
        System.out.println("Digite a mensagem?");
        String mensagem = leitor.next();
        

        SimpleEmail email = new SimpleEmail();
        
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("juuh.tw@gmail.com", "fr072dp303fgk"));
        email.setSSLOnConnect(true);
        email.setFrom("juuh.tw@gmail.com");
        email.setSubject(assunto);
        email.setMsg(mensagem);
        email.addTo(EnvioEmail);
        email.send();
    }

}
