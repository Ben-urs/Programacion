package com.secroly.daw;

import java.util.Scanner;

public class Ejercicio5 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce una frase:");
        
        String frase = scanner.nextLine().replace(" ", "").toLowerCase();
        
        StringBuilder fraseReversa = new StringBuilder(frase).reverse();
        
        if (frase.equals(fraseReversa.toString())) {
        	
            System.out.println("La frase es un palíndromo.");
            
        } 
        
        else {
        	
            System.out.println("La frase no es un palíndromo.");
        }
    }
}
