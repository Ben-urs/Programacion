abstract class Mascotas {
    protected String nombre;
    protected int edad;
    protected String estado;
    protected String fechaNacimiento;

    abstract void mostrarInformacion();
    abstract void celebrarCumpleaños();
    abstract void marcarComoFallecido();
    abstract void emitirSonido();
}