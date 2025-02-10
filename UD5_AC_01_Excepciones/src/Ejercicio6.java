import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Gato6> gatos = new ArrayList<>();
        
        int cantidadGatos = 5;

        while (gatos.size() < cantidadGatos) {
            System.out.print("\nIntroduce el nombre de un gato: ");
            String nombre = scanner.nextLine();

            System.out.print("Introduce la edad del gato: ");
            String edadInput = scanner.nextLine();

            try {
                int edad = Integer.parseInt(edadInput);
                Gato6 gato = new Gato6(nombre, edad);
                gatos.add(gato); 

                System.out.println("\nGato añadido");
            } 
            
            catch (NumberFormatException e) {
                System.out.println("\nValor incorrecto. Recuerda, debe ser un numero entero");
            } 
            
            catch (ExcepcionNombre6 e) {
                System.out.println(e.getMessage());
            } 
            
            catch (ExcepcionEdad6 e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nInformacion de los gatos: \n");
        
        for (Gato6 gato : gatos) {
            gato.imprimir();
        }

        scanner.close();
    }
}