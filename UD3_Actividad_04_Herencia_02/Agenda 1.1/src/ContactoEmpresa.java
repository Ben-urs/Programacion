class ContactoEmpresa extends Contacto {
    private String paginaWeb;

    public ContactoEmpresa(String nombre, String telefono, String paginaWeb) {
        super(nombre, telefono);
        this.paginaWeb = paginaWeb;
    }

    public String getPaginaWeb() {
        
        return paginaWeb;
    }

    @Override
    public String toString() {

        return "Empresa - Nombre: " + nombre + ", Telefono: " + telefono + ", Pagina Web: " + paginaWeb;
    }
}