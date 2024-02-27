import java.util.Scanner;

public class Ejercicio15 {
	// Juego de Piedra, Papel o Tijeras
	public static void main(String[] args) {
		boolean salir = false;
		int[] score = {0, 0, 0, 0, 0}; // score[0]jPuntuacion, scrore[1]jPuntuacionSet, score[2]cpuPuntuacion, score[3]cpuPuntuacionSet, score[4]acabaElJuego
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
				while (score[4] == 0) {
					do {
						System.out.println("MARCADOR (PUNTOS/SETS)\nJugador = " + score[0] + "/" + score[1]
								+ "\t CPU = " + score[2] + "/" + score[3]);
						System.out.print("1.Piedra \n2.Papel \n3.Tijera \nRespuesta: ");
						seleccion = reader.nextInt();
					} while (seleccion < 1 || seleccion > 3);
					switch (seleccion) {
					case 1: {
						limpiar();
						jugador = 0;
						cpu = cpu();
						if (jugador == cpu) {
							System.out.println("=============EMPATE=============");
							System.out.println("Jugador-> Piedra vs Piedra <-CPU");
						} else if (cpu == 1) {
							System.out.println("===========CPU GANA=============");
							System.out.println("Jugador-> Piedra vs Papel <-CPU");
							score[2]++;
						} else if (cpu == 2) {
							System.out.println("===========JUGADOR GANA=============");
							System.out.println("Jugador-> Piedra vs Tijera <-CPU");
							score[0]++;
						}
						comprobar(score);
						break;
					}
					case 2: {
						limpiar();
						jugador = 1;
						cpu = cpu();
						if (jugador == cpu) {
							System.out.println("=============EMPATE=============");
							System.out.println("Jugador-> Papel vs Papel <-CPU");
						} else if (cpu == 0) {
							System.out.println("=========JUGADOR GANA===========");
							System.out.println("Jugador-> Papel vs Piedra <-CPU");
							score[0]++;
						} else if (cpu == 2) {
							System.out.println("===========CPU GANA=============");
							System.out.println("Jugador-> Papel vs Tijera <-CPU");
							score[2]++;
						}
						comprobar(score);
						break;
					}
					case 3:
						limpiar();
						jugador = 2;
						cpu = cpu();
						if (jugador == cpu) {
							System.out.println("=============EMPATE=============");
							System.out.println("Jugador-> Tijera vs Tijera <-CPU");
						} else if (cpu == 0) {
							System.out.println("===========CPU GANA=============");
							System.out.println("Jugador-> Tijera vs Piedra <-CPU");
							score[2]++;
						} else if (cpu == 1) {
							System.out.println("=========JUGADOR GANA===========");
							System.out.println("Jugador-> Tijera vs Papel <-CPU");
							score[0]++;
						}
						comprobar(score);
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

	public static int[] comprobar(int[] score) {
		if (score[0] == 5) {
			System.out.println("SET para el JUGADOR");
			score[0] = 0;
			score[2] = 0;
			score[1]++;
			if (score[1] == 3) {
				System.out.println("JUGADOR GANA el PARTIDO");
				score[3] = 0;
				score[1] = 0;
				score[4] = 1;
			}
		}
		if (score[2] == 5) {
			System.out.println("SET para la CPU");
			score[0] = 0;
			score[2] = 0;
			score[3]++;
			if (score[3] == 3) {
				System.out.println("CPU GANA el PARTIDO");
				score[3] = 0;
				score[1] = 0;
				score[4] = 1;
			}
		}
		return score;
	}
}
