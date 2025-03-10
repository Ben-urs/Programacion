import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        List<Libro> biblioteca = new LinkedList<>();
        cargarLibros(biblioteca);
        Scanner entrada = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\nMenu de la Biblioteca");
            System.out.println("\n1. Crear Libro y registrarlo en la biblioteca.");
            System.out.println("2. Mostrar Libros existentes por (ISBN, titulo, autor, fecha)");
            System.out.println("3. Eliminar Libro por ISBN");
            System.out.println("4. Guardar Libros en el fichero");
            System.out.println("5. Guardar y salir\n");
            opcion = entrada.nextLine();

            switch (opcion) {
                case "1":
                    crearLibro(entrada, biblioteca);
                    
                    break;

                case "2":
                    mostrarLibros(biblioteca, entrada); 
                    
                    break;

                case "3":
                    eliminarLibro(entrada, biblioteca);
                    
                    break;

                case "4":
                    guardarLibros(biblioteca);
                    
                    break;

                case "5":
                    guardarLibros(biblioteca);
                    System.out.println("\nSaliendo de la biblioteca");
                    
                    break;

                default:
                    System.out.println("\nOpcion Incorecta, Prueba de nuevo");
            }
        } 
        
        while (!opcion.equals("5"));

        entrada.close();
    }

    private static void cargarLibros(List<Libro> biblioteca) {
        try (FileInputStream file = new FileInputStream("./resource/Biblioteca.dat");
             ObjectInputStream reader = new ObjectInputStream(file)) {
                while (true) {
                
                    try {
                        Libro lLeido = (Libro) reader.readObject();
                        biblioteca.add(lLeido);
                    } 
                    catch (EOFException e) {
                    
                    break; 
                }
            }
        } 
        catch (IOException | ClassNotFoundException e) {
            System.out.println("\nBiblioteca Vacia: " + e.getMessage());
        }
    }

    private static void crearLibro(Scanner entrada, List<Libro> biblioteca) {
        String isbn = "";
        String titulo = "";
        String autor = "";
        LocalDate fechaPublicacion = null;

        while (true) {
            try {
                System.out.println("\nIntroduce el ISBN del libro (Recuerda que se compone de 13 numeros): ");
                isbn = entrada.nextLine();
                if (isbn.isEmpty() || !isbn.matches("\\d{13}")) {
                    throw new IllegalArgumentException("\nISBN incorrecto, Recuerda que debe tener 13 numeros");
                }

                System.out.println("Introduce el titulo del libro: ");
                titulo = entrada.nextLine();
                if (titulo.isEmpty()) 
                throw new IllegalArgumentException();

                System.out.println("Introduce el autor del libro: ");
                autor = entrada.nextLine();
                if (autor.isEmpty()) 
                throw new IllegalArgumentException();

                fechaPublicacion = leerFecha("Introduce la fecha de publicacion del libro, Formato - (dd/MM/yyyy): ");
                
                break; 
            } 
            catch (IllegalArgumentException e) {
                System.out.println("\nError: " + e.getMessage() + " Intentalo de nuevo");
            } 
            catch (Exception e) {
                System.out.println("\nError: " + e.getMessage());
            }
        }

        Libro nuevoLibro = new Libro(isbn, titulo, autor, fechaPublicacion);
        biblioteca.add(nuevoLibro);
        
        System.out.println("\nLibro creado");
    }

    private static void mostrarLibros(List<Libro> biblioteca, Scanner entrada) {
        if (biblioteca.isEmpty()) {
            System.out.println("\nNo hay libros en la biblioteca");
            
            return;
        }

        System.out.println("\nelecciona la opcion de busqueda: ");
        System.out.println("1. Buscar por ISBN");
        System.out.println("2. Buscar por Titulo");
        System.out.println("3. Buscar por Autor");
        System.out.println("4. Buscar por Fecha de Publicacion");
        System.out.println("5. Mostrar todos los libros");

        String opcion = entrada.nextLine();
        switch (opcion) {
            case "1":
                System.out.println("Introduce el ISBN del libro: ");
                String isbn = entrada.nextLine();
                for (Libro libro : biblioteca) {
                    if (libro.getIsbn().equals(isbn)) {
                        System.out.println(libro);
                    }
                }
                break;

            case "2":
                System.out.println("Introduce el título del libro: ");
                String titulo = entrada.nextLine();
                for (Libro libro : biblioteca) {
                    if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                        System.out.println(libro);
                    }
                }
                break;

            case "3":
                System.out.println("Introduce el autor del libro: ");
                String autor = entrada.nextLine();
                for (Libro libro : biblioteca) {
                    if (libro.getAutor().equalsIgnoreCase(autor)) {
                        System.out.println(libro);
                    }
                }
                break;

            case "4":
                System.out.println("Introduce la fecha de publicación del libro (dd/MM/yyyy):");
                String fechaStr = entrada.nextLine();
                LocalDate fecha = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                for (Libro libro : biblioteca) {
                    if (libro.getFechaPublicacion().isEqual(fecha)) {
                        System.out.println(libro);
                    }
                }
                break;

            case "5":
                for (Libro libro : biblioteca) {
                    System.out.println(libro);
                }
                break;
            
                default:
                System.out.println("\nOpcion Incorecta, Prueba de nuevo");
        }
    }

    private static void eliminarLibro(Scanner entrada, List<Libro> biblioteca) {
        System.out.println("\nIntroduce el ISBN del libro a eliminar: ");
        String isbn = entrada.nextLine();
        boolean eliminado = false;
    
        for (int i = 0; i < biblioteca.size(); i++) {
            if (biblioteca.get(i).getIsbn().equals(isbn)) {
                biblioteca.remove(i);
                System.out.println("\nLibro eliminado");
                eliminado = true;
                break;
            }
        }
    
        if (!eliminado) {
            System.out.println("No se encontro ningun libro con ese ISBN");
        }
    }

    private static void guardarLibros(List<Libro> biblioteca) {
        try (FileOutputStream file = new FileOutputStream("./resource/Biblioteca.dat");
             ObjectOutputStream writer = new ObjectOutputStream(file)) {
            for (Libro libro : biblioteca) {
                writer.writeObject(libro);
            }
            System.out.println("\nLibros guardados");
        } 
        catch (IOException e) {
            System.out.println("\nSe ha producido un error al guardar los libros: " + e.getMessage());
        }
    }

    private static LocalDate leerFecha(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        String fechaStr = scanner.nextLine();
        return LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}

