import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contacto {
    private String nombre;
    private String telefono;
    private String correo;

    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Constructores //

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    // Validadores //

    // Nombre //
    public static String validarNombre(String nombre) {
        if (!nombre.matches("^[A-Z][a-zA-Z]*$")) {

            return "\nEl nombre no es valido, asegurate de que comience con una letra mayuscula y que no contenga otros caracteres aparte de las letras";
        }
        
        return null;
    }

    // Telefono //
    public static String validarTelefono(String telefono) {
        if (!telefono.matches("^[679]\\d{8}$")) {

            return "\nEl telefono no es valido, asegurate de que comience con 6, 7 o 9 y que solo tenga 9 digitos";
        }
        
        return null;
    }

    // Correo //
    public static String validarCorreo(String correo) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$");
        Matcher matcher = pattern.matcher(correo);
        if (!matcher.matches()) {

            return "\nEl correo electronico no es valido, asegurate de que cumpla con este formato (mail@nombreddominio.xyz)";
        }
        
        return null;
    }

    @Override
    public String toString() {
        return "\nContacto: " + "\nNombre del contacto: " + nombre + "\nNumero de telefono del contacto: " + telefono + "\nCorreo electronico del contacto: " + correo;
    }
}