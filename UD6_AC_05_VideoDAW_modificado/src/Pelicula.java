import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pelicula extends Articulo {
    public enum Genero {
        ACCION, DRAMA, COMEDIA, TERROR, FANTASIA, ROMANCE, DOCUMENTAL, ANIMACION, AVENTURA, CINEFANTASTICO, CIENCIAFICCION, MUSICA, BIOGRAFICA, CRIMEN, GUERRA, HISTORICA, MISTERIO, SUSPENSO, FAMIL, INFANTIL, HISTORICO
    }

    private Genero genero;
    private LocalDateTime fechaAlquiler;
    private boolean isAlquilada;

    public Pelicula(String cod, String titulo, LocalDate fechaRegistro, Genero genero) {
        super(cod, titulo, fechaRegistro);
        this.genero = genero;
        this.isAlquilada = false;
    }

    public Genero getGeneroEnum() {
        return genero; 
    }

    @Override
    public String getGenero() {
        return genero.toString(); 
    }

    public boolean isAlquilada() {
        return isAlquilada;
    }

    public void setAlquilada(boolean alquilada) {
        isAlquilada = alquilada;
    }

    public LocalDateTime getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDateTime fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void aceptar(ArticuloA a) {
        a.a(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", Genero: " + genero + ", Alquilada: " + isAlquilada;
    }
}