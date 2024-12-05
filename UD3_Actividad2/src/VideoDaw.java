import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.tools.DocumentationTool.Location;

public class VideoDaw {
    private String CIF;
    private String Direccion;
    private String FechaAlta;
    private Pelicula[] PeliculasRegistradas;
    private Cliente[] ClientesRegistrados;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");
    
    public VideoDaw(String CIF, String Direccion, String FechaAlta, Pelicula[] PeliculasRegistradas, Cliente[] ClientesRegistrados) {
        this.CIF = CIF;
        this.Direccion = Direccion;
        this.FechaAlta = LocalDateTime.now().format(formatter);;
        this.PeliculasRegistradas = PeliculasRegistradas;
        this.ClientesRegistrados = ClientesRegistrados;
    }

    public String getCIF() {
        return CIF;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getFechaAlta() {
        return FechaAlta;
    }

    public String getPeliculaRegistrada() {
        return PeliculasRegistradas;
    } 

    public String getClienteRegistrado() {
        return ClientesRegistrados;
    }

    public void mostrarInfoVideoClub() {
        System.out.println("CIF: " + CIF);
        System.out.println("Dirección: " + Direccion);
        System.out.println("Fecha de Alta: " + FechaAlta);
    }

    public void mostrarPeliculasRegistradas(String Titulo,String Genero, String FechaRegistro) {
        if (PeliculasRegistradas()) {
            System.out.println("No hay películas registradas.");

        } else {
            System.out.println("Películas registradas:");

            for (Pelicula pelicula : PeliculasRegistradas) {

                System.out.println("- " + pelicula.getTitulo());
            }
        }
    }

    public void mostrarClientesRegistrados(String dni, String nombre, String numSocio, String FechaNacimiento) {
        if (ClientesRegistrados()) {
            System.out.println("No hay clientes registrados.");

        } else {
            System.out.println("Clientes registrados:");

            for (Cliente cliente : ClientesRegistrados) {
                System.out.println(" " + cliente.getNombre());
            }
        }
    }


    public void alquilarPelicula(Pelicula, Cliente) {
        if (IsAlquilada.IsAlquilada()) {
            System.out.println("La película ya está alquilada.");

        } else {
            System.out.println("Película alquilada con éxito.");
        }
    }

    public void devolverPelicula(Pelicula , Cliente ) {
        if (Pelicula.getPeliculasAlquiladas()) {
            Pelicula.setIsAlquilada(false);
            Pelicula.getPeliculasAlquiladas();
            System.out.println("Película devuelta con éxito.");
        } else {
            System.out.println("El cliente no tiene esta película alquilada.");
        }
    }
}
