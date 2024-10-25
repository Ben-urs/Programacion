import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el tamaño del array): ");

        int N = scanner.nextInt();

        System.out.print("Introduce un numero para guardar en todas las casillas del array: ");

        int M = scanner.nextInt();
        
        int[] array = new int[N];
        
        for (int i = 0; i < N; i++) {
            array[i] = M;
        }
        
        System.out.println();
        System.out.println("Muestra de los datos gyardados en el array: ");
        System.out.println();

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
            System.out.println();
        }
        
        System.out.println();

        scanner.close();
    }
}