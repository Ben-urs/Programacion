import java.util.ArrayList;
import java.util.List;

public class App {
    private static final double SALDO_MINIMO = -50;
    private static final double LIMITE_HACIENDA = 3000;

    private String iban;
    private String titular;
    private double saldo;
    private List<Movimiento> movimientos;

    public App(String iban, String titular) {
        if (!iban.matches("[A-Z]{2}\\d{22}")) {
            throw new IllegalArgumentException("IBAN inválido");
        }
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
        this.movimientos = new ArrayList<>();
    }

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void ingresar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor a 0.");
            return;
        }
        saldo += cantidad;
        movimientos.add(new Movimiento("Ingreso", cantidad));
        if (cantidad > LIMITE_HACIENDA) {
            System.out.println("AVISO: Notificar a hacienda");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor a 0.");
            return;
        }
        if (saldo - cantidad < SALDO_MINIMO) {
            System.out.println("Operación no permitida: saldo insuficiente.");
            return;
        }
        saldo -= cantidad;
        movimientos.add(new Movimiento("Retirada", cantidad));
        if (saldo < 0) {
            System.out.println("AVISO: Saldo negativo");
        }
        if (cantidad > LIMITE_HACIENDA) {
            System.out.println("AVISO: Notificar a hacienda");
        }
    }
}
