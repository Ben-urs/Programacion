import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        boolean Input = false;

        while (!Input) {
            System.out.print("\nIntroduce un valor entero A: ");
            
            try {
                a = scanner.nextInt();
                Input = true; 
            } 

            catch (InputMismatchException e) {
                System.out.println("\nValor incorrecto. Recuerda, debe ser un numero entero");
                scanner.next(); 
            }
        }

        System.out.println("\nValor introducido: " + a);

        scanner.close();
    }
}