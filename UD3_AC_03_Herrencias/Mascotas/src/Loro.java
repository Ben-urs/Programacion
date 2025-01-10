public class Loro extends Aves {
    private String lugarDeOrigen;
    private String fraseHablar;

    public Loro(String nombre, int edad, String estado, String fechaNacimiento, String tipoDePico, String capacidadDeVuelo, String lugarDeOrigen, String fraseHablar) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoDePico = tipoDePico;
        this.capacidadDeVuelo = capacidadDeVuelo;
        this.lugarDeOrigen = lugarDeOrigen;
        this.fraseHablar = fraseHablar;
    }

    @Override
    void mostrarInformacion() {
        System.out.println("Loro - Nombre: " + nombre + ", Origen: " + lugarDeOrigen);
    }

    @Override
    void realizarVuelo() {
        System.out.println("El loro está volando.");
    }

    public void saludar() {
        System.out.println(fraseHablar);
    }

    @Override
    void celebrarCumpleaños() {
        edad++;
    }

    @Override
    void marcarComoFallecido() {
        estado = "fallecido";
    }

    @Override
    void emitirSonido() {
        System.out.println(fraseHablar);
    }
}
