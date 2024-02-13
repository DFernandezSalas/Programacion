import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Ejercicio11 {
	// Simulador de Ruleta, reglas en
	// https://www.casino.es/ruleta/como-jugar-ruleta/
	public static void main(String[] args) {
		int[] rojo = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
		int[] negro = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};
		Scanner reader = new Scanner(System.in);
		System.out.println("¿Como quieres realizar tu apuesta?");
		int apuesta = -1;
		int multiplicador;
		System.out.println("1. Pleno");
		System.out.println("2. Rojo/Negro");
		System.out.println("3. Par/Impar ");
		System.out.println("4. Pasa/Falta");
		System.out.println("5. Docena");
		System.out.println("6. Columna");
		System.out.println("7. Dos docenas");
		System.out.println("8. Dos columnas");
		System.out.println("9. Seisena");
		System.out.println("10. Cuadro");
		System.out.println("11. Transversal");
		System.out.println("12. Caballo");
		System.out.print("Respuesta: ");
		int respuesta = reader.nextInt();

		switch (respuesta) {
		case 1:
			do {
				System.out.print("Escribe un numero del 0 al 36: ");
				apuesta = reader.nextInt();
			} while (apuesta <= 0 || apuesta >= 36);
			multiplicador = 36;
			apuesta(apuesta, multiplicador);
			break;
		case 2:
			System.out.println("1. Rojo");
			System.out.println("2. Negro");
			System.out.print("Respuesta: ");
			respuesta = reader.nextInt();
			switch (respuesta) {
			case 1:
				
				
				break;
			case 2:
				break;
			default:
			}
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		default:
		}
		System.out.println("Final");
	}
	
	public static int ganador() {
		double numeroGanador = Math.random() * 37;
        int numeroGanador2 = (int) numeroGanador;
        return numeroGanador2;
	}
	
	public static void apuesta(int apuesta, int multiplicador) {
		int numeroganador = ganador();
		if (apuesta == numeroganador) {
			System.out.println("Has ganado");
		} else {
			System.out.println("Has perido");
		}
	}
	
	public static void apuesta(int[] apuesta, int multiplicador) {
		int numeroganador = ganador();
		
	}

}
