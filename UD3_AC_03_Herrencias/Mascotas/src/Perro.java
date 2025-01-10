public class Perro extends Mascotas {
    private String raza;
    private boolean tienePulgas;

    public Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean tienePulgas) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.raza = raza;
        this.tienePulgas = tienePulgas;
    }

    @Override
    void mostrarInformacion() {
        System.out.println("Perro - Nombre: " + nombre + ", Raza: " + raza);
    }

    @Override
    void cumpleaños() {
        edad++;
    }

    @Override
    void marcarComoFallecido() {
        estado = "fallecido";
    }

    @Override
    void hablar() {
        System.out.println("Sonido");
    }
}