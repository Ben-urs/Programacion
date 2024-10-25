import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce una frase:"); 

        String frase = scanner.nextLine().replace(" ", "").toLowerCase();
        
        StringBuilder reves = new StringBuilder(frase).reverse();
        
        System.out.println();
        
        if (frase.equals(reves.toString())) {
        	
            System.out.println("La frase es un palíndromo.");
            
        } 
        
        else {
        	
            System.out.println("La frase no es un palíndromo.");
        }
        
        System.out.println();

        scanner.close();
    }
}