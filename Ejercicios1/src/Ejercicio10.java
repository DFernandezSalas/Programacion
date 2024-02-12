import java.util.Scanner;

public class Ejercicio10 {
	//Calculo de la potencia de un numero
	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("¿De que numero queires calcular la potencia?");
			int numero = reader.nextInt();
			System.out.println("¿A que potencia los quieres elevar?");
			int numero2 = reader.nextInt();
			int resultado = numero;
			for (int i = 0;i<numero2 - 1;i++) {
				
				resultado = resultado * numero;
				
			}
			
			System.out.println("El resultado es: " + resultado);
			

		} catch (Exception e) {
			System.out.println("No has introducido un numero.");
		}

	}

}
