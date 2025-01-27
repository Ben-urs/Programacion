import java.util.HashMap;
import java.util.Scanner;

public class Taller {
    private HashMap<String, Coche> coches;

    public Taller() {
        coches = new HashMap<>();
    }

    private boolean validarMatricula(String matricula) {
        if (matricula.length() != 7) {
            
            return false; 
        }

        for (int i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                
                return false; 
            }
        }

        for (int i = 4; i < 7; i++) {
            if (!Character.isUpperCase(matricula.charAt(i))) {
                
                return false; 
            }
        }

        return true; 
    }

    public void anadeElemento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la matriculadel coche: ");
        String matricula = scanner.nextLine().toUpperCase(); 

        if (!validarMatricula(matricula)) {
            System.out.println("Formato de matricula 1111AAA obligatorio");
            
            return;
        }

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
        System.out.println("Coche añadido");
    }

    public void eliminaElemento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la matricula del coche que quieras eliminar: ");
        String matricula = scanner.nextLine().toUpperCase(); 

        if (coches.remove(matricula) != null) {
            System.out.println("Coche eliminado");
        } 
        
        else {
            System.out.println("Matricula incorecta");
        }
    }

    public void visualizaMatriculas() {
        System.out.println("Lista de Matriculas: ");

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
        System.out.println("Detalles de los coches en el taller:");

        for (var entry : coches.entrySet()) {
            System.out.println("Matricula: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}