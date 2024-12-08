import java.time.LocalDate;

class Cliente {
    private String dni;
    private String nombre;
    private String numSocio;
    private String direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBaja;
    private Pelicula[] peliculasAlquiladas;
    private int numPeliculasAlquiladas;

    public Cliente(String dni, String nombre, String numSocio, String direccion, LocalDate fechaNacimiento, LocalDate fechaBaja) {
        this.dni = dni;
        this.nombre = nombre;
        this.numSocio = numSocio;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaBaja = fechaBaja;
        this.peliculasAlquiladas = new Pelicula[10]; 
        this.numPeliculasAlquiladas = 0;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumSocio() {
        return numSocio;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void alquilarPelicula(Pelicula pelicula) {
        if (numPeliculasAlquiladas < peliculasAlquiladas.length) {

            peliculasAlquiladas[numPeliculasAlquiladas++] = pelicula;
            pelicula.setAlquilada(true); 
        } 
        
        else {
            System.out.println("No se pueden alquilar más películas.");
        }
    }
    
    public void devolverPelicula(Pelicula pelicula) {
        for (int i = 0; i < numPeliculasAlquiladas; i++) {

            if (peliculasAlquiladas[i].equals(pelicula)) {

                peliculasAlquiladas[i] = peliculasAlquiladas[--numPeliculasAlquiladas];
                pelicula.setAlquilada(false); 

                return;
            }
        }

        System.out.println("La película no está alquilada por este cliente.");
    }

    public String mostrarInfoCliente() {
       String infoCliente = String.format("DNI:%s, Nombre:%s, Numero de Socio:%s", 
        this.dni, this.nombre, this.numSocio);

        return infoCliente;
    }

    public String mostrarPeliculasAlquiladas() {
        StringBuilder sb = new StringBuilder("Películas alquiladas:");

        for (int i = 0; i < numPeliculasAlquiladas; i++) {
            sb.append(peliculasAlquiladas[i].mostrarInfoPelicula()).append("");
        }
        
        return sb.toString();
    }
}