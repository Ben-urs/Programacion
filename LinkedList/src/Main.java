import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
public static void main(String[] args) {
  LinkedList<Producto> productos = new LinkedList<Producto>();


  Producto p1 = new Producto("P1", 10);
  Producto p2 = new Producto("P2", 20);
  Producto p3 = new Producto("P3", 30);
  Producto p4 = new Producto("P4", 40);
  Producto p5 = new Producto("P5", 50);

  productos.add(p1); 
  productos.add(p2); 
  productos.add(p3); 
  productos.add(p4); 
  productos.add(p5);
  

  Iterator<Producto> itera = productos.iterator();
  Producto p;
  System.out.println("Productos iniciales");
  while (itera.hasNext()) {
    p = itera.next(); 

    
    System.out.println(p.getNombre() + " " + p.getCantidad());


   if (p.equals(p1) || p.equals(p2)) {
      itera.remove();
  } 
  }


  System.out.println("Productos despues de eliminar");
  for (Producto producto : productos) {
    System.out.println(producto.getNombre() + " " + producto.getCantidad());
  }


  Producto p50 = new Producto("P50", 60);
productos.add(1, p50);

 
System.out.println("Productos despues de anadir un producto random");
Iterator<Producto> itera1 = productos.iterator();
  Producto producto = null;
  while (itera1.hasNext()) {
    producto = itera1.next(); 
   
    System.out.println(producto.getNombre() + " " + producto.getCantidad());
  }
  
        Collections.sort(productos);

       
        System.out.println("Productos despues de ordenar por nombre");
        for (Producto a : productos) {
            System.out.println(a.getNombre() + " " + a.getCantidad());
        }
  productos.clear();
System.out.println("Productos despues de eliminar");
if (productos.isEmpty()) {
  System.out.println("No hay productos");
} else {
  productos.clear();
  System.out.println("Se eliminaron los productos");
}
}



}