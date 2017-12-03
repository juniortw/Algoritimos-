
package somososprimeiros;


public class SomosOsPrimeiros {

    
    public static void main(String[] args) {
       
        int p1 = 0;

        
        while (p1 < 11){
            
            if (p1 < 5){
            System.out.println("Somos os primeiros");
            }
        
            if (p1 >= 5 && p1 < 10){
            System.out.println("Somos os últimos");
            }
                    
            if (p1 == 10 ){
            System.out.println("Sou o último");
            } 
            p1++;
        }
    
    
    }
    
}
