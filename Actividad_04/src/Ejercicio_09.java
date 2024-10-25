import java.util.Random;
import java.util.Scanner;

public class Ejercicio_09 {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        
        int[] array = new int[100];
        
        for (int i = 0; i < array.length; i++) {

            array[i] = 1 + random.nextInt(10); 
        }
        
        System.out.print("Introduce un numero entre 1 y 10: ");

        int N = scanner.nextInt();
        
        System.out.println("El numero " + N + " al que has elegido est en la pocición:");
        System.out.println();

        for (int i = 0; i < array.length; i++) {

            if (array[i] == N) {
                
                System.out.print(i + " ");
                
            }
            
        }
        
        scanner.close();
        
    }
}