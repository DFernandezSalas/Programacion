package examen;

public class PartidaDeCanicas {

	public static void main(String[] args) {
		final int gua1 = 70;
		final int gua2 = 80;
		int posJ1;
		int posJ2;
		String estadoJ1;
		String estadoJ2;
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
		while (contador != 3) {
			
			if (turno == true) {
				System.out.println("Lanza el jugador 1");
				int lanzamiento = lanzaminetoCanica();
				System.out.println("Numero aleatorio del lanzamiento: " + lanzamiento);
				if (posJ1 > posJ2) {
					posJ1 = posJ1 - lanzamiento;
				} else {
					posJ1 = posJ1 + lanzamiento;
				}
				posJ1 = rebota(posJ1);
				boolean alcanza = alcanza(posJ1, posJ2, lanzamiento);
				System.out.println(posJ1);
				System.out.println(posJ2);
				System.out.println(lanzamiento);
				System.out.println(alcanza);
				System.out.println("Posicion actual de las canicas en el eje x, Jugador1: " + posJ1 + " y Jugador2: " + posJ2);
				contador++;

			} else {
				System.out.println("Lanza el jugador 2");
				int lanzamiento = lanzaminetoCanica();
				System.out.println("Numero aleatorio del lanzamiento: " + lanzamiento);
				if (posJ2 > posJ1) {
					posJ2 = posJ2 - lanzamiento;
				} else {
					posJ2 = posJ2 + lanzamiento;
				}
				posJ2 = posJ2 + lanzamiento;
				posJ2 = rebota(posJ2);
				boolean alcanza = alcanza(posJ1, posJ2, lanzamiento);
				System.out.println(posJ1);
				System.out.println(posJ2);
				System.out.println(lanzamiento);
				System.out.println(alcanza);
				System.out.println("Posicion actual de las canicas en el eje x, Jugador1: " + posJ1 + " y Jugador2: " + posJ2);
				contador++;
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

	public static boolean alcanza(int posJ1, int posJ2, int lanzamiento) {
		if (posJ1 > posJ2) {
			int resta = posJ1 - posJ2;
			if (resta <= lanzamiento) {
				return true;
			} else {
				return false;
			}
		} else {
			int resta = posJ2 - posJ1;
			if (resta <= lanzamiento) {
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
}
