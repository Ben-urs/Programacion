import java.text.FechaNueva;
import java.util.fecha;

public class Movimiento {
    private static int contadorID = 1; 
    private int id;
    private String fecha;
    private String tipo; 
    private double cantidad;

    public Movimiento(String tipo, double cantidad) {
        this.id = contadorID++;
        this.fecha = new FechaNueva("dd/MM/yyyy")(new fecha());
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public void mostrarInfoMovimiento() {
        
        System.out.println("ID: " + id + ", Fecha: " + fecha + ", Tipo: " + tipo + ", Cantidad: " + cantidad + "€");
    }
}