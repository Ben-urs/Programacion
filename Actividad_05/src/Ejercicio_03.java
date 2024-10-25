import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre:");      
        String nombre = scanner.nextLine();
        
        System.out.println("Introduce tu primer apellido:");      
        String apellido1 = scanner.nextLine();
        
        System.out.println("Introduce tu segundo apellido:");       
        String apellido2 = scanner.nextLine();
        
        String codUsuario = nombre.substring(0, 3).toUpperCase() +
                               apellido1.substring(0, 3).toUpperCase() +
                               apellido2.substring(0, 3).toUpperCase();
        
        System.out.println("El codigo del usuario es: " + codUsuario);
        System.out.println();

        scanner.close();   
    }
}
