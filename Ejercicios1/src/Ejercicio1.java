import java.util.Scanner;

public class Ejercicio1 {
	// Escribe un programa que solicite al usuario un número N y sume los números
	// pares de 0 a N
	public static void main(String[] args) {

		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("¿Hasta que numero quieres sumar?");
			int numero = reader.nextInt();
			int resultado = 0;

			for (int i = 0; i <= numero; i++) {
				resultado += i;
			} 

			System.out.println("El resultado es: " + resultado);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No has introducido un numero.");
		}
	}

}
