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
                    agregarContactoPersona(agenda, scanner);

                    break;

                case 2:
                    agregarContactoEmpresa(agenda, scanner);

                    break;

                case 3:
                    eliminarContactoPorNombre(agenda, scanner);

                    break;

                case 4:
                    listarContactos(agenda);

                    break;

                case 5:
                    buscarContactoPorNombre(agenda, scanner);

                    break;

                case 6:
                    continuar = false;

                    break;

                default:
                    System.out.println("\nOpcion no valida");
            }
        }
        
        System.out.println("\nSaliendo de la agenda");
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n1. Añadir una persona a contactos");
        System.out.println("2. Añadir una empresa a contactos");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Listar contactos");
        System.out.println("5. Buscar contacto");
        System.out.println("6. Salir");
        System.out.print("\nSeleccione una opcion: ");
    }

    private static void agregarContactoPersona(Agenda agenda, Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Telefono: ");
        String telefono = scanner.nextLine();

        System.out.print("Cumpleaños: ");
        String cumpleanos = scanner.nextLine();
        
        ContactoPersona contactoPersona = new ContactoPersona(nombre, telefono, cumpleanos);

        if (agenda.añadirContacto(contactoPersona)) {
            System.out.println("\nPersona añadida a contactos");
        } 
        
        else {
            System.out.println("\nNo se pudo añadir el contacto");
        }
    }

    private static void agregarContactoEmpresa(Agenda agenda, Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Telefono: ");
        String telefono = scanner.nextLine();

        System.out.print("Pagina web: ");
        String paginaWeb = scanner.nextLine();
        
        ContactoEmpresa contactoEmpresa = new ContactoEmpresa(nombre, telefono, paginaWeb);

        if (agenda.añadirContacto(contactoEmpresa)) {
            System.out.println("\nEmpresa añadida a contactos");
        } 
        
        else {
            System.out.println("\nNo se pudo añadir el contacto");
        }
    }

    private static void eliminarContactoPorNombre(Agenda agenda, Scanner scanner) {
        System.out.print("\nEscriba el nombre del contacto para poder eliminarlo: ");
        String nombreEliminar = scanner.nextLine();

        if (agenda.eliminarContacto(nombreEliminar)) {
            System.out.println("\nContacto eliminado");
        } 
        
        else {
            System.out.println("\nNo se encontro el contacto");
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