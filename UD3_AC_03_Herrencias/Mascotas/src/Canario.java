public class Canario extends Aves {
    private String color;
    private boolean canta;

    public Canario(String nombre, int edad, String estado, String fechaNacimiento, String tipoDePico, String capacidadDeVuelo, String color, boolean canta) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoDePico = tipoDePico;
        this.capacidadDeVuelo = capacidadDeVuelo;
        this.color = color;
        this.canta = canta;
    }

    @Override
    void mostrarInformacion() {
        System.out.println("Canario - Nombre: " + nombre + ", Color: " + color);
    }

    @Override
    void realizarVuelo() {
        System.out.println("Vuela.");
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
        System.out.println("¡Habla!");
    }
}