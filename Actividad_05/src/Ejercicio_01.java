import java.util.Scanner;

public class Ejercicio_01  {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un de texto:");
        
        String texto = scanner.nextLine();	

        System.out.println();
        
        String[] palab1 = texto.split(" ");
        
        for (String palab2 : palab1) {           
            
            System.out.println(palab2);
            System.out.println();
        }

        scanner.close();
    }
}