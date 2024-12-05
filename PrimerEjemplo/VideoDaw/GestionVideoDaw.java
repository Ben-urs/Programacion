import java.util.Scanner;

public class GestionVideoDaw {
    public static void main(String[] args) {
        VideoDaw videoClub = new VideoDaw("CIF12345", "Calle Ejemplo 123", LocalDate.now());
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Crear y registrar VideoClub");
            System.out.println("2. Registrar película");
            System.out.println("3. Crear y registrar cliente");
            System.out.println("4. Alquilar película");
            System.out.println("5. Devolver película");
            System.out.println("6. Dar de baja cliente");
            System.out.println("7. Dar de baja película");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Lógica para crear y registrar un nuevo VideoClub
                    break;
                case 2:
                    // Lógica para registrar película
                    break;
                case 3:
                    // Lógica para registrar cliente
                    break;
                case 4:
                    // Lógica para alquilar película
                    break;
                case 5:
                    // Lógica para devolver película
                    break;
                case 6:
                    // Lógica para dar de baja cliente
                    break;
                case 7:
                    // Lógica para dar de baja película
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 8);

        scanner.close();
    }
}
