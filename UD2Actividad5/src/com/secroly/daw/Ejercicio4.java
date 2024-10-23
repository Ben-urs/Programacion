package com.secroly.daw;

import java.util.Scanner;

public class Ejercicio4 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce una frase:");
        
        String frase = scanner.nextLine().toLowerCase();
        
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
        
        for (char c : frase.toCharArray()) {
        	
            switch (c) {
                case 'a': countA++; break;
                case 'e': countE++; break;
                case 'i': countI++; break;
                case 'o': countO++; break;
                case 'u': countU++; break;
            }
        }
        
        System.out.println("Nº de A's: " + countA);
        System.out.println("Nº de E's: " + countE);
        System.out.println("Nº de I's: " + countI);
        System.out.println("Nº de O's: " + countO);
        System.out.println("Nº de U's: " + countU);
    }
}

