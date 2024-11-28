import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.tools.DocumentationTool.Location;

public class Cliente {
    private String dni;
    private String nombre;
    private String numSocio = "[A-Z]{1}[0-9]{4}";
    private String Direccion;
    private String FechaNacimiento;
    private String FechaBaja;
    private String PeliculasAlquiladas;
    private int GestionVideo;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");
    
    public Clientes(String dni, String nombre, String numSocio, String Direccion, String FechaNacimiento, String FechaBaja, int GestionVideo) {
        this.dni = dni;
        this.nombre = nombre;
        this.numSocio = numSocio;
        this.Direcciom = Direccion;
        this.FechaNacimiento = LocalDateTime.now().format(formatter);
        this.FechaBaja = LocalDateTime.now().format(formatter);
        this.PeliculasAlquiladas = Pelicula[];
        this.GestionVideo = GestionVideo;
    }

    public String getDNI() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroSocio() {
        return numSocio;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    } 

    public String getFechaBaja() {
        return FechaBaja;
    }

    public void registrarClientes(String dni, String nombre, String numSocio) {
        if (registroCliente) {
            System.out.println("");

            return;
        }

        registroCliente [registrarClientes(dni, nombre, numSocio);] = new registroCliente(DNI, Nombre , NumeroSocio);

        GestionVideo++;
    }

    public void mostrarMovimientos() {
        if (nMovimientos == 0) {
            System.out.println("No existen movimientos");

        } 
        
        else {
            for (int i = 0; i < nMovimientos; i++) {
                movimientos[i].mostrarInfoPelicula();
            }
        }
    }

    public void ingresar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que 0");

            return;
        }

        if (cantidad >= MaximoAvisoHacienda) {
            System.out.println("AVISO: Notificar a hacienda");
        }

        saldo += cantidad;

        registrarMovimiento("Ingreso", cantidad);
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que 0");

            return;
        }

        if (saldo - cantidad < SaldoMinimo) {
            System.out.println("AVISO: Saldo insuficiente, no se puede realizar la retirada");

            return;
        }

        if (cantidad >= MaximoAvisoHacienda) {
            System.out.println("AVISO: Notificar a hacienda");
        }

        saldo -= cantidad;

        registrarMovimiento("Retirada", cantidad);

        if (saldo < 0) {
            System.out.println("AVISO: Saldo negativo");
        }
    }
    private boolean isvalidardni(String dni){
       return dni.matches("[0-9]{8}[A-Z]$");
    }
}

