import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un numero de personas: ");

        int N = scanner.nextInt();
        
        double[] altura1 = new double[N];
        
        for (int i = 0; i < N; i++) {

            System.out.print("Introduce la altura de la persona " + (i + 1) + ": ");

            altura1[i] = scanner.nextDouble();
        }
        
        double suma = 0;
        double max = altura1[0];
        double min = altura1[0];
        
        for (double altura2 : altura1) {

            suma += altura2;

            if (altura2 > max) max = altura2;
            if (altura2 < min) min = altura2;
        }
        
        double media = suma / N;
        
        int mediaAlta = 0;
        int mediaBaja = 0;
        
        for (double altura2 : altura1) {

            if (altura2 > media) mediaAlta++;

            else if (altura2 < media) mediaBaja++;
        }
        
        System.out.println();
        System.out.println("La altura media es: " + media);
        System.out.println();
        System.out.println("La altura máxima es: " + max);
        System.out.println();
        System.out.println("La altura mínima es: " + min);
        System.out.println();
        System.out.println("EL numero de personas que estan por encima de la media: " + mediaAlta);
        System.out.println();
        System.out.println("El numero de personas que estan por debajo de la media: " + mediaBaja);
        System.out.println();

        scanner.close();
    }
}