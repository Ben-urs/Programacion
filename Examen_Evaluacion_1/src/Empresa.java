import java.time.LocalDate;

public class Empresa {
    private String nombre;
    private String cif;
    private LocalDate fechaFuncion;
    private int maxTrabajadores;
    private Trabajador[] trabajadores;

    public Empresa(String nombre ) {
        this.nombre = nombre;
        this.cif = cif;
        this.fechaFuncion = fechaFuncion;
        this.maxTrabajadores = 0;
        this.trabajadores = new Trabajador[maxTrabajadores];
    }
    public void registrarTrabajador(Trabajador trabajador) {
        if (maxTrabajadores < trabajadores.length) {
            trabajadores[maxTrabajadores] = trabajador;
            maxTrabajadores++;

            System.out.println("Trabajadores registrados " + trabajador);

        } 
        
        else {
            System.out.println("No se pueden registrar más trabajadores.");
        }
    }

    public boolean eliminarTrabajador(String Trabajador) {
        for (int i = 0; i < maxTrabajadores; i++) {

            if (trabajadores[i].equals(Trabajador)) {
                trabajadores[i] = trabajadores[maxTrabajadores - 1]; 
                trabajadores[maxTrabajadores - 1] = null; 
                maxTrabajadores--;

                return true;
            }
        }

        return false;
    }

    @SuppressWarnings("unlikely-arg-type")
    public void eliminarPersonal() {
        for (int i = 0; i < maxTrabajadores; i++) {

            if (trabajadores[i].equals(trabajadores)) {
                trabajadores[i] = trabajadores[--maxTrabajadores];

                return;
            }
        }
    }

    public String mostrarInformacionEmpresa() {
        String info = "Empresa: " + nombre + "\n";

        info += "Trabajadores:\n";

        for (int i = 0; i < maxTrabajadores; i++) {
            info += "Nombre: " + trabajadores[i].nombre + trabajadores[i] + "\n";
        }
        return info;
    }

    public String mostrarInformacionTrabajadores() {
        String infoTrabajadores = "Lista de Trabajadores de la empresa: " + nombre + "\n" + cif + "\n" + fechaFuncion + "\n";
        
        infoTrabajadores += "Trabajadores:\n";

        for (int i = 0; i < maxTrabajadores; i++) {
            infoTrabajadores += "Trabajador: " + trabajadores[i].nombre;
        }
        return infoTrabajadores;
    }
    
    public String getnombreEmpresa(){
        return nombre;
    }

    public String getCIF(){
        return cif;
    }

    public LocalDate getFechaFuncion(){
        return fechaFuncion;
    }

    public int getMaxTrabajadores(){
        return maxTrabajadores;
    }

    public Trabajador[] getTrabajadores() {
        return trabajadores;
    }
}
