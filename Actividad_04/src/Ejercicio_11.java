import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[100];
        int[] array2 = new int[100];

        for (int i = 0; i < 100; i++) {

            array1[i] = i + 1;
        }

        for (int i = 0; i < 100; i++) {

            array2[i] = array1[99 - i];
        }

        System.out.println("Aqui se muestra el primer array: ");

        for (int i = 0; i < 100; i++) {

            System.out.print(array1[i] + " ");
            
        }

        System.out.println();
        System.out.println();
        System.out.println("Y aqui se muestra el segundo array en orden inversa: ");

        for (int i = 0; i < 100; i++) {

            System.out.print(array2[i] + " ");
        }

        scanner.close();

    }
}