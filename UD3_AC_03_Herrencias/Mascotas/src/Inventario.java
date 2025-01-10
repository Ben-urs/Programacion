public class Inventario {
    private Mascotas[] listaDeMascotas;
    private int cantidadActual;
    private static final int CAPACIDAD_MAXIMA = 100;

    public Inventario() {
        listaDeMascotas = new Mascotas[CAPACIDAD_MAXIMA];
        cantidadActual = 0;
    }

    public void mostrarListaDeMascotas() {
        for (int i = 0; i < cantidadActual; i++) {
            listaDeMascotas[i].mostrarInformacion();
        }
    }

    public void mostrarMascotaPorIndice(int indice) {
        if (indice >= 0 && indice < cantidadActual) {
            listaDeMascotas[indice].mostrarInformacion();
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public void mostrarTodosLosDetalles() {
        for (int i = 0; i < cantidadActual; i++) {
            System.out.println("\nMascota " + (i + 1) + ":");
            listaDeMascotas[i].mostrarInformacion();
            System.out.println("Edad: " + listaDeMascotas[i].edad);
            System.out.println("Estado: " + listaDeMascotas[i].estado);
            System.out.println("Fecha de nacimiento: " + listaDeMascotas[i].fechaNacimiento);
        }
    }

    public void agregarMascota(Mascotas mascota) {
        if (cantidadActual < CAPACIDAD_MAXIMA) {
            listaDeMascotas[cantidadActual] = mascota;
            cantidadActual++;
        } else {
            System.out.println("El inventario está lleno.");
        }
    }

    public void eliminarMascotaPorIndice(int indice) {
        if (indice >= 0 && indice < cantidadActual) {
            for (int i = indice; i < cantidadActual - 1; i++) {
                listaDeMascotas[i] = listaDeMascotas[i + 1];
            }
            listaDeMascotas[cantidadActual - 1] = null;
            cantidadActual--;
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public void vaciarInventario() {
        for (int i = 0; i < cantidadActual; i++) {
            listaDeMascotas[i] = null;
        }
        cantidadActual = 0;
    }
}