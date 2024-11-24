import java.util.Scanner;

public class DawBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a DawBank");
        System.out.println();
        System.out.println("Recuerda que debe comenzar por 2 letra mayusculas y 22 numeros");
        System.out.println("Ejemplo: EL9999999999999999999999");
        System.out.println();
        System.out.println("Introduce tu IBAN:");

        final String patronIBAN = "[A-Z]{2}[0-9]{22}";

        String iban = scanner.nextLine();

        while (!iban.matches(patronIBAN)) {
            System.out.println("IBAN invalido. Debe comenzar por 2 letras mayusculas seguidas de 22 numeros");
            System.out.println();
            System.out.println("Introduce un IBAN valido:");

            iban = scanner.nextLine();
        }

        System.out.println("Introduce el nombre del titular de la cuenta:");

        String titular = scanner.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(iban, titular);
        
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Datos de la cuenta");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingreso");
            System.out.println("6. Retirada");
            System.out.println("7. Movimientos");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opcion: ");

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
