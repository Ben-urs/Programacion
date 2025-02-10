import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean s = true;

        while (s) {
            System.out.print("\nIntroduce el nombre de un gato (o escribe 's' para salir): ");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("s")) {
                s = false;
                return;
            }

            System.out.print("Introduce la edad del gato: ");
            String edadInput = scanner.nextLine();

            try {
                int edad = Integer.parseInt(edadInput);
                Gato5 gato = new Gato5(nombre, edad);
                gato.imprimir();
            } 
            
            catch (NumberFormatException e) {
                System.out.println("\nValor incorrecto. Recuerda, debe ser un numero entero");
            } 
            
            catch (ExcepcionNombre5 e) {
                System.out.println(e.getMessage());
            } 
            
            catch (ExcepcionEdad5 e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}