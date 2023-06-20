import java.util.Scanner;
public class temperaturastarea {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese la temperatura: ");
		double celsius = scanner.nextDouble();
		
		double farenheit = (celsius * 9 / 5) + 32;
		System.out.println("La temperatura en grados Fahrenheit es: " + farenheit);
		
		double kelvin = celsius + 273.15;
		System.out.println("La temperatura Kelvin es: " + kelvin);
	
	}
}
