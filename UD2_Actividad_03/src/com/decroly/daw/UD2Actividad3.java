package com.decroly.daw;

import java.util.Scanner;

public class UD2Actividad3 {

	public static void main(String[] args) {
						
		String opcion ="";
		   Scanner reader = new Scanner(System.in);		
		   		   		
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
	}
}





// https://es.stackoverflow.com/questions/152104/c%C3%B3mo-cierra-un-scanner-en-java





