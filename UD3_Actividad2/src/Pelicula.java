import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.tools.DocumentationTool.Location;

public class Pelicula {
    private int CodPelicula;
    private String Titulo;
    private Genero Genero;
    private String FechaRegistro;
    private String FechaBaja;
    private String FechaAlquiler;
    private GestionVideoDaw[] GestionVideoDaw;
    boolean IsAlquilada = false;
    private int GestionVideo;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");
    
    public static boolean ComprobarAlquilada(String IsAlquilada) {
        Pattern pat = Pattern.compile("patron");
        Matcher mat = pat.matcher(IsAlquilada);
        IsAlquilada = mat.matches();
        return IsAlquilada;
    }


    public Pelicula(String Titulo,Genero Genero) {
        this.CodPelicula = CodPelicula;
        this.Titulo = Titulo;
        this.Genero = Genero;
        this.FechaRegistro = LocalDateTime.now().format(formatter);
        this.FechaBaja = LocalDateTime.now().format(formatter);
        this.FechaAlquiler = LocalDateTime.noe().format(formatter);
        this.GestionVideoDaw = new Movimiento[100];
        this.nMovimientos = 0;
    }

    public int getCodPelicula() {
        return codpelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String FechaRegistro() {
        return fecharegistro;
    }

    public String FechaBaja() {
        return fechabaja;
    } 

    public void registrarMovimiento(String tipo, double cantidad) {
        if (nMovimientos >= 100) {
            System.out.println("No se pueden realizar más movimientos");

            return;
        }

        movimientos[nMovimientos] = new Movimiento(tipo, cantidad);

        nMovimientos++;
    }

    public void mostrarMovimientos() {
        if (nMovimientos == 0) {
            System.out.println("No existen movimientos");

        } 
        
        else {
            for (int i = 0; i < nMovimientos; i++) {
                movimientos[i].mostrarInfoMovimiento();
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
}