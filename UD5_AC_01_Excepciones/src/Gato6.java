public class Gato6 {
    private String nombre;
    private int edad;

    public Gato6(String nombre, int edad) throws ExcepcionNombre6, ExcepcionEdad6 {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        
        return nombre;
    }

    public void setNombre(String nombre) throws ExcepcionNombre6 {
        
        if (nombre.length() < 3) {
            throw new ExcepcionNombre6("\nNombre incorrecto. Recuerda, debe tener minimo 3 letras");
        }
       
        this.nombre = nombre;
    }

    public int getEdad() {
        
        return edad;
    }

    public void setEdad(int edad) throws ExcepcionEdad6 {
        
        if (edad < 0) {
            throw new ExcepcionEdad6("\nEdad incorrecta. Recuerda, la edad no puede ser negativa");
        }
        
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre + " - Edad: " + edad);
    }
}