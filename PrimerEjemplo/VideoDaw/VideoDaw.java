import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VideoDaw {
    private String cif;
    private String direccion;
    private LocalDate fechaAlta;
    private List<Pelicula> peliculasRegistradas;
    private List<Cliente> clientesRegistrados;

    // Constructor
    public VideoDaw(String cif, String direccion, LocalDate fechaAlta) {
        this.cif = cif;
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
        this.peliculasRegistradas = new ArrayList<>();
        this.clientesRegistrados = new ArrayList<>();
    }

    // Getters y setters
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public List<Pelicula> getPeliculasRegistradas() {
        return peliculasRegistradas;
    }

    public List<Cliente> getClientesRegistrados() {
        return clientesRegistrados;
    }

    // Métodos
    public void mostrarInfoVideoClub() {
        System.out.println("CIF: " + cif);
        System.out.println("Dirección: " + direccion);
        System.out.println("Fecha de Alta: " + fechaAlta);
    }

    public void mostrarPeliculasRegistradas() {
        if (peliculasRegistradas.isEmpty()) {
            System.out.println("No hay películas registradas.");
        } else {
            System.out.println("Películas registradas:");
            for (Pelicula pelicula : peliculasRegistradas) {
                System.out.println("- " + pelicula.getTitulo());
            }
        }
    }

    public void mostrarClientesRegistrados() {
        if (clientesRegistrados.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Clientes registrados:");
            for (Cliente cliente : clientesRegistrados) {
                System.out.println("- " + cliente.getNombre());
            }
        }
    }

    public void alquilarPelicula(Pelicula p, Cliente c) {
        if (p.isAlquilada()) {
            System.out.println("La película ya está alquilada.");
        } else {
            p.setAlquilada(true);
            p.setFechaAlquiler(LocalDate.now().atStartOfDay());
            c.getPeliculasAlquiladas().add(p);
            System.out.println("Película alquilada con éxito.");
        }
    }

    public void devolverPelicula(Pelicula p, Cliente c) {
        if (c.getPeliculasAlquiladas().contains(p)) {
            p.setAlquilada(false);
            c.getPeliculasAlquiladas().remove(p);
            System.out.println("Película devuelta con éxito.");
        } else {
            System.out.println("El cliente no tiene esta película alquilada.");
        }
    }
}
