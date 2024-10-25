import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número de filas: ");
        
        int n = scanner.nextInt();
        
        System.out.print("Introduce un número de columnas: ");
        
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];
        
        int mayorCero = 0, menorCero = 0, igualCero = 0;

        for (int i = 0; i < n; i++) {
           
            for (int j = 0; j < m; j++) {
                System.out.print("Introduce un valor para la posición [" + i + "][" + j + "]: ");
                
                matriz[i][j] = scanner.nextInt();
                
                if (matriz[i][j] > 0) {
                    
                    mayorCero++;

                } else if (matriz[i][j] < 0) {
                    
                    menorCero++;

                } else {
                    
                    igualCero++;
                }
            }
        }

        System.out.println("Valores de la matriz:");
        
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(String.format("| %3d ", matriz[i][j]));
            }
            
            System.out.println("|");
        }

        System.out.println("Numeros mayores que cero: " + mayorCero);
        System.out.println("Numeros menores que cero: " + menorCero);
        System.out.println("Numeros iguales a cero: " + igualCero);
        System.out.println();
        
        scanner.close();
    }
}
