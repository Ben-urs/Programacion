import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] num = new double[20];
        double suma = 0;

        System.out.println("Introduce 20 numeros para calcular la media de todos: ");
        System.out.println();
        
        for (int i = 0; i < 20; i++) {

            System.out.print("Introduce el número " + (i+1) + ": ");

            num[i] = scanner.nextDouble();

            suma += num[i];
        }
        
        double media = suma / num.length;

        System.out.println();
        System.out.println("La media de todos los numeros es: " + media);
        System.out.println();
        
        scanner.close();
    }
}