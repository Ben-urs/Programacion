import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DawBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nBienvenido a DawBank");
        System.out.println("\nIntroduzca sus datos antes de empezar");

        String iban = "";
        System.out.println("\nIntroduzca el IBAN del titular de la cuenta. Recuerde que consta de 24 caracteres, 2 letras y 22 numeros, formato(RR999999999999999999999): ");
        
        do {
            try {
                iban = scanner.nextLine();
                if (!ibanValido(iban)) {
                    throw new CuentaException("\nIBAN invalido. Debe tener 24 caracteres (2 letras y 22 numeros)");
                }
            } 
            
            catch (CuentaException e) {
                System.out.println(e.getMessage());
            }
        } 
        
        while (!ibanValido(iban));

        Cliente cliente = null;
        CuentaBancaria cuenta = null;

        try {
            System.out.println("\nIntroduzca el nombre del titular de la cuenta: ");
            String nombre = scanner.nextLine();
            
            String dni = "";
            System.out.println("\nIntroduzca el DNI del titular de la cuenta. Recuerde que consta de 9 caracteres, 8 numeros y 1 letra, formato(99999999R): ");
            
            do {
                try {
                    dni = scanner.nextLine();
                    if (!dniValido(dni)) {
                        throw new CuentaException("\nDNI invalido. Debe tener 9 caracteres (8 numeros y 1 letra)");
                    }
                } 
                
                catch (CuentaException e) {
                    System.out.println(e.getMessage());
                }
            } 
            
            while (!dniValido(dni));
            
            LocalDate fechaNacimiento = null;
            System.out.println("\nIntroduzca la fecha de nacimiento del titular de la cuenta - formato(DD-MM-AAAA): ");
            do {
                try {
                    String fechaInput = scanner.nextLine();
                    fechaNacimiento = LocalDate.parse(fechaInput, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    
                    break; 
                } 
                
                catch (Exception e) {
                    System.out.println("\nFecha invalida. Asegurese de usar el formato correcto (DD-MM-AAAA).");
                }
            } 
            
            while (true);
            
            String telefono = "";
            System.out.println("\nIntroduzca un numero de telefono: ");
            do {
                try {
                    telefono = scanner.nextLine();
                    if (!telefonoValido(telefono)) {
                        throw new CuentaException("\nNumero de telefono invalido. Debe empezar por 6 y tener 9 digitos");
                    }
                } 
                
                catch (CuentaException e) {
                    System.out.println(e.getMessage());
                }
            } 
            while (!telefonoValido(telefono));
            
            String email = "";
            System.out.println("\nIntroduzca una direccion de email - formato(mail@nombreddominio.xyz): ");
            do {
                try {
                    email = scanner.nextLine();
                    if (!emailValido(email)) {
                        throw new CuentaException("\nCorreo electronico invalido. Recuerde cumplir con el formato(mail@nombreddominio.xyz)");
                    }
                } 
                
                catch (CuentaException e) {
                    System.out.println(e.getMessage());
                }
            } 
            
            while (!emailValido(email));
            
            System.out.println("\nIntroduzca la direccion del titular de la cuenta: ");
            String direccion = scanner.nextLine();
            
            cliente = new Cliente(nombre, dni, fechaNacimiento, telefono, email, direccion);
            cuenta = new CuentaBancaria(iban, cliente);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        String opcion = "-1";
        do {
            try { 
                System.out.println("\nMenu Principal\n");
                System.out.println("1. Datos de la cuenta");
                System.out.println("2. IBAN");
                System.out.println("3. Titular");
                System.out.println("4. Saldo");
                System.out.println("5. Ingreso");
                System.out.println("6. Retirada");
                System.out.println("7. Movimientos");
                System.out.println("8. Salir");
                opcion = scanner.nextLine();

                switch (opcion) {
                    case "1":
                        System.out.println(cliente);
                        
                        break;

                    case "2":
                        System.out.println("\nSu IBAN es: " + cuenta.getIban());
                        
                        break;

                    case "3":
                        System.out.println("\nTitular de la cuenta: " + cliente.getNombre());
                        
                        break;

                    case "4":
                        System.out.println("\nSaldo actual en la cuenta: " + cuenta.getSaldo());
                        
                        break;

                    case "5":
                        System.out.println("\nCantidad a ingresar: ");
                        double ingreso = scanner.nextDouble();
                        scanner.nextLine(); 
                        
                        try {
                            cuenta.ingreso(ingreso);
                        } 
                        
                        catch (AvisarHaciendaException | CantidadNoValidoException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        
                        break;

                    case "6":
                        System.out.println("\nCantidad a retirar: ");
                        double retirada = scanner.nextDouble();
                        scanner.nextLine(); 
                        try {
                            cuenta.retirada(retirada);
                        } 
                        
                        catch (AvisarHaciendaException | CantidadNoValidoException e) {
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                        
                        break;

                    case "7":
                        System.out.println(cuenta.mostrarMovimientos());
                        
                        break;

                    case "8":
                        System.out.println("\nSaliendo del Programa");
                        
                        break;

                    default:
                        System.out.println("\nOpcion no valida, pruebe de nuevo");
                }
            } 
            
            catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        } 
        
        while (!opcion.equals("8")); 
    }

    private static boolean ibanValido(String iban) {
        return iban.matches("[A-Z]{2}\\d{22}");
    }

    private static boolean dniValido(String dni) {
        return dni.matches("\\d{8}[A-Z]{1}");
    }

    private static boolean telefonoValido(String telefono) {
        return telefono.matches("^[6]\\d{8}$");
    }

    private static boolean emailValido(String email) {
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$");
    }

    public static LocalDate leerFecha(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(mensaje);
        String dateString = entrada.next();
        return LocalDate.parse(dateString, formatter);
    }
}
