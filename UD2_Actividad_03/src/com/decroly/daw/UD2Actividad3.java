package com.decroly.daw;

import java.util.Scanner;

public class UD2Actividad3 {

	public static void main(String[] args) {
						
		String opcion ="";
		   Scanner scanner = new Scanner(System.in);		
		   		   		
		do {
			System.out.println("Inserta el numero 1 para Sumar");
			System.out.println("Inserta el numero 2 para Restar");
			System.out.println("Inserta el numero 3 para Multiplicar");
			System.out.println("Inserta el numero 4 para Dividir");
			System.out.println("Inserta el numero 5 para Salir");
			opcion = reader.nextLine();
				
		switch(opcion)
        
		{
            case "1":
            	reader = new Scanner(System.in);
            	
            	System.out.print("Escribe el primer número: ");

            	double num1 = reader.nextDouble();

            	System.out.print("Escribe el segundo número: ");

            	double num2 = reader.nextDouble();
            	
            	double suma = num1 + num2;
            	
            	System.out.println("Suma: " + suma);
                
            	break;

            case "2":
            	reader = new Scanner(System.in);
            	
            	System.out.print("Escribe el primer número: ");

            	double nume1 = reader.nextDouble();

            	System.out.print("Escribe el segundo número: ");

            	double nume2 = reader.nextDouble();
            	
            	double restar = nume1 - nume2;
            	
            	System.out.println("Resta: " + restar);
            	
                break;

            case "3":
            	reader = new Scanner(System.in);
            	
            	System.out.print("Escribe el primer número: ");

            	double numer1 = reader.nextDouble();

            	System.out.print("Escribe el segundo número: ");

            	double numer2 = reader.nextDouble();
            	
            	double producto = numer1 * numer2;
            	
            	System.out.println("Producto: " + producto);
                
                break;

            case "4":
            	reader = new Scanner(System.in);
            	
            	System.out.print("Escribe el primer número: ");

            	double numero1 = reader.nextDouble();

            	System.out.print("Escribe el segundo número: ");

            	double numero2 = reader.nextDouble();
            	
            	double division = numero1 / numero2;
            	if (numero2 != 0) {
            		
            		System.out.println("División: " + division);
            		
            	}
            	                
                break;

            case "5":
            	
                    System.out.println("Saliste del programa");
                    
                    break;

            default:
            	
                    System.out.println("Introduzca una opcion correcta del menu");
                    
                    break;
                
        }


		}while(!opcion.equals("5"));	
	

		
 System.out.print("Introduce una cantidad en euros (múltiplo de 5): ");
        int cantidad = scanner.nextInt();

        
        if (cantidad % 5 != 0) {
            System.out.println("La cantidad debe ser un múltiplo de 5.");
            scanner.close();
            return; 
        }

        
        int billetes500 = 0;
        if (cantidad >= 500) {
            billetes500 = cantidad / 500;
            cantidad = cantidad - (billetes500 * 500); 
        }

        
        int billetes200 = 0;
        if (cantidad >= 200) {
            billetes200 = cantidad / 200;
            cantidad = cantidad - (billetes200 * 200); 
        }

        
        int billetes100 = 0;
        if (cantidad >= 100) {
            billetes100 = cantidad / 100;
            cantidad = cantidad - (billetes100 * 100); 
        }

       
        int billetes50 = 0;
        if (cantidad >= 50) {
            billetes50 = cantidad / 50;
            cantidad = cantidad - (billetes50 * 50); 
        }

        
        int billetes20 = 0;
        if (cantidad >= 20) {
            billetes20 = cantidad / 20;
            cantidad = cantidad - (billetes20 * 20); 
        }

       
        int billetes10 = 0;
        if (cantidad >= 10) {
            billetes10 = cantidad / 10;
            cantidad = cantidad - (billetes10 * 10); 
        }

        
        int billetes5 = 0;
        if (cantidad >= 5) {
            billetes5 = cantidad / 5;
            cantidad = cantidad - (billetes5 * 5); 
        }

        
        System.out.println("Billetes necesarios:");
        if (billetes500 > 0) {
            System.out.println(billetes500 + " billete(s) de 500 €");
        }
        if (billetes200 > 0) {
            System.out.println(billetes200 + " billete(s) de 200 €");
        }
        if (billetes100 > 0) {
            System.out.println(billetes100 + " billete(s) de 100 €");
        }
        if (billetes50 > 0) {
            System.out.println(billetes50 + " billete(s) de 50 €");
        }
        if (billetes20 > 0) {
            System.out.println(billetes20 + " billete(s) de 20 €");
        }
        if (billetes10 > 0) {
            System.out.println(billetes10 + " billete(s) de 10 €");
        }
        if (billetes5 > 0) {
            System.out.println(billetes5 + " billete(s) de 5 €");
        }

        
        scanner.close();
    }
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	





// https://es.stackoverflow.com/questions/152104/c%C3%B3mo-cierra-un-scanner-en-java





