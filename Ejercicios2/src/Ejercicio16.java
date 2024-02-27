import java.util.Scanner;

public class Ejercicio16 {
	//Generador de Secuencias de Fibonacci
	public static void main(String[] args) {
		
		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("¿Cuantos numero de la secuencia Fibonacci quieres ver por pantalla?");
			int numero = reader.nextInt();
			int siguienteNumero = 0;
			int[] suma = new int[numero];
			suma[0] = 0;
			suma[1] = 1;

			for (int i = 0; i < numero - 2; i++) {

				siguienteNumero = suma[i] + suma[i + 1];
				suma[i + 2] = siguienteNumero;
			}

			String resultado = "";
			for (int j = 0; j < suma.length; j++) {

				resultado += suma[j] + ", ";

			}

			System.out.println("Los " + numero + " primeros numeros de la secuencia Fibonacci son: " + resultado);
		} catch (Exception e) {
			System.out.println("No has introducido un numero.");
		}


	}

}
