import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);    
        String eleccionUsuario;

        LinkedList<Producto> productos = new LinkedList<>(); 

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("./resource/Almacen.dat"))) {
            while (true) {
                int codigo = dataInputStream.readInt();
                String nombre = dataInputStream.readUTF();
                int cantidad = dataInputStream.readInt();
                double precio = dataInputStream.readDouble();
                Producto p = new Producto(codigo, nombre, cantidad, precio);
                productos.add(p);
            }
        } 
        
        catch (EOFException e) {
        } 
        
        catch (IOException e) {
            System.out.println("\nError al leer el archivo: " + e.getMessage());
        }

        do {
            System.out.println("\nMenu de Almacen\n");
            System.out.println("1 - Crear producto");
            System.out.println("2 - Mostrar productos existentes");
            System.out.println("3 - Eliminar producto");
            System.out.println("4 - Guardar productos");
            System.out.println("5 - Salir\n");
            
            eleccionUsuario = reader.nextLine();
            
            if (eleccionUsuario.equals("1")) {
                System.out.println("\nIntroduzca el codigo del producto: ");
                int codigo = reader.nextInt();
                reader.nextLine();

                System.out.println("Introduzca el nombre del producto: ");
                String nombre = reader.nextLine();

                System.out.println("Introduzca la cantidad del producto: ");
                int cantidad = reader.nextInt();

                System.out.println("Introduzca el precio del producto: ");
                double precio = reader.nextDouble();
                reader.nextLine(); 

                Producto p = new Producto(codigo, nombre, cantidad, precio);
                productos.add(p);
                System.out.println("\nProducto añadido: " + p.toString());
                
            } 
            
            else if (eleccionUsuario.equals("2")) {
                for (Producto p : productos) {
                    System.out.println(p.toString());
                }

            } 
            
            else if (eleccionUsuario.equals("3")) {
                System.out.println("\nIntroduce el codigo del producto que quieres eliminar: ");
                int codigo = reader.nextInt();
                reader.nextLine(); 

                Producto eliminaProducto = null;

                for (Producto producto1 : productos) {
                    if (producto1.getCodigo() == codigo) {
                        eliminaProducto = producto1;
                        break; 
                    }
                }

                if (eliminaProducto != null) {
                    productos.remove(eliminaProducto);
                    System.out.println("\nEl producto se ha eliminado");
                } 
                
                else {
                    System.out.println("\nNo se ha encuentra el producto");
                }

            } else if (eleccionUsuario.equals("4")) {
                try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("./resource/Almacen.dat"))) {
                    for (Producto p : productos) {
                        dataOutputStream.writeInt(p.getCodigo());
                        dataOutputStream.writeUTF(p.getNombre());
                        dataOutputStream.writeInt(p.getCantidad());
                        dataOutputStream.writeDouble(p.getPrecio());
                    }
                    System.out.println("\nProductos guardados");
                } 
                
                catch (Exception e) {
                    System.out.println("\nError al guardar productos: " + e.getMessage());
                }
            }

        } 
        
        while (!eleccionUsuario.equals("5"));
    
        System.out.println("\nHas salido del Almacen");  
        reader.close(); 
    }
}