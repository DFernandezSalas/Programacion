import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Ejercicio11 {
	// Simulador de Ruleta, reglas en
	// https://www.casino.es/ruleta/como-jugar-ruleta/
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("¿Como quieres realizar tu apuesta?");
		int apuesta = -1;
		int multiplicador;
		System.out.println(" 1. Pleno");
		System.out.println(" 2. Rojo/Negro");
		System.out.println(" 3. Par/Impar ");
		System.out.println(" 4. Pasa/Falta");
		System.out.println(" 5. Docena");
		System.out.println(" 6. Columna");
		System.out.println(" 7. Dos docenas");
		System.out.println(" 8. Dos columnas");
		System.out.println(" 9. Seisena");
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
			multiplicador = 2;
			do {
				System.out.println("1. Rojo");
				System.out.println("2. Negro");
				System.out.print("Respuesta: ");
				respuesta = reader.nextInt();
			} while (respuesta < 1 || respuesta > 2);
			switch (respuesta) {
			case 1:
				int[] rojo = { 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36 };
				apuesta(rojo, multiplicador);
				break;
			case 2:
				int[] negro = { 2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35 };
				apuesta(negro, multiplicador);
				break;
			default:
			}
			break;
		case 3:
			do {
				multiplicador = 2;
				System.out.println("1. Par");
				System.out.println("2. Impar");
				System.out.print("Respuesta: ");
				respuesta = reader.nextInt();
			} while (respuesta < 1 || respuesta > 2);
			switch (respuesta) {
			case 1:
				int[] par = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36 };
				apuesta(par, multiplicador);
				break;
			case 2:
				int[] impar = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35 };
				apuesta(impar, multiplicador);
				break;
			default:
			}
			break;
		case 4:
			do {
				multiplicador = 2;
				System.out.println("1. Pasa");
				System.out.println("2. Falta");
				System.out.print("Respuesta: ");
				respuesta = reader.nextInt();
			} while (respuesta < 1 || respuesta > 2);
			switch (respuesta) {
			case 1:
				int[] pasa = {19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
				apuesta(pasa, multiplicador);
				break;
			case 2:
				int[] falta = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
				apuesta(falta, multiplicador);
				break;
			default:
			}
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
			System.out.println("Has perdido");
		}
	}

	public static void apuesta(int[] apuesta, int multiplicador) {
		int numeroganador = ganador();
		boolean win = false;
		for (int i = 0; i < apuesta.length; i++) {
			if (numeroganador == apuesta[i]) {
				System.out.println("Has ganado" + numeroganador);
				win = true;
			}

		}
		if (win == false) {
			System.out.println("Has perdido" + numeroganador);
		}

	}

}
