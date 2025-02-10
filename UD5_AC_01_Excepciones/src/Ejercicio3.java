import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vector = new double[5];
        
        int i = 0;

        while (i < vector.length) {
            System.out.print("Introduce un valor " + (i + 1) + ": ");
            
            try {
                vector[i] = scanner.nextDouble();
                i++; 
            } 
            
            catch (InputMismatchException e) {
                System.out.println("Valor incorrecto. Recuerda, debe ser un numero entero");
                scanner.next(); 
            }
        }

        System.out.println("\nValores guardados: ");
        
        for (double valor : vector) {
            System.out.println(valor);
        }

        scanner.close();
    }
}