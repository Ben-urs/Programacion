package com.decroly.daw;

import java.util.Scanner;

public class UD2Actividad3 {

    public static void main(String[] args) {

        String opcion = "";
        
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Actividad 1 - Cambio de billetes");
        
        System.out.println("Introduce los billetes que quierras cambiar que sean multiplo de 5: ");
		
		int cantidad = scanner.nextInt();
		
		if (cantidad % 5 !=0) {
			
			System.out.println("La cantodad tiene que ser multiplo de 5");
			
			scanner.close();
			
			return;
		}

		int billet500 = 0;
		
		if (cantidad >= 500) {
			
			billet500 = cantidad / 500;
			cantidad = cantidad -(billet500 * 500);
		}

		int billet200 = 0;
		
		if (cantidad >= 200) {
		
			billet200 = cantidad / 200;
			cantidad = cantidad -(billet200 * 200);
		}
		
		int billet100 = 0;
		
		if (cantidad >= 100) {
			
			billet100 = cantidad / 100;
			cantidad = cantidad -(billet100 * 100);
		}

		int billet50 = 0;
		
		if (cantidad >= 50) {
			
			billet50 = cantidad / 50;
			cantidad = cantidad -(billet50 * 50); 
		}
		
		int billet20 = 0;
		
		if (cantidad >= 20) {
			
			billet20 = cantidad / 20;
			cantidad = cantidad -(billet20 * 20);
		}
		
		int billet10 = 0;
		
		if (cantidad >= 10) {
			
			billet10 = cantidad / 10;
			cantidad = cantidad -(billet10 * 10);
		}
		
		int billet5 = 0;
		
		if (cantidad >= 5) {
			
			billet5 = cantidad / 5;
			cantidad = cantidad -(billet5 * 5);	
		}

		System.out.println("Billetes nesesarios");
		
		if (billet500 > 0) {
			
			System.out.println(billet500 + "  de 500");
		}

		if (billet200 > 0) {
			
			System.out.println(billet200 + "  de 200");
		}
		
		if (billet100 > 0) {
			
			System.out.println(billet100 + "  de 100");
		}

		if (billet50 > 0) {
			
			System.out.println(billet50 + "  de 50");
		}
		
		if (billet20 > 0) {
			
			System.out.println(billet20 + "  de 20");
		}

		if (billet10 > 0) {
			
			System.out.println(billet10 + "  de 10");
		}

		if (billet5 > 0) {
			
			System.out.println(billet5 + "  de 5");
		}
        
        
        scanner.nextLine(); 

        System.out.println("Actividad 2 - Calculadora");
        
        do {
        	
            System.out.println("Inserta el número 1 para Sumar");
            System.out.println("Inserta el número 2 para Restar");
            System.out.println("Inserta el número 3 para Multiplicar");
            System.out.println("Inserta el número 4 para Dividir");
            System.out.println("Inserta el número 5 para Salir");
            
            opcion = scanner.nextLine();

            switch (opcion) {
            
                case "1":
                	
                    System.out.print("Escribe el primer número: ");
                    
                    double num1 = scanner.nextDouble();
                    
                    System.out.print("Escribe el segundo número: ");
                    
                    double num2 = scanner.nextDouble();
                    
                    double suma = num1 + num2;
                    
                    System.out.println("Suma: " + suma);
                    
                    break;

                case "2":
                	
                    System.out.print("Escribe el primer número: ");
                    
                    double nume1 = scanner.nextDouble();
                    
                    System.out.print("Escribe el segundo número: ");
                    
                    double nume2 = scanner.nextDouble();
                    
                    double restar = nume1 - nume2;
                    
                    System.out.println("Resta: " + restar);
                    
                    break;

                case "3":
                	
                    System.out.print("Escribe el primer número: ");
                    
                    double numer1 = scanner.nextDouble();
                    
                    System.out.print("Escribe el segundo número: ");
                    
                    double numer2 = scanner.nextDouble();
                    
                    double producto = numer1 * numer2;
                    
                    System.out.println("Producto: " + producto);
                    
                    break;

                case "4":
                	
                    System.out.print("Escribe el primer número: ");
                    
                    double numero1 = scanner.nextDouble();
                    
                    System.out.print("Escribe el segundo número: ");
                    
                    double numero2 = scanner.nextDouble();                   
                    
                    if (numero2 != 0) {
                    	
                        double division = numero1 / numero2;
                        
                        System.out.println("División: " + division);                   
                    } 
                    
                    else {
                    	
                        System.out.println("No se puede dividir entre 0.");
                    }
                    
                    break;

                case "5":
                	
                    System.out.println("Saliste del programa");
                    
                    break;

                default:
                	
                    System.out.println("Introduzca una opción correcta del menú");
                    
                    break;
            }

        } 
        
        while (!opcion.equals("5"));

        scanner.close();
    }
}
