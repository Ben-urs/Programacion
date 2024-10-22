package com.secroly.daw;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Introduce una cadena de texto:");
	        
	        String texto = scanner.nextLine();
	        
	        String[] palabras = texto.split(" ");
	        
	        for (String palabra : palabras) {
	        	
	            System.out.println(palabra);
	        }
	    }
	}


