import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        System.out.println("Gestion de Mascotas");

        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarNuevaMascota(inventario);

                    break;

                case 2:
                    inventario.mostrarListaDeMascotas();

                    break;

                case 3:
                    mostrarMascotaPorIndice(inventario, scanner);

                    break;

                case 4:
                    inventario.mostrarTodosLosDetalles();

                    break;

                case 5:
                    eliminarMascotaPorIndice(inventario, scanner);

                    break;

                case 6:
                    inventario.vaciarInventario();
                    System.out.println("Inventario vaciado.");

                    break;

                case 7:
                    continuar = false;

                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n1. Insertar mascota");
        System.out.println("2. Mostrar lista de mascotas");
        System.out.println("3. Mostrar detalles de una mascota específica");
        System.out.println("4. Mostrar todos los detalles de las mascotas");
        System.out.println("5. Eliminar mascota");
        System.out.println("6. Vaciar inventario");
        System.out.println("7. Salir");
        System.out.print("\nSeleccione una opción: ");
    }

    private static void agregarNuevaMascota(Inventario inventario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nTipo de mascota a agregar:");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Loro");
        System.out.println("4. Canario");
        System.out.print("Seleccione tipo: ");

        int tipo = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Estado (vivo/fallecido): ");
        String estado = scanner.nextLine();

        System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
        String fechaNacimiento = scanner.nextLine();

        switch (tipo) {

            case 1:
                agregarPerro(inventario, nombre, edad, estado, fechaNacimiento, scanner);

                break;

            case 2:
                agregarGato(inventario, nombre, edad, estado, fechaNacimiento, scanner);

                break;

            case 3:
                agregarLoro(inventario, nombre, edad, estado, fechaNacimiento, scanner);

                break;

            case 4:
                agregarCanario(inventario, nombre, edad, estado, fechaNacimiento, scanner);

                break;

            default:
                System.out.println("Tipo de mascota no válido.");
        }
    }

    private static void agregarPerro(Inventario inventario, String nombre, int edad, String estado, String fechaNacimiento, Scanner scanner) {
        System.out.print("Raza: ");
        String raza = scanner.nextLine();

        System.out.print("¿Tiene pulgas? (si/no): ");
        boolean tienePulgas = scanner.nextLine().equalsIgnoreCase("si");
        inventario.agregarMascota(new Perro(nombre, edad, estado, fechaNacimiento, raza, tienePulgas));
    }

    private static void agregarGato(Inventario inventario, String nombre, int edad, String estado, String fechaNacimiento, Scanner scanner) {
        System.out.print("Color: ");
        String color = scanner.nextLine();

        System.out.print("¿Tiene pelo largo? (si/no): ");
        boolean tienePeloLargo = scanner.nextLine().equalsIgnoreCase("si");
        inventario.agregarMascota(new Gato(nombre, edad, estado, fechaNacimiento, color, tienePeloLargo));
    }

    private static void agregarLoro(Inventario inventario, String nombre, int edad, String estado, String fechaNacimiento, Scanner scanner) {
        System.out.print("Tipo de pico: ");
        String tipoDePico = scanner.nextLine();

        System.out.print("¿Puede volar? (si/no): ");
        String capacidadDeVuelo = scanner.nextLine();
        System.out.print("Origen: ");
        String lugarDeOrigen = scanner.nextLine();
        
        System.out.print("¿Habla?: ");
        String fraseHablar = scanner.nextLine();
        inventario.agregarMascota(new Loro(nombre, edad, estado, fechaNacimiento, tipoDePico, capacidadDeVuelo, lugarDeOrigen, fraseHablar));
    }

    private static void agregarCanario(Inventario inventario, String nombre, int edad, String estado, String fechaNacimiento, Scanner scanner) {
        System.out.print("Tipo de pico: ");
        String tipoDePicoCanario = scanner.nextLine();
        System.out.print("¿Puede volar? (si/no): ");
        String capacidadDeVueloCanario = scanner.nextLine();
        System.out.print("Color: ");
        String colorCanario = scanner.nextLine();
        System.out.print("¿Canta? (si/no): ");
        boolean canta = scanner.nextLine().equalsIgnoreCase("si");
        inventario.agregarMascota(new Canario(nombre, edad, estado, fechaNacimiento, tipoDePicoCanario, capacidadDeVueloCanario, colorCanario, canta));
    }

    private static void mostrarMascotaPorIndice(Inventario inventario, Scanner scanner) {
        System.out.print("Introduzca el número asignado de la mascota (0, 1, 2, etc.): ");
        int indice = scanner.nextInt();
        inventario.mostrarMascotaPorIndice(indice);
    }

    private static void eliminarMascotaPorIndice(Inventario inventario, Scanner scanner) {
        System.out.print("Introduzca el número asignado de la mascota para eliminarlo (0, 1, 2, etc.): ");
        int indiceEliminar = scanner.nextInt();
        inventario.eliminarMascotaPorIndice(indiceEliminar);
    }
}