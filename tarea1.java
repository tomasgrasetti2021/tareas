package tarea1día12;

import java.util.Scanner;

public class tarea1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese numero: ");
		int valor1 = scanner.nextInt();
	
		System.out.println("Ingrese numero 2: ");
		int valor2 = scanner.nextInt();
		
		System.out.println("Ingrese numero 3: ");
		int valor3 = scanner.nextInt();
		
		int mayor = Math.max(valor1, Math.max(valor2, valor3));
		int menor = Math.min(valor1, Math.min(valor2, valor3));
		
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El numero menor es: " + menor);
		
	}
}
