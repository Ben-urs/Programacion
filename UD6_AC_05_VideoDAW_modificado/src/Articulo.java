import java.time.LocalDate;

public abstract class Articulo {
    private String cod;
    private String titulo;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;

    public Articulo(String cod, String titulo, LocalDate fechaRegistro) {
        this.cod = cod;
        this.titulo = titulo;
        this.fechaRegistro = fechaRegistro;
        this.fechaBaja = null; 
    }

    public String getCod() {
        return cod;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Override
    public String toString() {
        return "Codigo: " + cod + ", Titulo: " + titulo + ", Fecha de Registro: " + fechaRegistro + ", Fecha de Baja: " + fechaBaja;
    }
}