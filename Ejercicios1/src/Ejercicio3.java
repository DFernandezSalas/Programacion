import java.util.Scanner;

public class Ejercicio3 {
	// Escribe un programa que determine si un número dado es
	// primo.
	public static void main(String[] args) {

		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("¿Que numero quieres comprobar si es primo?");
			int numero = reader.nextInt();
			int contador = 0;

			for (int i = 1; i <= numero; i++) {
				if (numero % i == 0) {
					contador++;
				}
			}
			
			if(contador==2) {
				System.out.println("Es un numero primo.");
			} else {
				System.out.println("No es un numero primo.");
			}

		} catch (Exception e) {
			System.out.println("No has introducido un numero.");
		}

	}

}
