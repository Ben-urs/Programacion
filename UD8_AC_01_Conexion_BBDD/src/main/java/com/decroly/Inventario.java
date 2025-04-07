package com.decroly;

import java.util.List;
import java.util.Scanner;
import com.SQLAccessProducto;

public class Inventario {
    public static void main(String[] args) {
        String variableNombre;
        Scanner Scanner = new Scanner(System.in);
        int opcion = 0;
        String referencia;
        SQLAccessProducto miDataPrueba = new SQLAccessProducto();

        String menu ="\nMenu\n" +
                        "\n1. Mostrar todos los Productos en el Inventario\r\n" + 
                        "2. Buscar productos por referencia\r\n" + 
                        "3. Buscar productos por tipo\r\n" + 
                        "4. Buscar productos de cantidad\r\n" + 
                        "5. Insertar un nuevo producto\r\n" + 
                        "6. Eliminar producto por referencia\r\n" + 
                        "7. Actualizar producto\r\n" + 
                        "8. Insertar un nuevo tipo de producto\r\n" + 
                        "9. Salir";
        do { 
            try {
                Scanner = new Scanner(System.in);
                System.out.println(menu);
                opcion = Scanner.nextInt();
   
                switch (opcion) {
                    case 1:
                        Scanner = new Scanner(System.in);
                        List <String> names = miDataPrueba.getListaProductos();
                        if (names.isEmpty()) {
                            System.out.println("\nNo se ha encontrado ningun dato guardado");
                        } 
                        else {
                            for (String name : names) {
                            System.out.println(name);
                        }
                    }
                    break;

                    case 2:
                    Scanner = new Scanner(System.in);
                    System.out.println("\nBuscar por referencia: "); 
                        variableNombre = Scanner.nextLine();
                        List <Producto> persona = miDataPrueba.getEncontrarPorReferencia(variableNombre);
                        if (persona.isEmpty()) {
                            System.out.println("\nNo se ha encontrado ningun dato");
                            } 
                            else {
                                for (Producto persona1 : persona) {
                                    System.out.println(persona1);
                                }
                            }
                    break;

                    case 3:
                    Scanner = new Scanner(System.in);

                    System.out.println("\nBuscar por tipo: "); 
                    int variableTipo = Scanner.nextInt();
                    List <Producto> persona1 = miDataPrueba.getEncontrarPorTipo(variableTipo);
                    if (persona1.isEmpty()) {
                        System.out.println("\nNo se ha encontrado ningun dato");
                        } 
                        else {
                            for (Producto prueb : persona1) {
                                System.out.println(prueb);
                            }
                        }                        
                    break;

                    case 4:
                    Scanner = new Scanner(System.in);
                    List <String> cantidades = miDataPrueba.getListaCantidades();
                        if (cantidades.isEmpty()) {
                            System.out.println("\nNo se ha encontrado ningun dato");
                        } 
                        else {
                            for (String verdad : cantidades) { 
                                System.out.println(verdad);
                            }
                    }

                    System.out.println("\nBuscar por referencia: "); 
                        variableNombre = Scanner.nextLine();
                        List <Producto> refer = miDataPrueba.getEncontrarPorCantidad(variableNombre);
                        if (refer.isEmpty()) {
                            System.out.println("\nNo se ha encontrado ningun dato");
                            } 
                            else {
                                for (Producto porcion : refer) {
                                    System.out.println(porcion);
                                }
                            }
                    break;

                    case 5:
                    Scanner = new Scanner(System.in);
                    Scanner = new Scanner(System.in);
                    System.out.println("\nInserte el codigo de referencia: ");  
                    referencia = Scanner.nextLine();
                    System.out.println("Inserte el nombre: ");
                    String nombre = Scanner.nextLine();
                    System.out.println("Inserte la descripcion: ");
                    String descripcion = Scanner.nextLine();
                    System.out.println( "Inserte el tipo de producto por numero (1 al 10): ");
                    int tipoId = Scanner.nextInt();
                    Scanner = new Scanner(System.in);
                    System.out.println("Inserte la cantidad del producto: ");
                    int cantidad = Scanner.nextInt();
                    System.out.println("Inserte el precio del producto: ");
                    double precio = Scanner.nextDouble();
                    System.out.println("Inserte el descuento");
                    int descuento = Scanner.nextInt();
                    Scanner = new Scanner(System.in);
                    System.out.println("Inserte el IVA del producto");
                    int iva = Scanner.nextInt();
                    System.out.println("¿Aplicar descuento? (true o false)");
                    boolean aplicarDto= Scanner.nextBoolean();
                    Producto nuevo  = new Producto(referencia, nombre, descripcion, tipoId, cantidad, precio, descuento, iva, aplicarDto);
                    int response2 = miDataPrueba.insertnuevoProducto(nuevo);
                    System.out.println("Se han insertado " + response2 + " elementos");
            
                    break;

                    case 6:
                    Scanner = new Scanner(System.in);

                    System.out.println("\nEliminar producto por referencia: ");
                    referencia = Scanner.nextLine();

                    String resultado = miDataPrueba.deleteproductoByReferencia(referencia);
                    System.out.println(resultado);
                    
                    break;

                    case 7:
                    Scanner = new Scanner(System.in);
                    System.out.println("\nProducto al que se quiera modificar: ");
                    variableNombre = Scanner.nextLine();

                    List <Producto> productoModi = miDataPrueba.getEncontrarPorNombre(variableNombre);
                    Producto productoVictima= productoModi.getFirst();
                    if (productoModi.isEmpty()) {
                        System.out.println("\nNo se ha encontrado ningun dato");
                        } 
                        else {
                            System.out.println("Inserte descripcion: ");
                            String descripcionNueva = Scanner.nextLine();
                            System.out.println("Inserte cantidad: ");
                            int cantidadNueva = Scanner.nextInt();
                            System.out.println("Inserte precio: ");
                            double precioNuevo = Scanner.nextDouble();
                            System.out.println("Inserte descuento: ");
                            int descuentoNuevo = Scanner.nextInt();
                            System.out.println("¿Aplicar descuento?(True or false)");
                            boolean aplicarDtoNuevo = Scanner.nextBoolean();

                            productoVictima.setCantidad(cantidadNueva);
                            productoVictima.setDescripcion(descripcionNueva);
                            productoVictima.setPrecio(precioNuevo);
                            productoVictima.setDescuento(descuentoNuevo);
                            productoVictima.setAplicarDto(aplicarDtoNuevo);
                            miDataPrueba.updateproductoByID(productoVictima);
                        }
                    break;

                    case 8:
                    Scanner = new Scanner(System.in);
                    System.out.println("\nIngrese el nombre del nuevo tipo de producto: ");
                    String nuevoTipo = Scanner.nextLine();

                    List<String> result = miDataPrueba.insertarTipoProducto(nuevoTipo);
                    for (String mensaje : result) {
                        System.out.println(mensaje);
                    }
                    break;

                    case 9:
                    System.out.println("\nSaliendo del programa");
                    break;
                    default:
                    System.out.println("\nOpcion no valida, intentelo de nuevo");
                }    
            } 
            catch (Exception e) {
                System.out.println("\nOpcion no valida, intentelo de nuevo");
            }
        } 
        
        while (opcion != 9);
        
    }
}