import java.util.Scanner;

public class Ejercicio19 {
	// Contador de Palabras en un Texto
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa una frase: ");
		String frase = scanner.nextLine();

		int contadorPalabras = contarPalabras(frase);

		System.out.println("Número de palabras en la frase: " + contadorPalabras);

		scanner.close();
	}

	public static int contarPalabras(String frase) {
		if (frase == "") {
			return 0;
		}

		String[] palabras = frase.split(" ");
		return palabras.length;
	}

}
