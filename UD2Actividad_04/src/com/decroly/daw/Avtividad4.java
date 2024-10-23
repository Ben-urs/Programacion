package com.decroly.daw;

import java.util.Scanner;

public class Avtividad4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1
		
        double[] numeros = new double[10];

        System.out.println("Introduce 10 números reales:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }

        System.out.println("Los números introducidos son:");
        for (double numero : numeros) {
            System.out.println(numero);
        }

        	//2
        
        double[] numeros1 = new double[10];
        double suma = 0;

        System.out.println("Introduce 10 números reales:");

        for (int i = 0; i < 10; i++) {
            numeros1[i] = sc.nextDouble();
            suma += numeros1[i];
        }

        	//3
        
        System.out.println("La suma de los números es: " + suma);
        
        double[] numeros2 = new double[10];

        System.out.println("Introduce 10 números reales:");

        for (int i = 0; i < 10; i++) {
            numeros2[i] = sc.nextDouble();
        }

        double max = numeros2[0];
        double min = numeros2[0];

        for (double numero : numeros2) {
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
        }

        System.out.println("El máximo es: " + max);
        System.out.println("El mínimo es: " + min);
        
        
        //4
        
        int[] numeros3 = new int[20];
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        System.out.println("Introduce 20 números enteros:");

        for (int i = 0; i < 20; i++) {
            numeros3[i] = sc.nextInt();
            if (numeros3[i] >= 0) {
                sumaPositivos += numeros3[i];
            } else {
                sumaNegativos += numeros3[i];
            }
        }

        System.out.println("La suma de los números positivos es: " + sumaPositivos);
        System.out.println("La suma de los números negativos es: " + sumaNegativos);
        
        
        //5
        
        double[] numeros4 = new double[20];
        double suma1 = 0;

        System.out.println("Introduce 20 números reales:");

        for (int i = 0; i < 20; i++) {
            numeros4[i] = sc.nextDouble();
            suma1 += numeros4[i];
        }

        double media = suma1 / 20;
        System.out.println("La media es: " + media);
        
        //6
        
        System.out.print("Introduce el tamaño del array N: ");
        int N = sc.nextInt();

        System.out.print("Introduce el valor M: ");
        int M = sc.nextInt();

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = M;
        }

        System.out.println("El array resultante es:");
        for (int valor : array) {
            System.out.println(valor);
        }
        
        //7
        
        System.out.print("Introduce el valor P: ");
        int P = sc.nextInt();

        System.out.print("Introduce el valor Q: ");
        int Q = sc.nextInt();

        int tamaño = Q - P + 1;
        int[] array1 = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            array1[i] = P + i;
        }

        System.out.println("El array resultante es:");
        for (int valor : array1) {
            System.out.println(valor);
        }
        
        //8
        
        double[] numeros5 = new double[100];
        int contador = 0;

        for (int i = 0; i < 100; i++) {
            numeros5[i] = Math.random();
        }

        System.out.print("Introduce un valor R: ");
        double R = sc.nextDouble();

        for (double numero : numeros5) {
            if (numero >= R) {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " números mayores o iguales a " + R);
        
        scanner.close(); 
	}
	

}
