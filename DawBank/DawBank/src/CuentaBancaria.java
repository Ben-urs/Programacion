public class CuentaBancaria {
    private String iban;
    private String titular;
    private double saldo;
    private Movimiento[] movimientos;
    private int nMovimientos;

    private static final double SaldoMinimo = -50;
    private static final double MaximoAvisoHacienda = 3000;

    public CuentaBancaria(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0.0;
        this.movimientos = new Movimiento[100];
        this.nMovimientos = 0;
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
