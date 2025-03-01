import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class Validador {

    public static boolean validarCIF(String cif) {
        final String validarcif = "[A-Z]{1}[0-9]{8}";
        return Pattern.matches(validarcif, cif);
    }

    public static boolean validarDNI(String dni) {
        final String validardni = "[0-9]{8}[A-Z]{1}";
        return Pattern.matches(validardni, dni);
    }

    public static boolean validarNumeroSocio(String numSocio) {
        final String validarNumSocio = "S-[0-9]{4}"; 
        return Pattern.matches(validarNumSocio, numSocio);
    }

    public static boolean validarCodigoPelicula(String codPelicula) {
        final String validarCodPelicula = "P-[0-9]{4}"; 
        return Pattern.matches(validarCodPelicula, codPelicula);
    }

    public static boolean validarCodigoVideojuego(String codVideojuego) {
        final String validarCodVideojuego = "V-[0-9]{4}"; 
        return Pattern.matches(validarCodVideojuego, codVideojuego);
    }

    public static boolean esMayorDeEdad(LocalDate fechaNacimiento) {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears() >= 18;
    }
}