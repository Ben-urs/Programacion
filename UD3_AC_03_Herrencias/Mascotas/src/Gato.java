public class Gato extends Mascotas {
    private String color;
    private boolean tienePeloLargo;

    public Gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean tienePeloLargo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.color = color;
        this.tienePeloLargo = tienePeloLargo;
    }

    @Override
    void mostrarInformacion() {
        System.out.println("Gato - Nombre: " + nombre + ", Color: " + color);
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
        System.out.println("¡Miau miau!");
    }
}