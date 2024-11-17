import java.text.SimpleDateFormat;
import java.util.Date;

public class Movimiento {
    private static int contadorID = 1; // Contador para IDs únicos
    private int id;
    private String fecha;
    private String tipo; // "Ingreso" o "Retirada"
    private double cantidad;

    public Movimiento(String tipo, double cantidad) {
        this.id = contadorID++;
        this.fecha = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public void mostrarInfoMovimiento() {
        System.out.println("ID: " + id + ", Fecha: " + fecha + ", Tipo: " + tipo + ", Cantidad: " + cantidad + "€");
    }
}
