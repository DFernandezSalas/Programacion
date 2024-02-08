import java.util.Scanner;

public class Ejercicio5 {
	// Escribe un programa que genere los primeros N números de la
	// secuencia Fibonacci.
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("¿Cuantos numero de la secuencia Fibonacci quieres ver por pantalla?");
		int numero = reader.nextInt();
		int siguienteNumero = 0;
		int[] suma = new int[numero];
		suma[0] = 0;
		suma[1] = 1;

		for (int i = 0; i <= numero; i++) {

			siguienteNumero = suma[i] + suma[i + 1];
			suma[i + 2] = siguienteNumero;
		}

		String[] array = new String[suma.length];
		for (int j = 0; j < array.length; j++) {

			array[j] = String.valueOf(suma[j]);

		}

		String resultado = String.valueOf(array);// array.toString();
		System.out.println("Los " + numero + " primeros numeros de la secuencia Fibonacci son: " + resultado);

	}

}
