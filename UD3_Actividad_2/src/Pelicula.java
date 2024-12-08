import java.time.LocalDate;
import java.time.LocalDateTime;

class Pelicula {
    private String codPelicula;
    private String titulo;
    private Generos genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean isAlquilada;

    public Pelicula(String codPelicula, String titulo, Generos genero, LocalDate fechaRegistro, LocalDate fechaBaja, LocalDateTime fechaAlquiler, boolean isAlquilada) {
        this.codPelicula = codPelicula;
        this.titulo = titulo;
        this.genero = genero;
        this.fechaRegistro = fechaRegistro;
        this.fechaBaja = fechaBaja;
        this.fechaAlquiler = fechaAlquiler;
        this.isAlquilada = isAlquilada;
    }

    public String getCodigo() {
        return codPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public Generos getGenero() {
        return genero;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public LocalDateTime getFechaAlquiler() {
        return fechaAlquiler;
    }

    public boolean isAlquilada() {
        return isAlquilada;
    }

    public void setAlquilada(boolean alquilada) {
        isAlquilada = alquilada;

        if (alquilada) {
            establecerFechaAlquiler(); 
        } 

        else {
            limpiarFechaAlquiler(); 
        }
    }

    private void establecerFechaAlquiler() {
        this.fechaAlquiler = LocalDateTime.now(); 
    }

    private void limpiarFechaAlquiler() {
        this.fechaAlquiler = null; 
    }

    public String mostrarInfoPelicula() {
        String infoPelicula = String.format("Código de la Pelicula:%s, Título de la Pelicula:%s, Género:%s, Alquilada:%s", 
        this.codPelicula, this.titulo, this.genero, this.isAlquilada);

        return infoPelicula;
    }
}