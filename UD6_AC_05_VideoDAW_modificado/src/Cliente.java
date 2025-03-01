import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private String numSocio;
    private LocalDate fechaBaja;
    private List<Articulo> articulosAlquilados;

    public Cliente(String dni, String nombre, String direccion, LocalDate fechaNacimiento, String numSocio) {
        super(dni, nombre, direccion, fechaNacimiento);
        this.numSocio = numSocio;
        this.fechaBaja = null; 
        this.articulosAlquilados = new ArrayList<>();
    }

    public String getNumSocio() {
        return numSocio;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public List<Articulo> getArticulosAlquilados() {
        return articulosAlquilados;
    }

    public void mostrarArticulosAlquilados() {
        for (Articulo articulo : articulosAlquilados) {
            System.out.println(articulo);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de Socio: " + numSocio + ", Fecha de Baja: " + fechaBaja;
    }
}