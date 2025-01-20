class Agenda {
    private Contacto[] contactos;
    private int contador;

    public Agenda() {
        contactos = new Contacto[5]; 
        contador = 0;
    }

    public boolean añadirContacto(Contacto nuevoContacto) {
        if (contador >= contactos.length) {
            System.out.println("\nLa agenda esta llena");

            return false;
        }

        if (!existeContacto(nuevoContacto.getNombre())) {
            contactos[contador] = nuevoContacto;
            contador++;

            return true;
        }

        return false; 
    }

    public boolean eliminarContacto(String nombre) {
        int index = buscaContacto(nombre);

        if (index != -1) {
            for (int i = index; i < contador - 1; i++) {
                contactos[i] = contactos[i + 1];
            }
            contactos[contador - 1] = null; 
            contador--;

            return true; 
        }

        return false; 
    }

    public boolean existeContacto(String nombre) {

        return buscaContacto(nombre) != -1;
    }

    public void listarContactos() {
        if (contador == 0) {
            System.out.println("\nLa agenda esta vacia");
        } 
        
        else {
            for (int i = 0; i < contador; i++) {
                System.out.println(contactos[i].toString());
            }
        }
    }

    public int buscaContacto(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {

                return i; 
            }
        }
        
        return -1; 
    }
}
