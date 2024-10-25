import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] num = new double[10];

        double suma = 0;
        
        for (int i = 0; i < 10; i++) {

            System.out.print("Introduce un número " + (i+1) + ": ");

            num[i] = scanner.nextDouble();

            suma += num[i];
        }

        System.out.println();
        System.out.println("La suma de todos es: " + suma);
        System.out.println();

        scanner.close();
    }
}