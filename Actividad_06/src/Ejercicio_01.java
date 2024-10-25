import java.util.Scanner;

public class Ejercicio_01  {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int[][] matriz = new int[5][5];
            
            int num = 1;
    
            for (int i = 0; i < 5; i++) {
                
                for (int j = 0; j < 5; j++) {
                    
                    matriz[i][j] = num++;
                }
            }
    
           
            for (int i = 0; i < 5; i++) {
                
                for (int j = 0; j < 5; j++) {
                    System.out.print(String.format("| %2d ", matriz[i][j]));
                }
                
                System.out.print("|");
                System.out.println();           
            }
        
            scanner.close();
        }
    }
