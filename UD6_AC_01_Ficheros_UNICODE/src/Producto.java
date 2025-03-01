public class Producto {
        private int codigo;
        private String nombre;
        private  int cantidad;
        private double precio;
        private static int contador = 1;
    
        public Producto(int codigo, String nombre, int cantidad, double precio) {
            this.codigo = codigo; 
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.precio = precio;
            contador++; 
        }
    
        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public static int getContador() {
            return contador;
        }

        public static void setContador(int contador) {
            Producto.contador = contador;
        }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nProducto: ");
        sb.append("Codigo: ").append(codigo);
        sb.append(", Nombre: ").append(nombre);
        sb.append(", Cantidad: ").append(cantidad);
        sb.append(", Precio: ").append(precio);
        return sb.toString();
    }

}
