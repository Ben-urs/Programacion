import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenu:");
            System.out.println("\n1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Visualizar agenda");
            System.out.println("5. Numero de contactos de mi agenda");
            System.out.println("6. Salir");
            System.out.print("\nSelecciona una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agenda.anadeContacto();

                    break;

                case 2:
                    agenda.buscaContacto();

                    break;

                case 3:
                    agenda.eliminaContacto();

                    break;

                case 4:
                    agenda.visualizaAgenda();

                    break;

                case 5:
                    agenda.numeroContactos();

                    break;

                case 6:
                    System.out.println("\nSaliendo de la agenda");

                    break;

                default:
                    System.out.println("\nOpcion no valida, prueba de nuevo");
            }

        } while (opcion != 6);
    }
}