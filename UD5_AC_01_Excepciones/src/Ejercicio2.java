import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        boolean valorA = false;
        boolean valorB = false;

        while (!valorA) {
            System.out.print("\nIntroduce un valor entero A: ");
            
            try {
                a = scanner.nextInt();
                valorA = true; 
            } 
            
            catch (InputMismatchException e) {
                System.out.println("\nValor A incorrecto. Recuerda, debe ser un numero entero");
                scanner.next();
            }
        }

        while (!valorB) {
            System.out.print("Introduce un valor entero B: ");
            
            try {
                b = scanner.nextInt();
                valorB = true; 
            } 
            
            catch (InputMismatchException e) {
                System.out.println("\nValor B incorrecto. Recuerda, debe ser un numero entero\n");
                scanner.next();
            }
        }

        try {
            int resultado = a / b;
            System.out.println("\nEl resultado de A/B es: " + resultado);
        } 
        
        catch (ArithmeticException e) {
            System.out.println("\nNo se puede dividir entr 0");
        }

        scanner.close();
    }
}