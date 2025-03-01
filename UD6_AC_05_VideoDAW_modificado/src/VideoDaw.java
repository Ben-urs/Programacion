import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class VideoDaw {
    private String cif;
    private String direccion;
    private LocalDate fechaAlta;
    private List<Articulo> articulosRegistrados;
    private List<Cliente> clientesRegistrados;

    public VideoDaw(String cif, String direccion, LocalDate fechaAlta) {
        this.cif = cif;
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
        this.articulosRegistrados = new ArrayList<>();
        this.clientesRegistrados = new ArrayList<>();
    }

    public void mostrarInfoVideoClub() {
        System.out.println("CIF: " + cif + ", Direccion: " + direccion + ", Fecha de Alta: " + fechaAlta);
    }

    public void mostrarArticulosRegistrados() {
        for (Articulo articulo : articulosRegistrados) {
            System.out.println(articulo);
        }
    }

    public void mostrarClientesRegistrados() {
        for (Cliente cliente : clientesRegistrados) {
            System.out.println(cliente);
        }
    }

    public void alquilarArticulo(Articulo articulo, Cliente cliente) {
        articulo.aceptar(new ArticuloA() {
            @Override
            public void a(Pelicula pelicula) {
                if (!pelicula.isAlquilada()) {
                    pelicula.setAlquilada(true);
                    pelicula.setFechaAlquiler(LocalDateTime.now());
                    cliente.getArticulosAlquilados().add(pelicula);
                    System.out.println("\nArticulo alquilado: " + pelicula.getTitulo());
                } 
                else {
                    System.out.println("\nEl articulo ya esta alquilado");
                }
            }

            @Override
            public void a(Videojuego videojuego) {
                if (!videojuego.isAlquilada()) {
                    videojuego.setAlquilada(true);
                    videojuego.setFechaAlquiler(LocalDateTime.now());
                    cliente.getArticulosAlquilados().add(videojuego);
                    System.out.println("\nArtículo alquilado: " + videojuego.getTitulo());
                } 
                else {
                    System.out.println("\nEl articulo ya esta alquilado.");
                }
            }
        });
    }

    public void devolverArticulo(Articulo articulo, Cliente cliente) throws VideoClubException {
        articulo.aceptar(new ArticuloA() {
            @Override
            public void a(Pelicula pelicula) {
                if (pelicula.isAlquilada()) {
                    LocalDateTime fechaActual = LocalDateTime.now();
                    if (fechaActual.isBefore(pelicula.getFechaAlquiler().plusHours(48))) {
                        pelicula.setAlquilada(false);
                        cliente.getArticulosAlquilados().remove(pelicula);
                        System.out.println("Articulo devuelto: " + pelicula.getTitulo());
                    } 
                    else {

                        try {
                            throw new VideoClubException("\nEl tiempo de alquiler ha excedido las 48 horas");
                        } 
                        catch (VideoClubException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                } 
                else {
                    System.out.println("\nEl articulo no esta alquilado");
                }
            }
    
            @Override
            public void a(Videojuego videojuego) {
                if (videojuego.isAlquilada()) {
                    LocalDateTime fechaActual = LocalDateTime.now();
                    if (fechaActual.isBefore(videojuego.getFechaAlquiler().plusHours(48))) {
                        videojuego.setAlquilada(false);
                        cliente.getArticulosAlquilados().remove(videojuego);
                        System.out.println("\nArticulo devuelto: " + videojuego.getTitulo());
                    } else {

                        try {
                            throw new VideoClubException("\nEl tiempo de alquiler ha excedido las 48 horas");
                        } 
                        catch (VideoClubException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                } 
                else {
                    System.out.println("\nEl articulo no esta alquilado");
                }
            }
        });
    }

    public void registrarArticulo(Articulo articulo) throws VideoClubException {
        for (Articulo a : articulosRegistrados) {
            if (a.getCod().equals(articulo.getCod())) {
                throw new VideoClubException("\nEl articulo ya esta registrado");
            }
        }
        articulosRegistrados.add(articulo);
        System.out.println("\nArticulo registrado: " + articulo.getTitulo());
    }

    public void registrarCliente(Cliente cliente) throws VideoClubException {
        for (Cliente c : clientesRegistrados) {
            if (c.getNumSocio().equals(cliente.getNumSocio())) {
                throw new VideoClubException("\nEl cliente ya esta registrado");
            }
        }
        clientesRegistrados.add(cliente);
        System.out.println("\nCliente registrado: " + cliente.getNombre());
    }

    public void darDeBajaCliente(String numSocio) throws VideoClubException {
        Cliente clienteABaja = null;
        for (Cliente cliente : clientesRegistrados) {
            if (cliente.getNumSocio().equals(numSocio)) {
                clienteABaja = cliente;
                break;
            }
        }
        
        if (clienteABaja != null) {
            clienteABaja.setFechaBaja(LocalDate.now()); 
            clientesRegistrados.remove(clienteABaja); 
            System.out.println("\nCliente dado de baja: " + clienteABaja.getNombre());
        } 
        else {
            throw new VideoClubException("\nCliente no encontrado con el numero de socio: " + numSocio);
        }
    }

    public void darDeBajaArticulo(String cod) throws VideoClubException {
        Articulo articuloABaja = null;
        for (Articulo articulo : articulosRegistrados) {
            if (articulo.getCod().equals(cod)) {
                articuloABaja = articulo;
                break;
            }
        }
        
        if (articuloABaja != null) {
            articuloABaja.setFechaBaja(LocalDate.now()); 
            articulosRegistrados.remove(articuloABaja); 
            System.out.println("\nArticulo dado de baja: " + articuloABaja.getTitulo());
        } 
        else {
            throw new VideoClubException("\nArticulo no encontrado con el codigo: " + cod);
        }
    }

    public List<Articulo> getArticulosRegistrados() {
        return articulosRegistrados;
    }

    public List<Cliente> getClientesRegistrados() {
        return clientesRegistrados;
    }
}