import java.util.Scanner;

public class GestionVideoDaw {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a VideoDaw");
        System.out.println();
        System.out.println("Recuerda que debe comenzar por 1 letra mayuscula y 8 numeros");
        System.out.println("Ejemplo: L999999999");
        System.out.println();
        System.out.println("Introduce tu DNI:");

        final String dniVerificar = "[A-Z]{1}[0-9]{8}";

        String dni = scanner.nextLine();

        while (!dni.matches(dniVerificar)) {
            System.out.println("DNI invalido. Debe comenzar por 1 letra mayuscula seguida de 8 numeros");
            System.out.println();
            System.out.println("Introduce un DNI valido:");

            dni = scanner.nextLine();
        }

        System.out.println("Introduce tu nombre de Usuario: ");

        String titular = scanner.nextLine();

        Cliente cuenta = new cuenta(dni);
        
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Crear y registrar VideoClub en la franquicia");
            System.out.println("2. Registrar pelicula en videoclub");
            System.out.println("3. Crear y registrar cliente en videoclub");
            System.out.println("4. Alquilar pelicula");
            System.out.println("5. Devolver pelicula");
            System.out.println("6. Dar de baja cliente");
            System.out.println("7. Dar de baja pelicula");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("DNI: " + cuenta.getdni());
                    System.out.println("Usuario: " + cuenta.getnombreUsuario());
                    System.out.println("Numero de Socio: " + cuenta.getnumSocios());

                    break;

                case 2:
                    System.out.println("DNI: " + cuenta.getDNI());

                    break;

                case 3:
                    System.out.println("Usuario: " + cuenta.getUsuario());

                    break;

                case 4:
                    System.out.println("Nemero de Socio: " + cuenta.getnumSocio());

                    break;

                case 5:
                    System.out.print("Cantidad a ingresar: ");
                    
                    double ingreso = scanner.nextDouble();

                    cuenta.ingresar(ingreso);

                    break;

                case 6:
                    System.out.print("Cantidad a retirar: ");

                    double retirada = scanner.nextDouble();

                    cuenta.retirar(retirada);

                    break;

                case 7:
                    System.out.println("Movimientos:");

                    cuenta.mostrarMovimientos();

                    break;

                case 8:
                    System.out.println("Saliendo del programa");
                    System.out.println("Hasta otra");

                    break;

                default:
                    System.out.println("Opcion no valida, Introduzca una de las opcion mostradas en pantalla");
            }
        } 
        
        while (opcion != 8);

        scanner.close();
    }
}