import java.util.HashMap;
import java.util.Scanner;

public class Taller {
    private HashMap<String, Coche> coches;

    public Taller() {
        coches = new HashMap<>();
    }

    // Metodos //

    public void anadeElemento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce la matriculadel coche: ");
        String matricula = scanner.nextLine().toUpperCase(); 

        if (coches.containsKey(matricula)) {
            System.out.println("Matricula en uso");
           
            return;
        }

        System.out.print("Introduce el color del coche: ");
        String color = scanner.nextLine();
        
        System.out.print("Introduce la marca del coche: ");
        String marca = scanner.nextLine();

        Coche coche = new Coche(color, marca);
        coches.put(matricula, coche);
        System.out.println("\nCoche añadido");
    }

    public void eliminaElemento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce la matricula del coche que quieras eliminar: ");
        String matricula = scanner.nextLine().toUpperCase(); 

        if (coches.remove(matricula) != null) {
            System.out.println("\nCoche eliminado");
        } 
        
        else {
            System.out.println("Matricula incorecta");
        }
    }

    public void visualizaMatriculas() {
        System.out.println("\nLista de Matriculas: ");

        for (String matricula : coches.keySet()) {
            System.out.println(matricula);
        }
    }

    public void visualizaCoches() {
        System.out.println("\nLista de Coches:");

        for (Coche coche : coches.values()) {
            System.out.println(coche);
        }
    }

    public void visualizaTaller() {
        System.out.println("\nDetalles de los coches en el taller:");

        for (var entry : coches.entrySet()) {
            System.out.println("\nMatricula: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}