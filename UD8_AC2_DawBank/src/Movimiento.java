import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {
    private String tipo;
    private double cantidad;
    private LocalDateTime fecha;
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Movimiento(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = LocalDateTime.now();
    }

    public Movimiento(String tipo, double cantidad, LocalDateTime fecha) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }


    public  String getTipo() {
        return tipo;
    }

    public  double getCantidad() {
        return cantidad;
    }

    public  LocalDateTime getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return String.format("Tipo: %s, Cantidad: %.2f, Fecha: %s", tipo, cantidad, fecha.format(fmt));
    }
}