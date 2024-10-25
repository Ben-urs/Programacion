import java.util.Scanner;

public class Ejercicio_02 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el primer texto:");
        String texto1 = scanner.nextLine();
        
        System.out.println("Introduce el segundo texto:");
        String texto2 = scanner.nextLine();
        
        System.out.println();
        
        if (texto1.equals(texto2)) {	
            
            System.out.println("Los dos textos son iguales.");    
        } 

        else {     	
            
            System.out.println("Los dos textos no son iguales.");
        }

        System.out.println();
        
        if (texto1.equalsIgnoreCase(texto2)) {
            
            System.out.println("Los textos son iguales ignorando las mayúsculas y las minúsculas.");           
        } 
    
        else {
            
            System.out.println("Los textos no son iguales ignorando las mayúsculas y las minúsculas.");
        }

        System.out.println();
        
        scanner.close();
    }
}