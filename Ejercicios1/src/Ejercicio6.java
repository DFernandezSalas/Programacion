import java.util.Scanner;

public class Ejercicio6 {
	// Escribe un programa que cuente el número de vocales y
	// consonantes en una palabra.
	public static void main(String[] args) {

		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Escribe una palabra para contar su numero de vocales y consonantes.");
			String palabra = reader.next();
			int vocales = 0;
			int consonantes = 0;
			for (int i = 0; i < palabra.length(); i++) {
				if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u' ) {
					vocales++;
				} else {
					consonantes++;
				}
			}
			
			System.out.println("La palabra " + palabra + " tiene " + vocales + " vocales y " + consonantes + " consonantes." );

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
