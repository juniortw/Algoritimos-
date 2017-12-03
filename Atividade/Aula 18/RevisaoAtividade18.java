package revisaoatividade18;

import java.util.Scanner;

public class RevisaoAtividade18 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numeros = 0, numerosImpares = 0, numerosPares = 0, contador = 0;

        for (int i = 0; i <= numeros; i++) {
            System.out.println("Digite 10 números? Número: "+(i+1));
            numeros = leitor.nextInt();
            

        if (numeros % 2 == 0) {
            numerosPares ++;
        } else {
            numerosImpares ++;
         }
        
        }
            System.out.println("Você digitou "+numerosImpares+" números pares");
            System.out.println("Você digitou "+numerosPares+" números ímpares");
            
        if (numerosPares == numerosImpares) {
            System.out.println("Você digitou o mesmo número de pares e ímpares");
        } else {
            if (numerosPares > numerosImpares) {
                System.out.println("Você digitou mais números pares");
            } else {
                System.out.println("Você digitou mais números ímpares");
            }    

}
}
}