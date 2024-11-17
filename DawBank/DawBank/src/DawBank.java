import java.util.Scanner;

public class DawBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear cuenta bancaria
        System.out.println("Introduce el IBAN:");
        String iban = scanner.nextLine();
        System.out.println("Introduce el titular:");
        String titular = scanner.nextLine();

        App cuenta;
        try {
            cuenta = new App(iban, titular);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        // Menú principal
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Datos de la cuenta");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingreso");
            System.out.println("6. Retirada");
            System.out.println("7. Movimientos");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("IBAN: " + cuenta.getIban());
                    System.out.println("Titular: " + cuenta.getTitular());
                    System.out.println("Saldo: " + cuenta.getSaldo() + "€");
                    break;
                case 2:
                    System.out.println("IBAN: " + cuenta.getIban());
                    break;
                case 3:
                    System.out.println("Titular: " + cuenta.getTitular());
                    break;
                case 4:
                    System.out.println("Saldo: " + cuenta.getSaldo() + "€");
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
                    for (Movimiento m : cuenta.getMovimientos()) {
                        m.mostrarInfoMovimiento();
                    }
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);

        scanner.close();
    }
}
