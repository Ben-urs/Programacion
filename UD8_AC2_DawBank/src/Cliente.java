import java.time.LocalDate;

class Cliente extends Persona {
    private int id;
    private String telefono;
    private String email;
    private String direccion;

    public Cliente(String nombre, String dni, LocalDate fechaNacimiento, String telefono, String email, String direccion) throws CuentaException {
        super(nombre, dni, fechaNacimiento);
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public void setId(int id) { 
        this.id = id; 
    }
    
    public int getId() { 
        return id; 
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "\nDatos de la Cuenta\n" + "\nNombre: " + nombre + "\nDNI: " + dni + "\nFecha de Nacimiento: " + getFechaNacimiento() +
        "\nTelefono: " + telefono + "\nCorreo Electronico: " + email + "\nDireccion: " + direccion;
    }
}
