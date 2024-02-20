//import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
	// ordenamiento de numeros
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("¿cuantos numeros quieres ordenar?");
		int numeros = reader.nextInt();
		int[] array = new int[numeros];
		boolean swap = true;
		
		for (int i = 0; i < array.length; i++) {
			int numero = reader.nextInt();
			array[i] = numero;
			}

		while (swap) {
			swap = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int aux = array[i];
					array[i] = array[i + 1];
					array[i + 1] = aux;
					swap = true;
				}
			}
		}
		
//		Arrays.sort(array);
//	
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		reader.close();
	}

}
