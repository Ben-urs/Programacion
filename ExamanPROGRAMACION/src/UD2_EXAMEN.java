import java.util.Scanner;

public class UD2_EXAMEN { 
        public static void main(String[] args) {
    
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Introduce la cantidad de numeros que quieras guardar ");

            int N = scanner.nextInt();
            int opcion;
            double[] guard = new double[N];
           
            do {
                System.out.println("Menú:");
                System.out.println("Mostrar valores, introduce (a)");
                System.out.println("Introducir valor, introduce (b)");
                System.out.println("Mostrar la suma de todos los valores, intoduce (v)");
                System.out.println("Mostrar el valor maximo, introduce (m)");
                System.out.println("Mostrar el valor minimo, introduce (e)");
                System.out.println("Salir, introduce (s)");
                System.out.println();
                System.out.print("Elige una opción: ");

                opcion = scanner.next().charAt(0);

                switch (opcion) {

                    case 'a':
                    System.out.println();
                    System.out.println("Valores guardados:");
                    System.out.println();

                    for (int i = 0; i < guard.length; i++) {

                        System.out.print(guard[i] + " ");
                    }

                    System.out.println();

                    break;

                case 'b':

                for (int i = 0; i < N; i++) {

                    System.out.print("Introduce el numeros " + (i + 1) + " a guardar: ");
                    
                    guard[i] = scanner.nextDouble();
                }

                    break;

                //case 'v':

                //for () {

                  //  System.out.println("La suma de todos los valores es: " + suma);

                //}

                  //  break;

                //case 'm':

                //for () {

                  //  System.out.println("El valores maximo introducido es: " + maxi);

                //}

                  //  break;

                //case 'e':

                //for ( ) {

                    //System.out.println("El valores minimo introducido es: " + mini);

                //}

                  //  break;

                case 's':
                    System.out.println("Saliste del menu.");

                    break;

                default:
                    System.out.println("la Opcion no es valida.");
            }

                double suma = 0;
                double max = guard[0];
                double min = guard[0];
            
                for (double guard1 : guard) {
    
                    suma += guard1;
                    
                    if (guard1 > max) max = guard1;
                    if (guard1 < min) min = guard1;
                }
            
                double media = suma / N;
            
                for (double guard1 : guard) {
    
                    if (guard1 > media) max++;
    
                    else if (guard1 < media) min++;
                }
            
                System.out.println("La media de todos los valores es: " + media);
                System.out.println("La suma de todos es: " + suma);
                System.out.println("Numero maximo es: " + max);
                System.out.println("Numero minima es: " + min);
                System.out.println();
        
        } 
          
        while (opcion != 's');

        scanner.close();
        
    }
}

