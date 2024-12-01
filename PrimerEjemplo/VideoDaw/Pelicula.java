import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pelicula {
    private String cod;
    private String titulo;
    private Genero genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean isAlquilada;

    // Constructor
    public Pelicula(String cod, String titulo, Genero genero, LocalDate fechaRegistro) {
        this.cod = cod;
        this.titulo = titulo;
        this.genero = genero;
        this.fechaRegistro = fechaRegistro;
        this.isAlquilada = false;
    }

    // Getters y setters
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public LocalDateTime getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDateTime fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public boolean isAlquilada() {
        return isAlquilada;
    }

    public void setAlquilada(boolean isAlquilada) {
        this.isAlquilada = isAlquilada;
    }

    // Método para mostrar información
    public void mostrarInfoPelicula() {
        System.out.println("Código: " + cod);
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Fecha de Registro: " + fechaRegistro);
        System.out.println("Fecha de Baja: " + (fechaBaja != null ? fechaBaja : "No disponible"));
        System.out.println("Fecha de Alquiler: " + (fechaAlquiler != null ? fechaAlquiler : "No disponible"));
        System.out.println("¿Está alquilada?: " + (isAlquilada ? "Sí" : "No"));
    }
}
