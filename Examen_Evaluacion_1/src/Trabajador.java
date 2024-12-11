public class Trabajador {

    String nombre;
    private String fechaNacimiento;
    private String dni;
    private String direccion;
    private String numeroSS;

    public Trabajador( String nombre, String fechaNacimiento, String dni, String direccion, String numeroSS) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.direccion = direccion;
        this.numeroSS = numeroSS;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return  fechaNacimiento;
    }

    public String getDNI() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumeroSegSocial() {
        return numeroSS;
    }

    public String mostrarInfoTrabajador() {
        String infoTrabajador = String.format("Nombre:%s, Fecha de Nacimiento:%s, DNI:%s, Direccion:%s Nimero de la Seguridad Social:%s", 
        this.nombre, this.fechaNacimiento, this.dni, this.direccion, this.numeroSS);

        return infoTrabajador;
    }
}


