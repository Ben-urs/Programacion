import java.time.LocalDate;

public class Persona {
    String nombre;
    String dni;
    LocalDate fechaNacimiento;

    public Persona(String nombre, String dni, LocalDate fechaNacimiento) throws CuentaException {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}




























    

