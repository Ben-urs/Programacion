
import java.util.Scanner;

public class UD2_Actividad_01 {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		// 1-Programa que da los Buenos días.
		System.out.println("Buenos días");
		
	
		// 2-Programa que calcula y muestra el área de un cuadrado de lado igual a 5.
		long lado = 5;
	
		long area = lado * lado;
	
		System.out.println("El area del cuadrado con lado igual a 5 es: "  + area);
		
	
		// 3-Programa que calcule el área de un cuadrado cuyo lado se introduce por teclado.
		System.out.print("Escribe un número: " );
		
		double lado5 = scanner.nextDouble();
		double area5 = lado5 * lado5;
		
		System.out.println("El area del cuadrado " + lado5 + " es: " + area5);
		
		
		// 4-Programa que lea dos números y calcule suma, resta, producto y división.
		System.out.print("Escribe el primer número: ");
        
		double num1 = scanner.nextDouble();
        
		System.out.print("Escribe el segundo número: ");
        
		double num2 = scanner.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double producto = num1 * num2;
        double division = num1 / num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        if (num2 != 0) {
        	
        	System.out.println("División: " + division);
        
        }
        
        
        
        //5-Programa que calcula la longitud de la circunferencia, área del círculo y volumen de la esfera dado el radio.
        System.out.print("Introduce el valor del radio: ");
        
        double radio = scanner.nextDouble();

        double longCircun = 2 * Math.PI * radio;
        double areaCirc = Math.PI * radio * radio;
        double voluEsf = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        System.out.println("Longitud de la circunferencia: " + longCircun);
        System.out.println("Área del círculo: " + areaCirc);
        System.out.println("Volumen de la esfera: " + voluEsf);
        
        
        //6-Programa que muestra el porcentaje de descuento entre el precio original y el precio de venta.
        System.out.print("Escribe el precio original: ");
        
        double preOrig = scanner.nextDouble();
        
        System.out.print("Escribe el precio de venta: ");
        
        double preVent = scanner.nextDouble();

        double descuento = ((preOrig - preVent) / preOrig) * 100;

        System.out.println("El porcentaje de descuento es de un: " + descuento + "%");
        
        
        //7-Programa que convierte millas marinas a metros.
        System.out.print("Escribe las millas marinas: ");
        
        double millas = scanner.nextDouble();
        double metros = millas * 1852;//Una milla son 1852 metros.
        
        System.out.println("La distancia en metros es de: " + metros + "m");
        
        
        
        //8-Programa que lee dos números y los muestra en orden ascendente.
        System.out.print("Escribe el primer número: ");
        
        double nume1 = scanner.nextInt();
        
        System.out.print("Escribe el segundo número: ");
        
        double nume2 = scanner.nextInt();
        if (nume1 < nume2) {
            
        	System.out.println(nume1 + ", " + nume2);
        
        } 
        
        else {
            
        	System.out.println(nume2 + ", " + nume1);
        
        }
        
        
        
        //9-Programa que lee dos números y dice cuál es el mayor o si son iguales.
        System.out.print("Escribe el primer número: ");
        
        double numer1 = scanner.nextInt();
        
        System.out.print("Escribe el segundo número: ");
        
        double numer2 = scanner.nextInt();

        if (numer1 > numer2) {
            
        	System.out.println("El número mayor es: " + numer1);
        } 
        
        else if (numer1 < numer2) {
            
        	System.out.println("El número mayor es: " + numer2);
        } 
        
        else {
            
        	System.out.println("Los números son iguales");
        
        }
        
        
        
        //10-Programa que lee tres números distintos y dice cuál es el mayor.
        System.out.print("Escribe el primer número: ");
        
        double numero1 = scanner.nextInt();
        
        System.out.print("Escribe el segundo número: ");
        
        double numero2 = scanner.nextInt();
        
        System.out.print("Escribe el tercer número: ");
        
        double numero3 = scanner.nextInt();

        double mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }

        if (numero3 > mayor) {
            mayor = numero3;
        }

        System.out.println("El numero " + mayor + " es el mayor de los tres");
        
        
        
        //11-Programa que lee dos números, calcula y muestra el valor de su suma, resta, producto y división.(Teniendo en cuenta la división por cero).
        System.out.print("Escribe el primer número: ");
        
        double pnum1 = scanner.nextDouble();
        
        System.out.print("Escribe el segundo número: ");
        
        double pnum2 = scanner.nextDouble();

        double suma1 = pnum1 + pnum2;
        double resta1 = pnum1 - pnum2;
        double prod1 = pnum1 * pnum2;
        
        System.out.println("Suma: " + suma1);
        System.out.println("Resta: " + resta1);
        System.out.println("Producto: " + prod1);

        if (pnum2 != 0) {
            double div1 = pnum1 / pnum2;
            
            System.out.println("División: " + div1);
            
        } 
        
        else {
        	
            System.out.println("División: No se puede dividir entre cero.");
        
        }
        
       
        
      //12-Programa que lee dos números y muestra el mayor.
        System.out.print("Escribe el primer número: ");
        
        double pnume1 = scanner.nextDouble();
        
        System.out.print("Escribe el segundo número: ");
        
        double pnume2 = scanner.nextDouble();

        if (pnume1 > pnume2) {
        	
            System.out.println("El número mayor es: " + pnume1);
            
        } 
        
        else if (pnume2 > pnume1) {
        	
            System.out.println("El número mayor es: " + pnume2);
           
        } 
        
        
        
        //13-Programa que lee un número y dice si es positivo o negativo considerando el cero como positivo.
        System.out.print("Escribe un número: ");
        
        double num = scanner.nextDouble();

        if (num >= 0) {
        	
            System.out.println("El número es positivo.");
            
        } 
        
        else {
            
        	System.out.println("El número es negativo.");
        
        }
        
        scanner.close();
             
	}

}

