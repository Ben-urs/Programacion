import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] num = new double[10];
        
        for (int i = 0; i < 10; i++) {

            System.out.print("Introduce el número " + (i+1) + ": ");

            num[i] = scanner.nextDouble();
        }
        
        double max = num[0];
        double min = num[0];
        
        for (int i = 1; i < num.length; i++) {

            if (num[i] > max) max = num[i];

            if (num[i] < min) min = num[i];
        }

        System.out.println();
        System.out.println("El numero máximo introducido es: " + max);
        System.out.println("El numero mínimo introducido es: " + min);
        System.out.println();
        
        scanner.close();
    }
}