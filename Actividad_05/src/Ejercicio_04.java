import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce una frase: ");
        
        String frase = scanner.nextLine().toLowerCase();
        
        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;

        System.out.println();
        
        for (char c : frase.toCharArray()) {
        	
            switch (c) {
                case 'a': contA++; break;
                case 'e': contE++; break;
                case 'i': contI++; break;
                case 'o': contO++; break;
                case 'u': contU++; break;
            }
        }
        
        System.out.println("Numero de A's: " + contA);
        System.out.println("Numero de E's: " + contE);
        System.out.println("Numero de I's: " + contI);
        System.out.println("Numero de O's: " + contO);
        System.out.println("Numero de U's: " + contU);
        System.out.println();

        scanner.close();
    }
}
