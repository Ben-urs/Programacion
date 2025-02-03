import java.util.HashMap;
import java.util.Scanner;

public class Agenda {
    private HashMap<String, Contacto> contactos;

    public Agenda() {
        contactos = new HashMap<>();
    }

    // Metodo añadir contacto //
    public void anadeContacto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce el nombre del contacto: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce el numero de teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("Introduce el correo electrónico del contacto: ");
        String correo = scanner.nextLine();

        if (contactos.containsKey(nombre)) {
            System.out.println("\nEste contacto ya existe");

            return;
        }

        String errorNombre = Contacto.validarNombre(nombre);
        String errorTelefono = Contacto.validarTelefono(telefono);
        String errorEmail = Contacto.validarCorreo(correo);

        if (errorNombre != null) {
            System.out.println(errorNombre);

            return;
        }

        if (errorTelefono != null) {
            System.out.println(errorTelefono);

            return;
        }

        if (errorEmail != null) {
            System.out.println(errorEmail);

            return;
        }

        Contacto contacto = new Contacto(nombre, telefono, correo);
        contactos.put(nombre, contacto);
        System.out.println("\nContacto añadido");
    }

    // Metodos //

    public void buscaContacto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce el nombre del contacto que quieras buscar: ");
        String nombre = scanner.nextLine();

        Contacto contacto = contactos.get(nombre);

        if (contacto != null) {
            System.out.println(contacto);
        } 
        
        else {
            System.out.println("\nEl Contacto no se ha encontrado");
        }
    }

    public void eliminaContacto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce el nombre del contacto que quieras eliminar: ");
        String nombre = scanner.nextLine();

        if (contactos.remove(nombre) != null) {
            System.out.println("\nContacto eliminado");
        } 
        
        else {
            System.out.println("\nEl Contacto no se ha encontrado");
        }
    }

    public void visualizaAgenda() {

        if (contactos.isEmpty()) {
            System.out.println("\nTu agenda esta vacia");
        } 
        
        else {
            System.out.println("\nDetalles de los contactos:");
            
            for (Contacto contacto : contactos.values()) {
                System.out.println(contacto);
            }
        }
    }

    public void numeroContactos() {
        System.out.println("\nNumero de contactos guardatos: " + contactos.size());
    }
}