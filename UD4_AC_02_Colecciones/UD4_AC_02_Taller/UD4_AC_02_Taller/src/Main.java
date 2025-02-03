import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Taller taller = new Taller();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenu:");
            System.out.println("\n1. Añadir coche");
            System.out.println("2. Eliminar coche");
            System.out.println("3. Salir");
            System.out.print("\nSelecciona una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    taller.anadeElemento();

                    break;

                case 2:
                    taller.eliminaElemento();

                    break;

                case 3:
                    System.out.println("\nSaliendo del taller");

                    break;

                default:
                    System.out.println("\nOpcion no valida, prueba de nuevo");
            }
        } 
        
        while (opcion != 3);

        taller.visualizaMatriculas();
        taller.visualizaCoches();
        taller.visualizaTaller();
    }
}