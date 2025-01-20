class ContactoPersona extends Contacto {
    private String cumpleanos; 

    public ContactoPersona(String nombre, String telefono, String cumpleanos) {
        super(nombre, telefono);
        this.cumpleanos = cumpleanos;
    }

    public String getCumpleanos() {

        return cumpleanos;
    }

    @Override
    public String toString() {

        return "Persona - Nombre: " + nombre + ", Telefono: " + telefono + ", Cumpleaños: " + cumpleanos;
    }
}