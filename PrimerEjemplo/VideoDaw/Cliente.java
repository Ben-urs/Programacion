import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String dni;
    private String nombre;
    private String numSocio;
    private String direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBaja;
    private List<Pelicula> peliculasAlquiladas;

    // Constructor
    public Cliente(String dni, String nombre, String numSocio, String direccion, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.numSocio = numSocio;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.peliculasAlquiladas = new ArrayList<>();
    }

    // Getters y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(String numSocio) {
        this.numSocio = numSocio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public List<Pelicula> getPeliculasAlquiladas() {
        return peliculasAlquiladas;
    }

    // Métodos
    public void mostrarInfoCliente() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de Socio: " + numSocio);
        System.out.println("Dirección: " + direccion);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Fecha de Baja: " + (fechaBaja != null ? fechaBaja : "No disponible"));
    }

    public void mostrarPeliculasAlquiladas() {
        if (peliculasAlquiladas.isEmpty()) {
            System.out.println("No hay películas alquiladas.");
        } else {
            System.out.println("Películas alquiladas:");
            for (Pelicula pelicula : peliculasAlquiladas) {
                System.out.println("- " + pelicula.getTitulo());
            }
        }
    }
}
