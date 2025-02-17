import java.util.ArrayList;

public class CuentaBancaria {
    private String iban;
    private Cliente cliente;
    private double saldo;
    private ArrayList<Movimiento> movimientos = new ArrayList<>();

    public CuentaBancaria(String iban, Cliente cliente)  {
        this.iban = iban;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public String getIban() {
        return iban;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void registrarMovimiento(String tipo, double cantidad) {
        Movimiento movimiento = new Movimiento(tipo, cantidad);
        movimientos.add(movimiento);
    }

    public String mostrarMovimientos() {
        StringBuilder mostrartinfomove = new StringBuilder();
        for (Movimiento movimiento : movimientos) {
            mostrartinfomove.append(movimiento.toString()).append("\n");
        }
        
        return mostrartinfomove.toString();
    }

    public void ingreso(double cantidad) throws AvisarHaciendaException, CantidadNoValidoException {
        if (cantidad <= 0) {
            throw new CantidadNoValidoException("\nLa cantidad debe ser mayor que 0");
        }
        
        saldo += cantidad;
        registrarMovimiento("Ingreso", cantidad);
        
        if (cantidad >= 3000) {
            throw new AvisarHaciendaException("\nAVISO: Notificar a hacienda");
        }
    }

    public void retirada(double cantidad) throws AvisarHaciendaException, CantidadNoValidoException {
        if (cantidad <= 0) {
            throw new CantidadNoValidoException("\nLa cantidad debe ser mayor que 0");
        }

        if ((saldo - cantidad) < -50) {
            throw new CantidadNoValidoException("\nNo se puede retirar mas dinero del que hay en la cuenta");
        }

        saldo -= cantidad;
        registrarMovimiento("Retirada", cantidad);
        
        if (cantidad >= 3000) {
            throw new AvisarHaciendaException("\nAVISO: Notificar a hacienda");
        }
    }
}