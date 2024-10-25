import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de trabajadores: ");

        int N = scanner.nextInt();

        double[][] info = new double[N][2];

        for (int i = 0; i < N; i++) {
            System.out.println((i + 1) + " Trabajador");
            System.out.print("Introduce el genero, 0 para varon o 1 para mujer: ");

            info[i][0] = scanner.nextDouble();
            System.out.print("Introduce su salario: " );

            info[i][1] = scanner.nextDouble();
        }

        double sumH = 0, sumM = 0;

        int contH = 0, contM = 0;

        for (int i = 0; i < N; i++) {

            if (info[i][0] == 0) {

                sumH += info[i][1];

                contH++;

            } else {

                sumM += info[i][1];

                contM++;
            }
        }

        double sueldoMedioHombres = contH > 0 ? sumH / contH : 0;
        double sueldoMedioMujeres = contM > 0 ? sumM / contM : 0;

        System.out.println("El salario medio de los hombres es: " + sueldoMedioHombres);
        System.out.println("El salario medio de las mujeres es: " + sueldoMedioMujeres);
        System.out.println();
    

        scanner.close();
    }
}
