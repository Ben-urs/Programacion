import java.util.Scanner;

public class ProgramaAgenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda(); 

        System.out.println("\nAgenda");

        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();

            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarContacto(agenda, scanner);

                    break;

                case 2:
                    eliminarContactoPorNombre(agenda, scanner);

                    break;

                case 3:
                    listarContactos(agenda);

                    break;

                case 4:
                    buscarContactoPorNombre(agenda, scanner);

                    break;

                case 5:
                    continuar = false;

                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
        System.out.println("\nSaliendo de la agenda\n");
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n1. Añadir contacto");
        System.out.println("2. Eliminar contacto");
        System.out.println("3. Listar contactos");
        System.out.println("4. Buscar contacto");
        System.out.println("5. Salir");
        System.out.print("\nSeleccione una opcion: ");
    }

    private static void agregarContacto(Agenda agenda, Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Telefono: ");
        String telefono = scanner.nextLine();

        Contacto contacto = new Contacto(nombre, telefono);

        if (agenda.añadirContacto(contacto)) {
            System.out.println("Contacto añadido");         
        } 
        
        else {
            System.out.println("No se pudo añadir el contacto");
        }
    }

    private static void eliminarContactoPorNombre(Agenda agenda, Scanner scanner) {
        System.out.print("Nombre del contacto para eliminarlo: ");
        String nombreEliminar = scanner.nextLine();

        if (agenda.eliminarContacto(nombreEliminar)) {
            System.out.println("Contacto eliminado");
        } 
        
        else {
            System.out.println("No se encontro el contacto");
        }
    }

    private static void listarContactos(Agenda agenda) {
        System.out.println("\nLista de contactos:");
        agenda.listarContactos();
    }

    private static void buscarContactoPorNombre(Agenda agenda, Scanner scanner) {
        System.out.print("\nNombre del contacto: ");
        String nombreBuscar = scanner.nextLine();
        
        int posicion = agenda.buscaContacto(nombreBuscar);
        if (posicion != -1) {
            System.out.println("\nContacto encontrado en la: " + posicion + "º posicion");
        } 
        
        else {
            System.out.println("\nContacto no encontrado");
        }
    }
}
