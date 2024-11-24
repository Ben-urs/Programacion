import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {
    private static int contadorID = 0; 
    private int id;
    private String fecha;
    private String tipo; 
    private double cantidad;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");

    public Movimiento(String tipo, double cantidad) {
        this.id = contadorID++;
        this.fecha = LocalDateTime.now().format(formatter);
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCantidad() {
        return cantidad;
    }
    
    public void mostrarInfoMovimiento() {
        System.out.println("ID: " + id + ", Fecha: " + fecha + ", Tipo: " + tipo + ", Cantidad: " + cantidad);
    }
}
