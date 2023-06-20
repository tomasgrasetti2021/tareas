package imprimaNombre;

import java.util.Scanner;

public class tareaDia12 {
	
		private String nombre;
		private int edad;
		
		public static void main(String[] args) {
		
		tareaDia12 objeto = new tareaDia12();
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Ingrese su nombre: ");
		String inputName = scanner.nextLine();
		
		System.out.println("Ingrese edad: ");
		int inputAge = scanner.nextInt();
		
		objeto.nombre = inputName;
		objeto.edad = inputAge;
		
		System.out.println("tu nombre es: " + inputName);
		System.out.println("tu edad es: " + inputAge);
		
	}
}
