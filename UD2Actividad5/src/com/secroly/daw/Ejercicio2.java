package com.secroly.daw;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el primer texto:");
        
        String texto1 = scanner.nextLine();
        
        System.out.println("Introduce wl segundo texto:");
        
        String texto2 = scanner.nextLine();
        
        if (texto1.equals(texto2)) {
        	
            System.out.println("Los textos son iguales.");    
        } 
        
        else {
        	
            System.out.println("Los textos no son iguales.");
        }

        if (texto1.equalsIgnoreCase(texto2)) {
        	
            System.out.println("Los textos son iguales ignorando mayúsculas y minúsculas.");           
        } 
        
        else {
        	
            System.out.println("Los textos no son iguales ignorando mayúsculas y minúsculas.");
        }

        scanner.close();
    }
}
