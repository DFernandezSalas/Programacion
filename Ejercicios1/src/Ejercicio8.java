import java.util.Scanner;

public class Ejercicio8 {
	// Escribe un programa que genere los primeros N números
	// primos.
	public static void main(String[] args) {

		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("¿Cuantos primeros numeros primos quieres ver?");
			int numero = reader.nextInt();
			int contador = 0;
			int contador2 = 0;
			int contador3 = 2;
			String resultado = "";

			while (contador2 < numero) {

				for (int i = 1; i <= contador3; i++) {

					if (contador3 % i == 0) {
						contador++;
					}
				}
				if (contador == 2) {
					resultado += contador3 + ", ";
					contador2++;
				}
				contador = 0;

				contador3++;
			}
			System.out.println("Los primeros " + numero + " numeros son: " + resultado + ".");

		} catch (Exception e) {
			System.out.println("No has introducido un numero.");
		}

	}

}
