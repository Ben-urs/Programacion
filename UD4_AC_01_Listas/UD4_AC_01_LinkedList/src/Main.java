import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Harina", 2);
        Producto producto2 = new Producto("Aceite", 1);
        Producto producto3 = new Producto("Levadura", 2);
        Producto producto4 = new Producto("Sal", 1);
        Producto producto5 = new Producto("Agua", 6);

        LinkedList<Producto> productos = new LinkedList<>();

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);

        System.out.println("Productos en el LinkedList: ");

        Iterator<Producto> iterator1 = productos.iterator();
        
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        productos.remove(producto3); 
        productos.remove(producto4); 

        Producto productoNuevo = new Producto("Levadura Fresca", 6);
        productos.add(1, productoNuevo);

        System.out.println("\nContenido del LinkedList: ");
        Iterator<Producto> iterator2 = productos.iterator();

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        Collections.sort(productos, (p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        System.out.println("\nContenido del LinkedList ordenado: ");
        Iterator<Producto> iterator3 = productos.iterator();

        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }

        productos.clear();

        System.out.println("\nContenido del LinkedList eliminado: ");
        System.out.println(productos);
    }
}