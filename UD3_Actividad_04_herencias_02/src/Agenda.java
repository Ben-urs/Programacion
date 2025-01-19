import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public boolean añadirContacto() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nIngrese el nombre del contacto: ");
        String nombre = scanner.nextLine();
        
        System.out.print("\nIngrese el telefono del contacto: ");
        String telefono = scanner.nextLine();
        
        Contacto nuevoContacto = new Contacto(nombre, telefono);
        
        if (!existeContacto(nuevoContacto.getNombre())) {
            contactos.add(nuevoContacto);

            return true; 
        }
        
        return false; 
    }

    public boolean eliminarContacto(String nombre) {

        int index = buscaContacto(nombre);
        if (index != -1) {           
            contactos.remove(index);

            return true; 
        }
        
        return false; 
    }

    public boolean existeContacto(String nombre) {

        return buscaContacto(nombre) != -1;
    }

    public void listarContactos() {

        if (contactos.isEmpty()) {
            System.out.println("\nLa agenda esta vacia.");

        } 
        
        else {

            for (Contacto c : contactos) {
                System.out.println("Nombre: " + c.getNombre() + ", Telefono: " + c.getTelefono());
            }
        }
    }

    public int buscaContacto(String nombre) {

        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) {

                return i; 
            }
        }

        return -1; 
    }
}