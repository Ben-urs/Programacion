package com.decroly.daw;

import java.util.Scanner;

public class UD2Actividad2 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);	
		
		
	//1-Programa que pide la edad por teclado y muestra "Eres mayor de edad" si lo eres.

        
System.out.print("Introduce tu edad: ");
        
	int edad = scanner.nextInt();
        
    if (edad >= 18) {
            
    System.out.println("Eres mayor de edad");	
		
            
        }
		
		
        
//2-Programa que pide la edad y muestra si eres mayor o menor de edad.
 System.out.print("Introduce tu edad: ");
        
 	int edad1 = scanner.nextInt();
        
 	if (edad1 >= 18) {
        	
    System.out.println("Eres mayor de edad");
        } 
        
        else {
        	
            System.out.println("Eres menor de edad");
        
        }
        
        
        
        //3-Programa que muestra los 20 primeros números naturales.
        for (int i = 1; i <= 20; i++) {
        	
            System.out.println(i);
            
        }
        
        
        
        //4-Programa que muestra los números pares entre 1 y 200 (suma de 2 en 2).
        for (int i = 2; i <= 200; i += 2) {
        	
            System.out.println(i);
            
        }
        
        
        
        //5-Programa que muestra los números pares entre 1 y 200 (sumando de 1 en 1).
        for (int i = 1; i <= 200; i++) {
        	
            if (i % 2 == 0) {
            	
                System.out.println(i);
                
            }
        }
        
        
        
        //6-Programa que muestra los números desde 1 hasta un número N que se introduce por teclado.
        System.out.print("Introduce un número N: ");
        int N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        
        
        //7-Programa que transforma una calificación numérica en calificación alfabética.
        System.out.print("Introduce una calificación numérica (0-10): ");
        double calificacion = scanner.nextDouble();
        
        if (calificacion >= 0 && calificacion < 3) {
            System.out.println("Muy Deficiente");
        } else if (calificacion >= 3 && calificacion < 5) {
            System.out.println("Insuficiente");
        } else if (calificacion >= 5 && calificacion < 6) {
            System.out.println("Bien");
        } else if (calificacion >= 6 && calificacion < 9) {
            System.out.println("Notable");
        } else if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Calificación no válida");
        }
        
        
        
        //8-Programa que calcula el factorial de un número N.
        System.out.print("Introduce un número positivo N: ");
        int 1 = scanner.nextInt();
       
        long factorial = 1;
        for (int i = 1; i <= N1; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de " + N1 + " es: " + factorial);
        
        
        
        //9-Programa que calcula la hora después de un segundo.
        System.out.print("Introduce la hora: ");
        int horas = scanner.nextInt();
        System.out.print("Introduce los minutos: ");
        int minutos = scanner.nextInt();
        System.out.print("Introduce los segundos: ");
        int segundos = scanner.nextInt();
        
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
        
        System.out.printf("Hora después de un segundo: %02d:%02d:%02d\n", horas, minutos, segundos);
        
        
        
        
        scanner.close(); 
        






















	}

}
