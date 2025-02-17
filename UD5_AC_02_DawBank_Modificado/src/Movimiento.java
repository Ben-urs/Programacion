import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Movimiento {
    private String tipo;
    private double cantidad;
    private LocalDateTime fecha;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Movimiento(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "\nTipo: " + tipo + ", Cantidad: " + cantidad + ", Fecha: " + fecha.format(formatter);
    }
}