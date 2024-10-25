public class Ejercicio_14 {
    public static void main(String[] args) {

        int[] array = new int[55]; 

        int incre = 0;

        for (int i = 1; i <= 10; i++) {

            for (int j = 0; j < i; j++) {

                array[incre++] = i; 
            }
        }

        System.out.println("Muestra del array con la secuencia de numeros del 1 al 10: ");
        System.out.println();

        for (int valor : array) {

            System.out.print(valor + " ");
        }
    }
}