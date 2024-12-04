import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.tools.DocumentationTool.Location;

public class Cliente {
    private String dni;
    private String nombre;
    private String numSocio = "[A-Z]{1}[0-9]{4}";
    private String Direccion;
    private String FechaNacimiento;
    private String FechaBaja;
    private String PeliculasAlquiladas;
    private int GestionVideo;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");
    
    public Cliente(String dni, String nombre, String numSocio, String Direccion, String FechaNacimiento, String FechaBaja, int GestionVideo) {
        this.dni = dni;
        this.nombre = nombre;
        this.numSocio = numSocio;
        this.Direccion = Direccion;
        this.FechaNacimiento = LocalDateTime.now().format(formatter);
        this.FechaBaja = LocalDateTime.now().format(formatter);
        this.PeliculasAlquiladas = Pelicula[];
        this.GestionVideo = GestionVideo;
    }

    public String getDNI() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroSocio() {
        return numSocio;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    } 

    public String getFechaBaja() {
        return FechaBaja;
    }

    public String getPeliculasAlquiladas() {
        return PeliculasAlquiladas;

    public void registrarClientes(String dni, String nombre, String numSocio) {
        if (registroCliente) {
            System.out.println("");

            return;
        }

        registroCliente [registrarClientes(dni, nombre, numSocio, Direccion, FechaNacimiento);] = new registroCliente(dni, nombre , numSocio, Direccion, FechaNacimiento); 

        GestionVideo++;
    }

    public void mostrarinfoCliente(String dni, String nombre, String numSocio, String Direccion) {
        if (infoCliente() == 0) {
            System.out.println("No existe informacion de este cliente");

        } 
        
        else {
            for (int i = 0; i < infoCliente(); i++) {
                mostrarinfoCliente();[i].mostrarInCliente();
            }
        }
    }

    public void mostrarPeliculasAlquiladas() {
        if (peliculaAlquilada() == 0) {
            System.out.println("No tiene ninguna Pelicula Alquilada");

            return;
        }

        else{
            for (int i = 0; i < peliculaAlquilada(); i++) {
                mostrarPeliculasAlquiladas();[i].mostrarInfoPelicula();
            }
        }
    }
    private boolean isvalidardni(String dni){
       return dni.matches("[0-9]{8}[A-Z]$");
    }
}

}