import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("Mostrar valores, introduce (a)");
            System.out.println("Introducir valor, introduce (b)");
            System.out.println("Salir, introduce (c)");
            System.out.println();
            System.out.print("Elige una opción: ");

            opcion = scanner.next().charAt(0);

            switch (opcion) {

                case 'a':
                    System.out.println();
                    System.out.println("Valores dentro del array:");
                    System.out.println();

                    for (int i = 0; i < array.length; i++) {

                        System.out.print(array[i] + " ");
                    }

                    System.out.println();

                    break;

                case 'b':

                    System.out.print("Introduce un valor: ");

                    int valor = scanner.nextInt();

                    System.out.print("Introduce una posicion entre 0 y 9: ");

                    int posicion = scanner.nextInt();

                    if (posicion >= 0 && posicion < 10) {

                        array[posicion] = valor;

                    } else {
                        System.out.println("La Posición es invalida.");
                    }
                    break;

                case 'c':
                    System.out.println("Saliste del menu.");

                    break;

                default:
                    System.out.println("la Opcion no es valida.");
            }

        } while (opcion != 'c');

        scanner.close();
    }
}