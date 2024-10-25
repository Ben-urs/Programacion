import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[10];
        
        for (int i = 0; i < 10; i++) {

            System.out.print("Introduce el número " + (i+1) + ": ");

            numeros[i] = scanner.nextDouble();
        }
        
        System.out.println("Los números introducidos son:");
        System.out.println();

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);
        }
        
        System.out.println();

        scanner.close();
    }
}