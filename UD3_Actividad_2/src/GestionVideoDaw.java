import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class GestionVideoDaw {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a VideoDaw");
        System.out.println();
        System.out.println("Selecciona una de las siguientes opciones");
        System.out.println();
        System.out.println("Menu");

        String opcion = "";

        VideoDaw videoClub = null;

        do {
            System.out.println("1 - Crear y registrar VideoClub en la franquicia");
            System.out.println("2 - Registrar pelicula en videoclub");
            System.out.println("3 - Crear y registrar cliente en videoclub");
            System.out.println("4 - Alquilar pelicula");
            System.out.println("5 - Devolver pelicula");
            System.out.println("6 - Dar de baja cliente");
            System.out.println("7 - Dar de baja pelicula");
            System.out.println("8 - Salir");

            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    String cif;
                    do {
                        System.out.println();
                        System.out.println("Introduzca el CIF para registrar el VideoClub");
                        System.out.println("Recuerda que el CIF comienza por una letra y 8 números (ej. L99999999)");
                        System.out.println();

                        cif = teclado.nextLine().toUpperCase();

                        if (setValidCif(cif)) {
                            System.out.println();
                            System.out.println("CIF correcto");
                            System.out.println();
                        } else {
                            System.out.println();
                            System.out.println("CIF incorrecto, intentelo de nuevo");
                            System.out.println();
                        }
                    } while (!setValidCif(cif));

                    System.out.println();
                    System.out.println("Introduce la direccion del Video Club");
                    System.out.println();

                    String direccion = teclado.nextLine();

                    videoClub = new VideoDaw(cif, direccion, LocalDate.now().toString());

                    System.out.println();
                    System.out.println("Video Club registrado");
                    System.out.println();

                    break;

                case "2":
                    if (videoClub == null) {
                        System.out.println();
                        System.out.println("Primero registra un Video Club");
                        System.out.println();
                        break;
                    }

                    System.out.println();
                    System.out.println("Introduce el código de la pelicula (ej. P-0001):");
                    System.out.println();

                    String codigo = teclado.nextLine();

                    System.out.println();
                    System.out.println("Introduce el titulo de la pelicula:");
                    System.out.println();

                    String titulo = teclado.nextLine();

                    System.out.println();
                    System.out.println("Introduce el genero de la pelicula:");
                    System.out.println();

                    Generos genero = Generos.valueOf(teclado.nextLine().toUpperCase());

                    Pelicula pelicula = new Pelicula(codigo, titulo, genero, LocalDate.now(), null, null, false);
                    
                    videoClub.registrarPelicula(pelicula);

                    System.out.println();
                    System.out.println("Pelicula registrada");
                    System.out.println();
                    
                    mostrarPeliculasRegistradas(videoClub);
                    break;

                case "3":
                    System.out.println();
                    System.out.println("Introduce el DNI del cliente");
                    System.out.println("Recuerda que el DNI comienza por una 8 números y una letra (ej. 99999999L)");
                    System.out.println();

                    String dni = teclado.nextLine();

                    System.out.println();
                    System.out.println("Introduce el nombre del cliente:");
                    System.out.println();

                    String nombre = teclado.nextLine();

                    System.out.println();
                    System.out.println("Introduce el número de socio (ej. S-0001):");
                    System.out.println();

                    String numSocio = teclado.nextLine();

                    System.out.println();
                    System.out.println("Introduce la dirección del cliente:");
                    System.out.println();

                    String direccionCliente = teclado.nextLine();

                    System.out.println();
                    System.out.println("Introduce la fecha de nacimiento (YYYY-MM-DD):");
                    System.out.println();

                    LocalDate fechaNacimiento = LocalDate.parse(teclado.nextLine());

                    if (esMayorDeEdad(fechaNacimiento)) {
                        Cliente cliente = new Cliente(dni, nombre, numSocio, direccionCliente, fechaNacimiento, null);
                        videoClub.registrarCliente(cliente);

                        System.out.println();
                        System.out.println("Cliente registrado");
                        System.out.println();
                        
                        mostrarClientesRegistrados(videoClub);
                    } else {
                        System.out.println();
                        System.out.println("El cliente debe tener al menos 18 años para registrarse");
                        System.out.println();
                    }
                    break;

                case "4":
                    if (videoClub == null) {
                        System.out.println();
                        System.out.println("Primero registra un Video Club");
                        System.out.println();
                        break;
                    }

                    System.out.println();
                    System.out.println("Introduce el codigo de la pelicula que quieras alquilar:");
                    System.out.println();

                    String codigoAlquiler = teclado.nextLine();

                    System.out.println();
                    System.out.println("Introduce el DNI del cliente:");
                    System.out.println();

                    String dniCliente = teclado.nextLine();
                
                    Cliente clienteAlquiler = videoClub.buscarCliente(dniCliente);
                    Pelicula peliculaAlquiler = videoClub.buscarPelicula(codigoAlquiler);

                    if (clienteAlquiler != null && peliculaAlquiler != null && !peliculaAlquiler.isAlquilada()) {
                        clienteAlquiler.alquilarPelicula(peliculaAlquiler);

                        System.out.println();
                        System.out.println("Pelicula alquilada");
                        System.out.println();
                        
                        mostrarPeliculasAlquiladas(clienteAlquiler);
                    } else {
                        System.out.println();
                        System.out.println("No se puede alquilar esta pelicula");
                        System.out.println();
                    }

                    break;

                case "5":
                    System.out.println();
                    System.out.println("Introduce el codigo de la pelicula que quieras devolver:");
                    System.out.println();

                    String codigoDevolucion = teclado.nextLine();

                    System.out.println();
                    System.out.println("Introduce el DNI del cliente:");
                    System.out.println();

                    String dniClienteDevolucion = teclado.nextLine();

                    Cliente clienteDevolucion = videoClub.buscarCliente(dniClienteDevolucion);
                    Pelicula peliculaDevolucion = videoClub.buscarPelicula(codigoDevolucion);

                    if (clienteDevolucion != null && peliculaDevolucion != null) {
                        clienteDevolucion.devolverPelicula(peliculaDevolucion);

                        System.out.println();
                        System.out.println("Pelicula devuelta");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("No se ha podido devolver la pelicula");
                        System.out.println();
                    }

                    break;

                case "6":
                    System.out.println();
                    System.out.println("Introduce el DNI del cliente que quieras dar de baja:");
                    System.out.println();

                    String dniBajaCliente = teclado.nextLine();

                    Cliente clienteBaja = videoClub.buscarCliente(dniBajaCliente);

                    if (clienteBaja != null) {
                        videoClub.darBajaCliente(clienteBaja);

                        System.out.println();
                        System.out.println("Cliente dado de baja");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("Cliente no encontrado");
                        System.out.println();
                    }

                    break;

                case "7":
                    System.out.println();
                    System.out.println("Introduce el codigo de la pelicula que quieras dar de baja:");
                    System.out.println();

                    String codigoBajaPelicula = teclado.nextLine();

                    Pelicula peliculaBaja = videoClub.buscarPelicula(codigoBajaPelicula);

                    if (peliculaBaja != null) {
                        videoClub.darBajaPelicula(peliculaBaja);

                        System.out.println();
                        System.out.println("Pelicula dada de baja");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("Pelicula no encontrada");
                        System.out.println();
                    }

                    break;

                case "8":
                    System.out.println();
                    System.out.println("Saliendo del programa");
                    System.out.println();
                    System.out.println("Hasta luego");
                    System.out.println();

                    break;

                default:
                    System.out.println();
                    System.out.println("Opcion incorrecta, Prueba de nuevo");
                    System.out.println();

                    break;
            }
        } 
        
        while (!opcion.equals("8"));

        teclado.close();
    }

    private static boolean setValidCif(String cif) {
        return cif.matches("[A-Z]{1}[0-9]{8}");
    }

    private static boolean esMayorDeEdad(LocalDate fechaNacimiento) {
        LocalDate hoy = LocalDate.now();

        int edad = Period.between(fechaNacimiento, hoy).getYears();

        return edad >= 18;
    }

    private static void mostrarPeliculasRegistradas(VideoDaw videoClub) {
        System.out.println("Peliculas registradas:");

        for (int i = 0; i < videoClub.getNumPeliculas(); i++) {

            System.out.println(videoClub.getPeliculasRegistradas()[i].mostrarInfoPelicula());
        }
        System.out.println();
    }

    private static void mostrarClientesRegistrados(VideoDaw videoClub) {
        System.out.println("Clientes registrados:");

        for (int i = 0; i < videoClub.getNumClientes(); i++) {

            System.out.println(videoClub.getClientesRegistrados()[i].mostrarInfoCliente());
        }
        System.out.println();
    }

    private static void mostrarPeliculasAlquiladas(Cliente cliente) {
        System.out.println("Peliculas alquiladas:");
        System.out.println();
        System.out.println(cliente.mostrarPeliculasAlquiladas());
    }
}