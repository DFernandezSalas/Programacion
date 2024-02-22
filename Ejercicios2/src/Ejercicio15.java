import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Ejercicio15 {
	// Juego de Piedra, Papel o Tijeras
	public static void main(String[] args) {
		boolean salir = false;
		boolean juego = false;
		int jPuntuacion = 0;
		int cpuPuntuacion = 0;
		Scanner reader = new Scanner(System.in);
		int respuesta = 0;
		int seleccion = 0;
		int jugador;
		int cpu;
		while (salir == false) {
			do {
				System.out.print("1.Jugar \n2.Salir \nRespuesta: ");
				respuesta = reader.nextInt();
			} while (respuesta < 1 || respuesta > 2);
			switch (respuesta) {
			case 1: {
				limpiar();
				while (juego == false) {
					do {
						System.out.println("Marcador\nJugador = " + jPuntuacion + "\t CPU = " + cpuPuntuacion);
						System.out.print("1.Piedra \n2.Papel \n3.Tijera \nRespuesta: ");
						seleccion = reader.nextInt();
					} while (seleccion < 1 || seleccion > 3);
					switch (seleccion) {
					case 1: {
						jugador = 0;
						cpu = cpu();
						if (jugador == cpu) {
							
						}
						break;
					}
					case 2: {
						jugador = 1;
						cpu = cpu();
						break;
					}
					case 3:
						jugador = 2;
						cpu = cpu();
						break;
					}
				}
				break;
			}
			case 2: {
				salir = true;
				break;
			}

			}
		}

		reader.close();
	}

	public static void limpiar() {
		for (int i = 0; i < 15; i++) {
			System.out.println();
		}
	}

	public static int cpu() {
		double result = Math.random() * 3;
		int jugada = (int) result;
		return jugada;
	}

}
