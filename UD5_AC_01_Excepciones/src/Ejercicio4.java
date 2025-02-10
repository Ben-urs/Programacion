import java.util.Scanner;

public class Ejercicio4 {

    static void imprimePositivo(int p) throws ExcepcionPositiva4 {
        if (p < 0) {
            throw new ExcepcionPositiva4("\nEl valor tiene que ser positivo");
        }
        
        System.out.println("Valor positivo: " + p);
    }

    static void imprimeNegativo(int n) throws ExcepcionNegativa4 {
        if (n >= 0) {
            throw new ExcepcionNegativa4("\nEl valor tiene que ser negativo");
        }

        System.out.println("Valor negativo: " + n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean s = true;

        while (s) {
            System.out.print("\nIntroduce un valor entero. (Introduce 's' para salir): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("s")) {
                s = false;

                return;
            }

            try {
                int numero = Integer.parseInt(input);

                try {
                    imprimePositivo(numero);
                } 
                
                catch (ExcepcionPositiva4 e) {
                    System.out.println(e.getMessage());
                }

                try {
                    imprimeNegativo(numero);
                } 
                
                catch (ExcepcionNegativa4 e) {
                    System.out.println(e.getMessage());
                }

            } 
            
            catch (NumberFormatException e) {
                System.out.println("\nValor incorrecto. Recuerda, debe ser un numero entero");
            }
        }

        scanner.close();
    }
}