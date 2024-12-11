import java.util.Scanner;

public class Gestion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Empresa empresa = null;

        String opcion;

        do {
            System.out.println("Bienvenido a la aplicación de gestión de empresas. \n");
            System.out.println("Seleccione una de las siguientes opciones: \n");
            System.out.println("Menu");
            System.out.println("1 - Crear una empresa");
            System.out.println("2 - Crear Personal");
            System.out.println("3 - Registrar trabajador en empresa");
            System.out.println("4 - Mostrar información general de la empresa");
            System.out.println("5 - Mostrar número de trabajadores actuales");
            System.out.println("6 - Mostrar informacion de todos los trabajadores");
            System.out.println("7 - Eliminar trabajador de la empresa");
            System.out.println("8 - Eliminar personal del progarma");
            System.out.println("9 - Salir de la aplicacion \n");
            System.out.print("Opción: ");

            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Introduce el nombre de la empresa: \n");
                    
                    String nombreEmpresa = teclado.nextLine();

                    empresa = new Empresa(nombreEmpresa); 

                    System.out.println("Empresa creada exitosamente. \n");

                    break;

                case "2":
                    if (empresa ==null){

                        System.out.println("Primero debe crear una empresa. \n");

                        break; 
                    }
                case "3":
                    if (empresa == null) {

                        System.out.println("Primero debe crear una empresa. \n");
                        
                        break;
                    }

                    registrarTrabajador(empresa, teclado);
                    
                    break;

                case "4":
                    if (empresa == null) {

                        System.out.println("Primero debe crear una empresa. \n");
                        
                        break;
                    }

                    System.out.println(empresa.mostrarInformacionEmpresa());
                    
                    break;

                case "5":
                    if (empresa == null) {
                        System.out.println("Primero debe crear una empresa. \n");
                        
                        break;
                    }

                    System.out.println(empresa.mostrarInformacionTrabajadores());
                    
                    break;

                case "6":
                    if (empresa == null) {
                        System.out.println("Primero debe crear una empresa. \n");
                        
                        break;
                    }

                    System.out.println(empresa.mostrarInformacionTrabajadores());
                    
                    break;

                case "7":
                    if (empresa == null) {

                        System.out.println("Primero debe crear una empresa. \n");
                        
                        break;
                    }

                    eliminarTrabajador(empresa, teclado);
                    
                    break;

                case "8":
                    if (empresa == null) {

                        System.out.println("Primero debe crear una empresa. \n");
                        
                        break;
                    }
                    
                   //eliminarPersonal(empresa, teclado);//
                                        
                    break;
                    
                case "9":
                    System.out.println("Saliendo del programa. ¡Hasta pronto!");
                                        
                    break;
                    
                    default:
                    System.out.println("Opcion no valida. Intente nuevamente. \n");
            }
        } 
                    while (!opcion.equals("9"));
                    
                            teclado.close();
                }
                    
            //private static void eliminarPersonal(Empresa empresa, Scanner teclado) {//
                  //   new ("eliminarPersonal");//
                //}//
                    
        private static void registrarTrabajador(Empresa empresa, Scanner teclado) {
        System.out.println("Registrar Trabajador");
        String ntrabajador = teclado.nextLine();
        System.out.println("Introduce el nombre del trabajador:");
        String nombreTabajador = teclado.nextLine();
        System.out.println("Introduce la Fecha de Nacimiento:");
        String fechaNacimientoTrabajador = teclado.nextLine();
        System.out.println("Introduce el DNI del trabajador:");
        String dniTrabajador = teclado.nextLine();
        
    
          //  if (setValidDni(dni)) {//
        //  System.out.println("DNI correcto \n"); //      
       // } 
        
        // else {       //
          //  System.out.println("DNI incorrecto, intentelo de nuevo\n"); //          
        // }   //

        System.out.println("Introduce el Numero de la SS:");
        String numSS = teclado.nextLine();

        if (ntrabajador.equals("")) {
            System.out.println("");
            Trabajador trabajador = new Trabajador(nombreTabajador, dniTrabajador, fechaNacimientoTrabajador,numSS, numSS);
            empresa.registrarTrabajador (trabajador);
        }
    }
    private static void eliminarTrabajador(Empresa empresa, Scanner teclado) {
        System.out.println("Introduce el DNI del trabajador para eliminar:");
       
        String dniTrabajador = teclado.nextLine();
        
        if (empresa.eliminarTrabajador(dniTrabajador)) {
            System.out.println("Trabajador eliminado.");
        } 
        
        else {
            System.out.println("No se encontr un trabajador con ese DNI.");
        }

    }
}