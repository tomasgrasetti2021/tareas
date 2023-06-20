package calculoRectangulo;

import java.util.Scanner;

public class rectangulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Base del rectangulo: " );
		double base = scanner.nextDouble();
		
		System.out.print("Altura del rectangulo: ");
		double altura = scanner.nextDouble();
		
		double area = base * altura;
		System.out.println("El area del rectangulo es: " + area);
	}
}
