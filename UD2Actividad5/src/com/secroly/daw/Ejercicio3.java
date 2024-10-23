package com.secroly.daw;

import java.util.Scanner;

public class Ejercicio3 {
	
    //3-Programa que pide por teclado tu nombre y tus 2 apellidos y crea un codigo de usuario conbinando las tres primeras letras de cada una.
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre:");      
        String nombre = scanner.nextLine();
        
        System.out.println("Introduce tu primer apellido:");      
        String apellido1 = scanner.nextLine();
        
        System.out.println("Introduce tu segundo apellido:");       
        String apellido2 = scanner.nextLine();
        
        String codigoUsuario = nombre.substring(0, 3).toUpperCase() +
                               apellido1.substring(0, 3).toUpperCase() +
                               apellido2.substring(0, 3).toUpperCase();
        
        System.out.println("El codigo del usuario es: " + codigoUsuario);

        scanner.close();
    }
}
