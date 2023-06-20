package tareaCirculo;

import java.util.Scanner;

public class calculoCirculo {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Ingrese el radio del circulo: ");
			Double radio = scanner.nextDouble();
			
			double area = Math.PI * Math.pow(radio, 2);
			System.out.println("El area del circulo es: " + area);
			
	}

}
