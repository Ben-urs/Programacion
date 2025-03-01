import java.time.LocalDate;
import java.util.Scanner;

public class GestionVideoDaw {
    private VideoDaw videoDaw;
    private Scanner scanner;

    public static void main(String[] args) {
        GestionVideoDaw gestion = new GestionVideoDaw();
        gestion.iniciar();
    }

    public void iniciar() {
        scanner = new Scanner(System.in);
        mostrarMenu();
    }

    public void mostrarMenu() {
        int opcion;
        boolean videoClubCreado = false;

        do {
            System.out.println("\nMenu Principal:");
            if (!videoClubCreado) {
                System.out.println("1. Crear y registrar VideoClub");
            } 
            else {
                System.out.println("\n2. Registrar articulo en videoclub");
                System.out.println("3. Crear y registrar cliente en videoclub");
                System.out.println("4. Alquilar");
                System.out.println("5. Devolver");
                System.out.println("6. Dar de baja cliente");
                System.out.println("7. Dar de baja articulo");
            }
            System.out.println("8. Salir");
            System.out.print("\nSeleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearVideoClub();
                    videoClubCreado = true;
                    break;

                case 2:
                    if (!videoClubCreado) {
                        System.out.println("Primero debe crear y registrar el VideoClub");
                    } 
                    else {
                        registrarArticulo();
                    }
                    break;

                case 3:
                    if (!videoClubCreado) {
                        System.out.println("Primero debe crear y registrar el VideoClub");
                    } 
                    else {
                        registrarCliente();
                    }
                    break;

                case 4:
                    if (!videoClubCreado) {
                        System.out.println("Primero debe crear y registrar el VideoClub");
                    } 
                    else {
                        alquilarArticulo();
                    }
                    break;

                case 5:
                    if (!videoClubCreado) {
                        System.out.println("Primero debe crear y registrar el VideoClub");
                    } 
                    else {
                        devolverArticulo();
                    }
                    break;

                case 6:
                    if (!videoClubCreado) {
                        System.out.println("Primero debe crear y registrar el VideoClub");
                    } 
                    else {
                        darDeBajaCliente();
                    }
                    break;

                case 7:
                    if (!videoClubCreado) {
                        System.out.println("Primero debe crear y registrar el VideoClub");
                    } 
                    else {
                        darDeBajaArticulo();
                    }
                    break;

                case 8:
                    System.out.println("Has salido de VideoDaw");
                    break;

                default:
                    System.out.println("\nOpcion no válida. Intentelo de nuevo");
            }
        } 
        while (opcion != 8);
    }

    private void crearVideoClub() {
        String cif;
        
        while (true) {
            System.out.println("\nRecuerda que el CIF comienza por una letra mayúscula y 8 números (ej. L99999999)");
            System.out.print("Ingrese el CIF del VideoClub: ");
            cif = scanner.nextLine();
            if (Validador.validarCIF(cif)) {
                break; 
            } 
            else {
                System.out.println("\nCIF invalido. Debe tener el formato correcto");
            }
        }
        System.out.print("\nIngrese la direccion del VideoClub: ");
        String direccion = scanner.nextLine();
        videoDaw = new VideoDaw(cif, direccion, LocalDate.now());
        System.out.println("\nVideoClub creado y registrado");
    }

    private void registrarArticulo() {
        int opcionArticulo;
        do {
            System.out.println("\nSeleccione el tipo de articulo para registrarlo:");
            System.out.println("1. Registrar pelicula");
            System.out.println("2. Registrar videojuego");
            System.out.println("3. Volver al menu principal");
            System.out.print("\nSeleccione una opcion: ");
            opcionArticulo = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcionArticulo) {
                case 1:
                    registrarPelicula();
                    break;
                case 2:
                    registrarVideojuego();
                    break;
                case 3:
                    System.out.println("\nVolviendo al menu principal");
                    break;
                default:
                    System.out.println("\nOpcion no valida. Intentelo de nuevo");
            }
        } 
        while (opcionArticulo != 3);
    }

    private void registrarPelicula() {
        String codPelicula;
        while (true) {
            System.out.print("\nIngrese el codigo de la pelicula (ej. P-0001): ");
            codPelicula = scanner.nextLine();
            if (Validador.validarCodigoPelicula(codPelicula)) {
                break; 
            } 
            else {
                System.out.println("\nCodigo de pelicula invalido. Debe seguir el formato P-0001");
            }
        }

        String tituloPelicula;
        System.out.print("Ingrese el título de la pelicula: ");
        tituloPelicula = scanner.nextLine();

        LocalDate fechaRegistroPelicula;
        while (true) {
            System.out.print("Ingrese la fecha de registro (YYYY-MM-DD): ");
            try {
                fechaRegistroPelicula = LocalDate.parse(scanner.nextLine());
                break; 
            } 
            catch (Exception e) {
                System.out.println("\nFecha invalida. Intentelo de nuevo");
            }
        }

        Pelicula.Genero generoPelicula;
        while (true) {
            System.out.print("Ingrese el genero de la pelicula: ");
            try {
                generoPelicula = Pelicula.Genero.valueOf(scanner.nextLine().toUpperCase());
                break; 
            } 
            catch (IllegalArgumentException e) {
                System.out.println("\nGenero invalido. Intentelo de nuevo");
            }
        }

        Pelicula pelicula = new Pelicula(codPelicula, tituloPelicula, fechaRegistroPelicula, generoPelicula);
        try {
            videoDaw.registrarArticulo(pelicula);
        } 
        catch (VideoClubException e) {
            System.out.println(e.getMessage());
        }
    }

    private void registrarVideojuego() {
        String codVideojuego;
        while (true) {
            System.out.print("\nIngrese el codigo del videojuego (ej. V-0001): ");
            codVideojuego = scanner.nextLine();
            if (Validador.validarCodigoVideojuego(codVideojuego)) { 
                break; 
            } 
            else {
                System.out.println("\nCodigo de videojuego invalido. Debe seguir el formato V-0001");
            }
        }

        String tituloVideojuego;
        System.out.print("Ingrese el titulo del videojuego: ");
        tituloVideojuego = scanner.nextLine();

        LocalDate fechaRegistroVideojuego;
        while (true) {
            System.out.print("Ingrese la fecha de registro (YYYY-MM-DD): ");
            try {
                fechaRegistroVideojuego = LocalDate.parse(scanner.nextLine());
                break; 
            } 
            catch (Exception e) {
                System.out.println("\nFecha invalida. Intentelo de nuevo");
            }
        }

        Videojuego.Genero generoVideojuego;
        while (true) {
            System.out.print("Ingrese el genero del videojuego: ");
            try {
                generoVideojuego = Videojuego.Genero.valueOf(scanner.nextLine().toUpperCase());
                break; 
            } 
            catch (IllegalArgumentException e) {
                System.out.println("\nGenero invalido. Intente de nuevo");
            }
        }

        Videojuego videojuego = new Videojuego(codVideojuego, tituloVideojuego, fechaRegistroVideojuego, generoVideojuego);
        try {
            videoDaw.registrarArticulo(videojuego);
        } 
        catch (VideoClubException e) {
            System.out.println(e.getMessage());
        }
    }

    private void registrarCliente() {
        String dniCliente;
        while (true) {
            System.out.println("\nRecuerda que el DNI comienza por 8 numeros y una letra mayuscula (ej. 99999999L)");
            System.out.print("Ingrese el DNI del cliente: ");
            dniCliente = scanner.nextLine();
            if (Validador.validarDNI(dniCliente)) {
                break; 
            } 
            else {
                System.out.println("\nDNI invalido. Debe tener el formato correcto");
            }
        }
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese la direccion del cliente: ");
        String direccionCliente = scanner.nextLine();
        LocalDate fechaNacimientoCliente;
        while (true) {
            System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
            try {
                fechaNacimientoCliente = LocalDate.parse(scanner.nextLine());
                if (Validador.esMayorDeEdad(fechaNacimientoCliente)) {
                    break; 
                } 
                else {
                    System.out.println("\nEl cliente debe ser mayor de edad");
                }
            } 
            catch (Exception e) {
                System.out.println("\nFecha invalida. Intentelo de nuevo");
            }
        }

        String numSocio;
        while (true) {
            System.out.print("Ingrese el numero de socio (ej. S-0001): ");
            numSocio = scanner.nextLine();
            if (Validador.validarNumeroSocio(numSocio)) {
                break; 
            } 
            else {
                System.out.println("\nNumero de socio invalido. Debe seguir el formato S-0001");
            }
        }

        Cliente cliente = new Cliente(dniCliente, nombreCliente, direccionCliente, fechaNacimientoCliente, numSocio);
        try {
            videoDaw.registrarCliente(cliente);
        } 
        catch (VideoClubException e) {
            System.out.println(e.getMessage());
        }
    }

    private void alquilarArticulo() {
        String codAlquilar;
        while (true) {
            System.out.print("\nIngrese el codigo del articulo que va a alquilar: ");
            codAlquilar = scanner.nextLine();
            Articulo articuloAlquilar = buscarArticulo(codAlquilar);
            
            if (articuloAlquilar != null) {
                System.out.print("Ingrese el numero de socio del cliente: ");
                String numSocioAlquilar = scanner.nextLine();
                Cliente clienteAlquilar = buscarCliente(numSocioAlquilar);
                
                if (clienteAlquilar != null) {
                    videoDaw.alquilarArticulo(articuloAlquilar, clienteAlquilar);
                    
                    System.out.println("\nArtículo alquilado: ");
                    System.out.println("Nombre: " + articuloAlquilar.getTitulo());
                    System.out.println("Genero: " + articuloAlquilar.getGenero()); 
                    System.out.println("Fecha de alquiler: " + LocalDate.now());
                    break; 
                } 
                else {
                    System.out.println("\nCliente no encontrado. Intente de nuevo");
                }
            } 
            else {
                System.out.println("\nArtículo no encontrado. Intente de nuevo");
            }
        }
    }
    
    private void devolverArticulo() {
        String codDevolver;
        while (true) {
            System.out.print("\nIngrese el codigo del articulo que va a devolver: ");
            codDevolver = scanner.nextLine();
            Articulo articuloDevolver = buscarArticulo(codDevolver);
            
            if (articuloDevolver != null) {
                System.out.print("Ingrese el numero de socio del cliente: ");
                String numSocioDevolver = scanner.nextLine();
                Cliente clienteDevolver = buscarCliente(numSocioDevolver);
                
                if (clienteDevolver != null) {
                    try {
                        videoDaw.devolverArticulo(articuloDevolver, clienteDevolver);
                        System.out.println("\nArticulo devuelto: ");
                        System.out.println("Nombre: " + articuloDevolver.getTitulo());
                        System.out.println("Género: " + articuloDevolver.getGenero()); 
                        System.out.println("Fecha de devolucion: " + LocalDate.now());
                        break; 
                    } 
                    catch (VideoClubException e) {
                        System.out.println(e.getMessage());
                    }
                } 
                else {
                    System.out.println("\nCliente no encontrado. Intente de nuevo");
                }
            } 
            else {
                System.out.println("\nArticulo no encontrado. Intente de nuevo");
            }
        }
    }

    private void darDeBajaCliente() {
        String numSocioBaja;
        while (true) {
            System.out.print("\nIngrese el numero de socio del cliente que va a dar de baja: ");
            numSocioBaja = scanner.nextLine();
            try {
                videoDaw.darDeBajaCliente(numSocioBaja);
                break; 
            } 
            catch (VideoClubException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void darDeBajaArticulo() {
        String codBaja;
        while (true) {
            System.out.print("\nIngrese el codigo del articulo que va a dar de baja: ");
            codBaja = scanner.nextLine();
            try {
                videoDaw.darDeBajaArticulo(codBaja);
                break; 
            } 
            catch (VideoClubException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private Articulo buscarArticulo(String cod) {
        for (Articulo articulo : videoDaw.getArticulosRegistrados()) {
            if (articulo.getCod().equals(cod)) {
                return articulo; 
            }
        }
        System.out.println("\nArticulo no encontrado con el codigo: " + cod);
        return null; 
    }

    private Cliente buscarCliente(String numSocio) {
        for (Cliente cliente : videoDaw.getClientesRegistrados()) {
            if (cliente.getNumSocio().equals(numSocio)) {
                return cliente; 
            }
        }
        System.out.println("\nCliente no encontrado con el numero de socio: " + numSocio);
        return null; 
    }
}