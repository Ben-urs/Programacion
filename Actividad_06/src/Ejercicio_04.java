import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[4][5];

        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce las notas del Alumno " + (i + 1));
            
            for (int j = 0; j < 5; j++) {
                System.out.print("Introduce la nota de la asignatura " + (j + 1) + ": ");
                
                notas[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 4; i++) {

            double min = notas[i][0], max = notas[i][0], sum = 0;

            for (int j = 0; j < 5; j++) {

                max = Math.max(max, notas[i][j]);

                min = Math.min(min, notas[i][j]);

                sum += notas[i][j];
            }

            double media = sum / 5;

            System.out.println("Notas del Alumno " + (i + 1) + ":");
            System.out.println("Su nota maxima es: " + max);
            System.out.println("Su nota minima es: " + min);
            System.out.println("Su nota media es: " + media);
            System.out.println();
        }

        scanner.close();
    }
}