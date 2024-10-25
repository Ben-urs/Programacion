import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer numero: ");

        int P = scanner.nextInt();

        System.out.print("Introduce el ultimo numero: ");

        int Q = scanner.nextInt();
        
        int[] array = new int[Q - P + 1];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = P + i;
        }
        
        System.out.println("Muestra de la cuenta: ");
        System.out.println();

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
            System.out.println();
        }
        
        System.out.println();

        scanner.close();
    }
}