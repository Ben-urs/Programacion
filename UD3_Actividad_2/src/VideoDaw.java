import java.time.LocalDate;

class VideoDaw {
    private String cif;
    private String direccion;
    private String fechaAlta;
    private Pelicula[] peliculasRegistradas;
    private Cliente[] clientesRegistrados;
    private int numPeliculas;
    private int numClientes;

    public VideoDaw(String cif, String direccion, String fechaAlta) {
        this.cif = cif;
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
        this.peliculasRegistradas = new Pelicula[100];
        this.clientesRegistrados = new Cliente[100];
        this.numPeliculas = 0;
        this.numClientes = 0;
    }

    public void registrarPelicula(Pelicula pelicula) {
        if (numPeliculas < peliculasRegistradas.length) {

            peliculasRegistradas[numPeliculas++] = pelicula; 
        } 

        else {
            System.out.println("No se pueden registrar mas peliculas");
        }
    }

    public void registrarCliente(Cliente cliente) {
        if (numClientes < clientesRegistrados.length) {

            clientesRegistrados[numClientes++] = cliente;
        } 

        else {
            System.out.println("No se pueden registrar mass clientes");
        }
    }

    public Cliente buscarCliente(String dni) {
        for (int i = 0; i < numClientes; i++) {

            if (clientesRegistrados[i].getDni().equals(dni)) {

                return clientesRegistrados[i];
            }
        }
        return null;
    }

    public Pelicula buscarPelicula(String codigo) {
        for (int i = 0; i < numPeliculas; i++) {

            if (peliculasRegistradas[i].getCodigo().equals(codigo)) {

                return peliculasRegistradas[i];
            }
        }

        return null;
    }

    public void darBajaCliente(Cliente cliente) {
        for (int i = 0; i < numClientes; i++) {

            if (clientesRegistrados[i].equals(cliente)) {

                clientesRegistrados[i] = clientesRegistrados[--numClientes];

                return;
            }
        }
    }

    public void darBajaPelicula(Pelicula pelicula) {
        for (int i = 0; i < numPeliculas; i++) {

            if (peliculasRegistradas[i].equals(pelicula)) {

                peliculasRegistradas[i] = peliculasRegistradas[--numPeliculas];

                return;
            }
        }
    }

    public String mostrarInfoVideoClub() {
        String infoVideoClub = String.format("Informacion del Video club - CIF:%s, Dirección:%s", 
        this.cif, this.direccion);
    
        return infoVideoClub;
    }
}