

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import java.util.Scanner;

public class ValidadorCPF {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu CPF");
        String cpf = leitor.next();

        CPFValidator validator = new CPFValidator();

        try {
            validator.assertValid(cpf);
            System.out.println("CPF "+cpf+ " é válido");
            
        } catch (InvalidStateException e) {
            System.out.println("CPF "+cpf+ " é inválido");
        }



    }
  }
