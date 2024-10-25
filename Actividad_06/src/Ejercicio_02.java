import java.util.Scanner;

public class Ejercicio_02  {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int[][] matriz = new int[10][10];

            for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                matriz[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print(String.format("| %3d ", matriz[i][j]));
            }

            System.out.println("|");
            System.out.println();
        }
        
            scanner.close();
        }
    }