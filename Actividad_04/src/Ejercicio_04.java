import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] num = new int[20];
        int sumaPos = 0;
        int sumaNeg = 0;
        
        for (int i = 0; i < 20; i++) {

            System.out.print("Introduce el número " + (i+1) + " que sea positivo o negativo: ");

            num[i] = scanner.nextInt();
            
            if (num[i] >= 0) {

                sumaPos += num[i];

            } else {

                sumaNeg += num[i];
            }
        }

        System.out.println();
        System.out.println("La suma de los numeros positivos es: " + sumaPos);
        System.out.println("La suma de los numeros negativos es: " + sumaNeg);
        System.out.println();
        
        scanner.close();
    }
}