package com.decroly.daw;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		//1-Programa que pide la edad por teclado y muestra "Eres mayor de edad" si lo eres.
		System.out.println("Actividad 1");
	        
		System.out.print("Introduce tu edad: ");
	        
		int edad = scanner.nextInt();
	        
	    if (edad >= 18) {
	            
	    	System.out.println("Eres mayor de edad");				
	    }
			
			
	        
	    //2-Programa que pide la edad y muestra si eres mayor o menor de edad.
	    System.out.println("Actividad 2");
	    
	    System.out.print("Introduce tu edad: ");
	        
	 	int edad1 = scanner.nextInt();
	        
	 	if (edad1 >= 18) {
	        	
	 		System.out.println("Eres mayor de edad");	        
	 	} 
	        
	    else {
	        	
	    	System.out.println("Eres menor de edad");	        
	    }
	        
	        
	        
	 	//3-Programa que muestra los 20 primeros números naturales.
	 	System.out.println("Actividad 3");
	 	
	 	System.out.println("Se muestran los 20 primeros numeros naturales");
	 	
	 	for (int i = 1; i <= 20; i++) {
	        	
	 		System.out.println(i);	            
	    }
	        
	        
	    //4-Programa que muestra los números pares entre 1 y 200 (suma de 2 en 2).
	 	System.out.println("Actividad 4");
	 	
	 	System.out.println("Se muestran los números pares entre 1 y 200 utilizando un contador que suma de 2 en 2");
	 	
	 	for (int i = 2; i <= 200; i += 2) {
	        	
	            System.out.println(i);	            
	        }
	        
	        
	        
	    //5-Programa que muestra los números pares entre 1 y 200 (sumando de 1 en 1).
	 	System.out.println("Actividad 5");
	 	
	 	System.out.println("Se muestran los números pares entre 1 y 200 utilizando un contador sumando de 1 en 1");
	 	
	 	for (int i = 1; i <= 200; i++) {
	        	
	            if (i % 2 == 0) {
	            	
	                System.out.println(i);	                
	            }
	   }
	        
	        
	        
	 	//6-Programa que muestra los números desde 1 hasta un número N que se introduce por teclado.
	 	System.out.println("Actividad 6");
	 	
	 	System.out.print("Introduce un número para que el programa cuente asta el: ");
	        
	 	int N = scanner.nextInt();
	        
	 	for (int i = 1; i <= N; i++) {
	            
	 		System.out.println(i);	        
	 	}
	        
	        
	 	//7-Programa que transforma una calificación numérica en calificación alfabética.
	 	System.out.println("Actividad 7");
	        
	 	System.out.print("Introduce una calificación numérica entre 0 y 10 : ");
	 	
	 	double calific = scanner.nextDouble();
	        
	 	if (calific >= 0 && calific < 3) {
	            
	 		System.out.println("Muy Deficiente");	        
	 	} 
	 	
	 	else if (calific >= 3 && calific < 5) {
	            
	 		System.out.println("Insuficiente");	        
	 	} 
	 	
	 	else if (calific >= 5 && calific < 6) {
	            
	 		System.out.println("Bien");	        
	 	} 
	 	
	 	else if (calific >= 6 && calific < 9) {
	            
	 		System.out.println("Notable");	        
	 	} 
	 		 	
	 	else if (calific >= 9 && calific <= 10) {
	            
	 		System.out.println("Sobresaliente");	        
	 	} 
	 	
	 	else {
	            
	 		System.out.println("Calificación no válida");	        
	 	}
	        
	        
	        
	 	//8-Programa que lea un número positivo N y calcule y visualice su factorial N!.
	 	System.out.println("Actividad 8");

	 	System.out.print("Introduce un número positivo para sacar su factorial: ");
	        
	 	int Nx = scanner.nextInt();

	 	if (Nx < 0) {
	            
	 		System.out.println("Por favor, introduce un número positivo.");	        
	 	} 
	 	
	 	else {
	 		
	 		long facto = 1;
	            
	 		for (int i = 1; i <= Nx; i++) {
	                facto *= i;	            
	 		}
	            System.out.println("El factorial de " + N + " es: " + facto);	        
	 	}
	 	
	        
	        
	 	//9-Programa que calcula la hora después de un segundo.
	 	System.out.println("Actividad 9");
	        
	 	System.out.print("Introduce la hora: ");
	        
	 	int horas = scanner.nextInt();
	       
	 	System.out.print("Introduce los minutos: ");
	        
	 	int min = scanner.nextInt();
	        
	 	System.out.print("Introduce los segundos: ");
	        
	 	int seg = scanner.nextInt();
    
	 	seg++;
	 	if (seg == 60) {
	 		seg = 0;
	        min++;
	        
	        if (min == 60) {
	                min = 0;
	                horas++;
	                
	                if (horas == 24) {
	                    horas = 0;
	                }
	        }
	 	}
	        
	 	System.out.printf("Hora después de un segundo: %02d:%02d:%02d\n", horas, min, seg);
	        
	        
	 	//10-Programa que lee 10 números no nulos y luego muestre un mensaje de si ha leído algún número negativo o no.  
	 	System.out.println("Actividad 10");
	 	
	 	boolean hayNeg = false;
	 	
	 	System.out.println("Introduce 10 numeros no nulos: ");
	        
	 	for (int i = 0; i < 10; i++) {
	        	
	 		int numero = scanner.nextInt();
	        	
	 		if (numero < 0 ) {
	        		
	 			hayNeg = true;	        		
	        	}
	        }
	       
	 	if(hayNeg) {
	        	
	 		System.out.println("Has ecrito por lo menos 1 numero negativo: " + hayNeg);
	 	} 
	        
	 	else {
	        	
	 		System.out.println("No has escrito ningun numero negativo ");
	        
	 	}
	        
	        	        
	 	//11-Programa que lea 10 números no nulos y luego muestre un mensaje indicando cuántos son positivos y cuantos negativos.
	 	System.out.println("Actividad 11");
	        
	 	int[] listaNum = new int[10];
	        
	 	int conPos = 0, conNeg = 0, conCeros = 0;
	       
	 	for (int i = 0; i <10; i++){
	        	
	 		System.out.println("Ingresa un Numero["+(i+1)+"]=");
	        	
	 		listaNum[i] = scanner.nextInt();
	        		        	
	 		if (listaNum [i] == 0) conCeros++;
	        		
	 		else if (listaNum[i] > 0) conPos++;	
	        		
	 		else conNeg++;
	 	}
	        
	 	System.out.println("Has escrito " + conNeg + " numeros negativos");	        			        	
	 	System.out.println("Has escrito " + conPos + " numeros positivos");	            
	 	System.out.println("Has escrito " + conCeros + " numeros que sean 0");
		
	 	//12-Programa que lee números hasta que se introduce un 0 y muestra si ha leído algún negativo, cuántos positivos y cuántos negativos.
	 	System.out.println("Actividad 12");
	       
	 	int positiv = 0;
	        
	 	int negativ = 0;
	        
	 	boolean hayNegativo = false;
	        
	 	int numero;
	        
	 	System.out.println("Introduce una secuencia de números no nulos (Utiliza el 0 para terminar):");
	        
	 	do {
	 		
	 		numero = scanner.nextInt();
	            if (numero > 0) {
	            	
	                positiv++;
	            } 
	            
	            else if (numero < 0) {	                
	            	
	            	negativ++;
	                	            	
	            	hayNegativo = true;
	            }
	            
	 	} 
	 	
	 	while (numero != 0);

	 	if (hayNegativo) {
	            
	 		System.out.println("Has escrito un número negativo.");	        
	 	} 
	 	
	 	else {
	            
	 		System.out.println("No has escrito ningún número negativo.");	        
	 	}
	        
	 	System.out.println("Números positivos escritos: " + positiv);	        
	 	System.out.println("Números negativos escritos: " + negativ);

	        
	 	//13-Programa que calcula la suma y el producto de los 10 primeros números naturales.
	 	System.out.println("Actividad 13");
	        
	 	int suma = 0;
	        
	 	int produc= 1;
	        
	 	for (int i = 1; i <= 10; i++) {
	            suma += i;
	            produc *= i;
	        }

	 	System.out.println("La suma de los 10 primeros números naturales es: " + suma);
	 	System.out.println("El producto de los 10 primeros números naturales es: " + produc);
	        
	        
	 	//14-Programa que calcula el salario neto semanal de un trabajador en función del número de horas trabajadas y la tasa de impuestos.
	 	System.out.println("Actividad 14");
	 	System.out.println("Introduce el Nombre del Trabajador: ");

	 	String nombre = scanner.nextLine();

	 	System.out.println("Introduce las horas trabajadas: ");
	 	
	 	double hTrabajadas = scanner.nextDouble();

	 	System.out.println("Introduce la tarifa por hora: ");
	        
	 	double tarifaHora = scanner.nextDouble();
	        
	 	double salarioBruto;
	        
	 	if (hTrabajadas > 35) {
	            
	 		salarioBruto = 35 * tarifaHora + (hTrabajadas - 35) * tarifaHora * 1.5;
	 	} 

	 	else {
	            
	 		salarioBruto = hTrabajadas * tarifaHora;
	 	}

	 	double impuestos;
	        
	 	if (salarioBruto <= 500) {
	            
	 		impuestos = 0;	        
	 	} 
	        
	 	else if (salarioBruto <= 900) {
	            
	 		impuestos = (salarioBruto - 500) * 0.25;	        
	 	} 
	        
	 	else {
	            
	        	impuestos = (400 * 0.25) + (salarioBruto - 900) * 0.45;
	 	}
	        
	 	double salarioNeto = salarioBruto - impuestos;

	 	System.out.println("Nombre del Trabajador: " + nombre);	        
	 	System.out.println("Salario bruto: " + salarioBruto);	        
	 	System.out.println("Tasas de impuestos: " + impuestos);	        
	 	System.out.println("Salario neto: " + salarioNeto);

	       
	        
	 	scanner.close(); 
	        



		}

	}