import java.util.Scanner;

public class Ejercicio2 {
	// Escribe un programa que calcule el factorial de un número
	// entero positivo.

	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("¿De que numero quieres calcular el factorial?");
			int numero = reader.nextInt();
			int resultado = 1;

			for (int i = 1; i <= numero; i++) {
				resultado = resultado * i;
			}

			System.out.println("El resultado es: " + resultado);
		} catch (Exception e) {
			System.out.println("No has introducido un numero.");
		}

	}

}
