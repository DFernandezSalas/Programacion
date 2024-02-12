import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio9 {
	// Escribe un programa que solicite las calificaciones de los
	// estudiantes y calcule el promedio.
	public static void main(String[] args) {

		try (Scanner reader = new Scanner(System.in)) {
			 DecimalFormat df = new DecimalFormat("#.00");
			 
			System.out.println("¿Cuantas notas vas a introducir?");
			int numero = reader.nextInt();
			double[] notas = new double[numero];
			double media = 0;

			for (int i = 0; i < numero; i++) {
				System.out.print(i + 1 + ":");
				notas[i] = reader.nextDouble();
			}
			
			for (int i = 0;i<notas.length;i++) {
				media += notas[i];
			}
			media = media/numero;
			
			System.out.println("La media es: " + df.format(media));

		} catch (Exception e) {
			System.out.println("No has introducido un numero.");
		}

	}

}
