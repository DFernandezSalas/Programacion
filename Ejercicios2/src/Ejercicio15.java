import java.util.Scanner;

public class Ejercicio15 {
	// Juego de Piedra, Papel o Tijeras
	public static void main(String[] args) {
		boolean salir = false;
		boolean juego = false;
		int jPuntuacion = 0;
		int jPuntuacionSet = 0;
		int cpuPuntuacion = 0;
		int cpuPuntuacionSet = 0;
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
						System.out.println("MARCADOR (PUNTOS/SETS)\nJugador = " + jPuntuacion + "/" + jPuntuacionSet
								+ "\t CPU = " + cpuPuntuacion + "/" + cpuPuntuacionSet);
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
							cpuPuntuacion++;
						} else if (cpu == 2) {
							System.out.println("===========JUGADOR GANA=============");
							System.out.println("Jugador-> Piedra vs Tijera <-CPU");
							jPuntuacion++;
						}
						comprobar(jPuntuacion, cpuPuntuacion, jPuntuacionSet, cpuPuntuacionSet);
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
							jPuntuacion++;
						} else if (cpu == 2) {
							System.out.println("===========CPU GANA=============");
							System.out.println("Jugador-> Papel vs Tijera <-CPU");
							cpuPuntuacion++;
						}
						comprobar(jPuntuacion, cpuPuntuacion, jPuntuacionSet, cpuPuntuacionSet);
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
							cpuPuntuacion++;
						} else if (cpu == 1) {
							System.out.println("=========JUGADOR GANA===========");
							System.out.println("Jugador-> Tijera vs Papel <-CPU");
							jPuntuacion++;
						}
						comprobar(jPuntuacion, cpuPuntuacion, jPuntuacionSet, cpuPuntuacionSet);
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

	public static int comprobar(int jPuntuacion, int cpuPuntuacion, int jPuntuacionSet, int cpuPuntuacionSet) {
		if (jPuntuacion == 5) {
			System.out.println("SET para el JUGADOR");
			jPuntuacion = 0;
			cpuPuntuacion = 0;
			jPuntuacionSet++;
			if (jPuntuacionSet == 3) {
				System.out.println("JUGADOR GANA el PARTIDO");
				cpuPuntuacionSet = 0;
				jPuntuacionSet = 0;
			}
		}
		if (cpuPuntuacion == 5) {
			System.out.println("SET para la CPU");
			jPuntuacion = 0;
			cpuPuntuacion = 0;
			cpuPuntuacionSet++;
			if (cpuPuntuacionSet == 3) {
				System.out.println("CPU GANA el PARTIDO");
				cpuPuntuacionSet = 0;
				jPuntuacionSet = 0;
			}
		}
		return new comprobar(jPuntuacion, cpuPuntuacion, jPuntuacionSet, cpuPuntuacionSet);
	}
}
