import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.tools.DocumentationTool.Location;

public class Pelicula {
    private int CodPelicula;
    private String Titulo;
    private Genero Genero;
    private String FechaRegistro;
    private String FechaBaja;
    private String FechaAlquiler;
    private GestionVideoDaw[] GestionVideoDaw;
    boolean IsAlquilada = false;
    private int GestionVideo;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");
    
    public static boolean ComprobarAlquilada(String IsAlquilada) {
        Pattern pat = Pattern.compile("patron");
        Matcher mat = pat.matcher(IsAlquilada);
        IsAlquilada = mat.matches();
        return IsAlquilada;
    }


    public Pelicula(int CodPelicula, String Titulo,Genero Genero, String FechaAlquiler, String FechaBaja, GestionVideoDaw[] GestionVideoDaw, int GestionVideo) {
        this.CodPelicula = CodPelicula;
        this.Titulo = Titulo;
        this.Genero = Genero;
        this.FechaRegistro = LocalDateTime.now().format(formatter);
        this.FechaBaja = LocalDateTime.now().format(formatter);
        this.FechaAlquiler = LocalDateTime.now().format(formatter);
        this.GestionVideoDaw = GestionVideoDaw;
        this.GestionVideo = GestionVideo;
        
    }

    public int getCodPelicula() {
        return CodPelicula;
    }

    public String getTitulo() {
        return Titulo;
    }

    public Genero getGenero() {
        return Genero;
    }

    public String FechaRegistro() {
        return FechaRegistro;
    }

    public String FechaBaja() {
        return FechaBaja;
    } 

    public String getFechaAlquiler() {
        return FechaAlquiler;
    }

    public GestionVideoDaw[] geGestionVideoDaw() {
        return GestionVideoDaw;
    }

    public int GestionVideo() {
        return GestionVideo;
    }

    public void mostrarInfoPelicula(int CodPelicula , String Titulo, Genero Genero, String FechaRegistro, String FechaBaja, String FechaAlquiler) {
        if (InfoPelicula()) {
            System.out.println("No hay Peliculas registrados.");

        } else {
            System.out.println("Peliculas registrados:");

            Pelicula[] peliculasRegistradas;
                        for (Pelicula Pelicula : peliculasRegistradas) {
                System.out.println(" " + Pelicula.getTitulo());
            }
        }
    }

    public static boolean peliculaAlquilada(int CodPelicula, String Titulo, String FechaAlquiler) {
        
        boolean isAlquilada = false;
        
        if{
            this.FechaAlquiler = FechaAlquiler;
            isAlquilada = true;
        }
    }
    






}
}