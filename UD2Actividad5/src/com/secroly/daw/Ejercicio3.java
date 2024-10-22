package com.secroly.daw;

import java.util.Scanner;

public class Ejercicio3 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el nombre:");
        
        String nombre = scanner.nextLine();
        
        System.out.println("Introduce el primer apellido:");
        
        String apellido1 = scanner.nextLine();
        
        System.out.println("Introduce el segundo apellido:");
        
        String apellido2 = scanner.nextLine();
        
        String codigoUsuario = nombre.substring(0, 3).toUpperCase() +
                               apellido1.substring(0, 3).toUpperCase() +
                               apellido2.substring(0, 3).toUpperCase();
        
        System.out.println("Código de usuario: " + codigoUsuario);
    }
}
