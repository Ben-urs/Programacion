import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.tools.DocumentationTool.Location;

public class VideoDaw {
    private String CIF;
    private String Direccion;
    private String FechaAlta;
    private String PeliculasRegistradas = Pelicula[];
    private String ClientesRegistrados = Cliente[];
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");
    
    public VideoDaw(String CIF, String Direccion, String FechaAlta, String PeliculasRegistradas, String ClientesRegistrados) {
        this.CIF = CIF;
        this.Direccion = Direccion;
        this.FechaAlta = LocalDateTime.now().format(formatter);;
        this.PeliculasRegistradas = PeliculasRegistradas;
        this.ClientesRegistrados = ClientesRegistrados;
    }

    public int getCodPelicula() {
        return codpelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String FechaRegistro() {
        return fecharegistro;
    }

    public String FechaBaja() {
        return fechabaja;
    } 
}