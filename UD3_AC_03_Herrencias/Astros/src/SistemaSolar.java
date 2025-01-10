import java.util.Scanner;

public class SistemaSolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Astros[] cuerpos = new Astros[10];
        int contador = 0;

        while (true) {
            System.out.println("\nMenu del Sistema Solar: \n");
            System.out.println("1. Añadir Astro");
            System.out.println("2. Mostrar Informacion de Astros");
            System.out.println("3. Salir \n");
            System.out.print("Elige una opcion: ");

            String opcion = scanner.nextLine();

            if (opcion.equals("1")) {
                System.out.print("\nIntroduce el nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Introduce la masa: ");
                double masa = scanner.nextDouble();

                System.out.print("Introduce el diametro: ");
                double diametro = scanner.nextDouble();

                System.out.print("Introduce el periodo de rotacion: ");
                double periodoRotacion = scanner.nextDouble();

                System.out.print("Introduce el periodo de traslacion: ");
                double periodoTraslacion = scanner.nextDouble();

                System.out.print("Introduce la distancia media: ");
                double distanciaMedia = scanner.nextDouble();

                scanner.nextLine(); 

                System.out.println("\n¿Es un planeta o un satelite?");
                System.out.println("1. Planeta");
                System.out.println("2. Satelite\n");
                System.out.print("Elige una opcion: ");

                String tipo = scanner.nextLine();

                if (tipo.equals("1")) {
                    System.out.print("\nIntroduce la distancia al Sol: ");
                    double distanciaAlSol = scanner.nextDouble();

                    System.out.print("Introduce la orbita: ");
                    double orbita = scanner.nextDouble();

                    System.out.print("¿Tiene satelites? (si/no): ");
                    String respuesta = scanner.next();

                    boolean tieneSatelites = scanner.nextBoolean();

                    scanner.nextLine(); 

                    cuerpos[contador++] = new Planeta(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia, distanciaAlSol, orbita, tieneSatelites);
                } 
                
                else if (tipo.equals("2")) {
                    System.out.print("\nIntroduce la distancia al planeta: ");
                    double distanciaAlPlaneta = scanner.nextDouble();

                    System.out.print("Introduce la orbita al planeta: ");
                    double orbitaPlaneta = scanner.nextDouble();

                    scanner.nextLine(); 

                    System.out.print("Introduce el nombre del planeta al que orbita: ");
                    String planetaOrbita = scanner.nextLine();

                    cuerpos[contador++] = new Satelite(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia, distanciaAlPlaneta, orbitaPlaneta, planetaOrbita);
                } 
                
                else {
                    System.out.println("\nOpcion no valida.");
                }

            } 
            
            else if (opcion.equals("2")) {
                if (contador == 0) {
                    System.out.println("\nNo hay astros registrados.");

                } 
                
                else {
                    for (int i = 0; i < contador; i++) {
                        System.out.println(cuerpos[i]);
                    }
                }

            } else if (opcion.equals("3")) {
                System.out.println("\nSaliendo");

                break;
            } 
            
            else {
                System.out.println("\nOpcin no valida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}