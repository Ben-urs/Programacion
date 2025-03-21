import java.io.Serializable;
import java.time.LocalDate;

public class Libro implements Serializable{

    private static final long serialVersionUID = 2378456123498765432L;

    private String isbn;
    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;

    public Libro(String isbn, String titulo, String autor, LocalDate fechaPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nLibro: ");
        sb.append("ISBN: ").append(isbn);
        sb.append(", Titulo del Libro: ").append(titulo);
        sb.append(", Autor: ").append(autor);
        sb.append(", Fecha dePublicacion: ").append(fechaPublicacion);
        return sb.toString();
    }
}

