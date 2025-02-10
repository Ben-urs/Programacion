public class Gato5 {
    private String nombre;
    private int edad;

    public Gato5(String nombre, int edad) throws ExcepcionNombre5, ExcepcionEdad5 {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        
        return nombre;
    }

    public void setNombre(String nombre) throws ExcepcionNombre5 {
        
        if (nombre.length() < 3) {
            throw new ExcepcionNombre5("\nNombre incorrecto. Recuerda, debe tener minimo 3 letras");
        }

        this.nombre = nombre;
    }

    public int getEdad() {
        
        return edad;
    }

    public void setEdad(int edad) throws ExcepcionEdad5 {
        
        if (edad < 0) {
            throw new ExcepcionEdad5("\nEdad incorrecta. Recuerda, la edad no puede ser negativa");
        }

        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("\nInformacion del Gato: ");
        System.out.println("\nNombre: " + nombre + " - Edad: " + edad);
    }
}