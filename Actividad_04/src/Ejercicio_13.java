import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println();
        System.out.print("Introduce el primer numero: ");
        

        int V = scanner.nextInt();

        System.out.println();
        System.out.print("Introduce el numero con el cual incrementaran: ");

        int I = scanner.nextInt();

        System.out.println();
        System.out.print("Introduce el número de valores que quieres que se muestren: ");

        int N = scanner.nextInt();
        
        int[] secuencia = new int[N];
        
        for (int i = 0; i < N; i++) {
            
            secuencia[i] = V + (i * I);
        }
        
        System.out.println();
        System.out.println("La secuencia aritmética es:");

        for (int valor : secuencia) {

            System.out.print(valor + " ");
        }
        
        scanner.close();
    }
}
