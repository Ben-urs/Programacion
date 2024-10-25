import java.util.Random;
import java.util.Scanner;

public class Ejercicio_08 {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        
        double[] array = new double[100];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(); 
        }
        
        System.out.print("Introduce un numero entre 0.0 y 1.0: ");

        double R = scanner.nextDouble();
        
        int calcular = 0;

        for (double num : array) {
            
            if (num >= R) {
                calcular++;
            }
        }
        
        System.out.println("Cantidad de numeros iguales o mayores: " + calcular);
        System.out.println();

        scanner.close();
    }
}
