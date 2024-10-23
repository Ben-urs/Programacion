package com.secroly.daw;

import java.util.Scanner;

public class Ejercicio1 {


	//1-Programa que pida una cadena de texto y muestra cada palabra de un texto separadas en diferentes lineas
	public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Introduce un de texto:");
	        String texto = scanner.nextLine();	

	        String[] palab1 = texto.split(" ");
	        
	        for (String palab2 : palab1) {
	        	
	            System.out.println(palab2);
	        }

			scanner.close();
	    }
	}


