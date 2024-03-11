package examen;

public class PartidaDeCanicas {

	public static void main(String[] args) {

		final int gua1 = 70;
		final int gua2 = 80;
		int posJ1;
		int posJ2;
		String estadoJ1 = "Inicial";
		String estadoJ2 = "Inicial";
		boolean turno;
		boolean ganador = false;
		int contador = 0;
		posJ1 = posicionInicial();
		posJ2 = posicionInicial();
		turno = quienEmpieza();
		System.out.println(posicionInicial());
		System.out.println(lanzaminetoCanica());
		if (turno == true) {
			System.out.println("Comienza la partida: le toca al jugador 1");

		} else {
			System.out.println("Comienza la partida: le toca al jugador 2");

		}
		System.out.println("Posision inicial de las canicas en el eje x Jugador1: " + posJ1 + " y Jugador2: " + posJ2);
		while (ganador == false) {

			if (turno == true) {
				System.out.println("Lanza el jugador 1");
				int lanzamiento = lanzaminetoCanica();
				System.out.println("Numero aleatorio del lanzamiento: " + lanzamiento);
				if (estadoJ2 == "Tute") {
					posJ1 = posJ1 + lanzamiento;
				} else if (posJ1 > posJ2 && estadoJ1 != "Tute") {
					posJ1 = posJ1 - lanzamiento;
				} else {
					posJ1 = posJ1 + lanzamiento;
				}
				posJ1 = rebota(posJ1);
				boolean alcanza = alcanza(posJ1, posJ2, lanzamiento, estadoJ1);
				estadoJ1 = estado(alcanza, estadoJ1, posJ1, posJ2, posJ1);
				System.out.println("Posicion actual de las canicas en el eje x, Jugador1: " + posJ1 + " Estado: "
						+ estadoJ1 + " y Jugador2: " + posJ2 + " Estado: " + estadoJ2);
				contador++;
				if (alcanza == true) {

				} else {
					turno = false;
				}
				ganador = ganador(estadoJ1, posJ2);
				if (ganador == true && posJ2 < 70) {
					System.out.println("Ha ganado el jugador 1 ¡Enhorabuena!");
				} else if (ganador == true && posJ2 > 69) {
					System.out.println("La partida ha quedado en tablas.");
				}

			} else {
				System.out.println("Lanza el jugador 2");
				int lanzamiento = lanzaminetoCanica();
				System.out.println("Numero aleatorio del lanzamiento: " + lanzamiento);
				if (estadoJ1 == "Tute") {
					posJ2 = posJ2 + lanzamiento;
				} else if (posJ2 > posJ1 && estadoJ2 != "Tute") {
					posJ2 = posJ2 - lanzamiento;
				} else {
					posJ2 = posJ2 + lanzamiento;
				}
				posJ2 = rebota(posJ2);
				boolean alcanza = alcanza(posJ1, posJ2, lanzamiento, estadoJ2);
				estadoJ2 = estado(alcanza, estadoJ2, posJ1, posJ2, posJ2);
				System.out.println("Posicion actual de las canicas en el eje x, Jugador1: " + posJ1 + " Estado: "
						+ estadoJ1 + " y Jugador2: " + posJ2 + " Estado: " + estadoJ2);
				contador++;
				if (alcanza == true) {

				} else {
					turno = true;
				}
				ganador = ganador(estadoJ2, posJ1);
				if (ganador == true && posJ1 < 70) {
					System.out.println("Ha ganado el jugador 2 ¡Enhorabuena!");
				} else if (ganador == true && posJ1 > 69) {
					System.out.println("La partida ha quedado en tablas.");
				}

			}
		}
	}

	public static boolean quienEmpieza() {
		double tirar = Math.random() * 2;
		int turno = (int) tirar;
		if (turno == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int posicionInicial() {
		double posicionInicial = Math.random() * 70;
		return (int) posicionInicial;
	}

	public static int lanzaminetoCanica() {
		int[] tirada = { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
		double tirar = Math.random() * 21;
		int resultado = tirada[(int) tirar];
		return resultado;
	}

	public static boolean alcanza(int posJ1, int posJ2, int lanzamiento, String estado) {
		if (posJ1 > posJ2) {
			int resta = posJ1 - posJ2;
			if (estado == "Chiva" && resta > 25) {
				return true;
			} else if (resta <= lanzamiento ) {
				return true;
			} else {
				return false;
			}
		} else {
			int resta = posJ2 - posJ1;
			if (estado == "Chiva" && resta > 25) {
				return true;
			} else if (resta <= lanzamiento) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static int rebota(int posicion) {
		if (posicion > 80) {
			int res = posicion - 80;
			return 80 - res;
		} else if (posicion < 0) {
			int res = posicion * (-1);
			return res;
		} else {
			return posicion;
		}
	}

	public static String estado(boolean alcanza, String estado, int posJ1, int posJ2, int pos) {
		if (estado == "Inicial" && alcanza == true) {
			return "Chiva";
		} else if (estado == "Chiva" && alcanza == true && ((posJ1 - posJ2) >= 25 || (posJ1 - posJ2) <= (-25))) {
			return "Pie";
		} else if (estado == "Pie" && alcanza == true) {
			return "Tute";
		} else if (estado == "Tute" && (pos <= 80 && pos >= 70)) {
			return "Gua";
		} else {
			return estado;
		}
	}

	public static boolean ganador(String pos, int pos2) {
		if (pos == "Gua" && pos2 < 70) {
			return true;
		} else if (pos == "Gua" && pos2 > 69) {
			System.out.println(
					"El otro jugador ha alcanzado la posicion de gua antes que el otro consiguiera llegar se anula la partida.");
			return true;
		} else {
			return false;
		}
	}
}
