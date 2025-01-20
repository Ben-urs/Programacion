import java.util.Scanner;

public class ProgramaAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Agenda ---");
            System.out.println("\n1. Añadir contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Listar contactos");
            System.out.println("4. Buscar contacto");
            System.out.println("5. Salir");
            System.out.print("\nSeleccione una opcion: ");
            opcion = scanner.nextInt();

            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    if (agenda.añadirContacto()) {
                        System.out.println("\nContacto añadido.");
                    } 
                    
                    else {
                        System.out.println("\nEl contacto ya existe.");
                    }
                    
                    break;

                case 2:
                    System.out.print("\nIngresa el nombre del contacto que quieres eliminar: ");
                    String nombreEliminar = scanner.nextLine();

                    if (agenda.eliminarContacto(nombreEliminar)) {
                        System.out.println("\nContacto eliminado");
                    } 
                    
                    else {
                        System.out.println("\nEl contacto no existe");
                    }
                    
                    break;

                case 3:
                    System.out.println("\nLista de contactos:");
                    agenda.listarContactos();
                    
                    break;

                case 4:
                    System.out.print("\nIngrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    int posicion = agenda.buscaContacto(nombreBuscar);
                    
                    if (posicion != -1) {
                        System.out.println("\nContacto encontrado en la: " + posicion + "º posicion");
                    } 
                    
                    else {
                        System.out.println("\nEl contacto no existe");
                    }

                    break;

                case 5:
                    System.out.println("\nSaliendo de la agenda");

                    break;

                default:
                    System.out.println("\nOpcion no valida. Intente de nuevo");
            }
        } while (opcion != 5);

        scanner.close();
    }
}