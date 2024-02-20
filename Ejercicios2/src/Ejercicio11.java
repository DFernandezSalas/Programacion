import java.util.Scanner;

public class Ejercicio11 {
	// Simulador de Ruleta, reglas en
	// https://www.casino.es/ruleta/como-jugar-ruleta/
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		boolean salir = false;
		boolean salir2 = false;
		boolean fichasSuficientes = false;
		double ficha = 10;
		double jugada = 0;

		do {
			double multiplicador = 0;
			int apuesta = 0;

			do {
				System.out.println("Tienes " + ficha + " fichas.");
				System.out.println("¿Cuantas fichas quieres apostar?");
				jugada = reader.nextDouble();
				if (jugada <= ficha) {
					fichasSuficientes = true;
				} else {
					System.out.println("No tienes fichas suficientes.");
				}
			} while (fichasSuficientes == false);
			System.out.println("¿Como quieres realizar tu apuesta?");
			System.out.println(" 0.Cobrar");
			System.out.println(" 1.Pleno");
			System.out.println(" 2.Rojo/Negro");
			System.out.println(" 3.Par/Impar ");
			System.out.println(" 4.Pasa/Falta");
			System.out.println(" 5.Docena");
			System.out.println(" 6.Columna");
			System.out.println(" 7.Dos docenas");
			System.out.println(" 8.Dos columnas");
			System.out.println(" 9.Seisena");
			System.out.println("10.Cuadro");
			System.out.println("11.Transversal");
			System.out.println("12.Caballo");
			System.out.print("Respuesta: ");
			int respuesta = reader.nextInt();

			switch (respuesta) {
			case 1:
				do {
					System.out.print("Escribe un numero del 0 al 36: ");
					apuesta = reader.nextInt();
				} while (apuesta < 0 || apuesta > 36);
				multiplicador = 36;
				multiplicador = apuesta(apuesta, multiplicador);
				break;
			case 2:
				multiplicador = 2;
				do {
					System.out.println("1.Rojo");
					System.out.println("2.Negro");
					System.out.print("Respuesta: ");
					respuesta = reader.nextInt();
				} while (respuesta < 1 || respuesta > 2);
				switch (respuesta) {
				case 1:
					int[] rojo = { 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36 };
					multiplicador = apuesta(rojo, multiplicador);
					break;
				case 2:
					int[] negro = { 2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35 };
					multiplicador = apuesta(negro, multiplicador);
					break;
				default:
				}
				break;
			case 3:
				do {
					multiplicador = 2;
					System.out.println("1.Par");
					System.out.println("2.Impar");
					System.out.print("Respuesta: ");
					respuesta = reader.nextInt();
				} while (respuesta < 1 || respuesta > 2);
				switch (respuesta) {
				case 1:
					int[] par = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36 };
					multiplicador = apuesta(par, multiplicador);
					break;
				case 2:
					int[] impar = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35 };
					multiplicador = apuesta(impar, multiplicador);
					break;
				default:
				}
				break;
			case 4:
				do {
					multiplicador = 2;
					System.out.println("1.Pasa");
					System.out.println("2.Falta");
					System.out.print("Respuesta: ");
					respuesta = reader.nextInt();
				} while (respuesta < 1 || respuesta > 2);
				switch (respuesta) {
				case 1:
					int[] pasa = { 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36 };
					multiplicador = apuesta(pasa, multiplicador);
					break;
				case 2:
					int[] falta = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
					multiplicador = apuesta(falta, multiplicador);
					break;
				default:
				}
				break;
			case 5:
				do {
					multiplicador = 3;
					System.out.println("1.Primera docena(1-12)");
					System.out.println("2.Segunda docena(13-24)");
					System.out.println("3.Tercera docena(25-36)");
					System.out.print("Respuesta: ");
					respuesta = reader.nextInt();
				} while (respuesta < 1 || respuesta > 3);
				switch (respuesta) {
				case 1:
					int[] primeraDocena = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
					multiplicador = apuesta(primeraDocena, multiplicador);
					break;
				case 2:
					int[] segundaDocena = { 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
					multiplicador = apuesta(segundaDocena, multiplicador);
					break;
				case 3:
					int[] terceraDocena = { 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36 };
					multiplicador = apuesta(terceraDocena, multiplicador);
					break;
				default:
				}
				break;
			case 6:
				do {
					multiplicador = 3;
					System.out.println("1.Primera columna(1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34)");
					System.out.println("2.Segunda columna(2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35)");
					System.out.println("3.Tercera columna(3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36)");
					System.out.print("Respuesta: ");
					respuesta = reader.nextInt();
				} while (respuesta < 1 || respuesta > 3);
				switch (respuesta) {
				case 1:
					int[] primeraColumna = { 1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34 };
					multiplicador = apuesta(primeraColumna, multiplicador);
					break;
				case 2:
					int[] segundaColumna = { 2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35 };
					multiplicador = apuesta(segundaColumna, multiplicador);
					break;
				case 3:
					int[] terceraColumna = { 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36 };
					multiplicador = apuesta(terceraColumna, multiplicador);
					break;
				default:
				}
				break;
			case 7:
				do {
					multiplicador = 1.5;
					System.out.println("1.Primeras 2 docenas (1-24)");
					System.out.println("2.Segundas 2 docenas (12-26)");
					System.out.print("Respuesta: ");
					respuesta = reader.nextInt();
				} while (respuesta < 1 || respuesta > 2);
				switch (respuesta) {
				case 1:
					int[] primeras2Docenas = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
							21, 22, 23, 24 };
					multiplicador = apuesta(primeras2Docenas, multiplicador);
					break;
				case 2:
					int[] segundas2Docenas = { 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
							31, 32, 33, 34, 35, 36 };
					multiplicador = apuesta(segundas2Docenas, multiplicador);
					break;
				default:
				}
				break;
			case 8:
				do {
					multiplicador = 1.5;
					System.out.println("1.Primeras 2 columnas (1-24)");
					System.out.println("2.Segundas 2 columnas (12-26)");
					System.out.print("Respuesta: ");
					respuesta = reader.nextInt();
				} while (respuesta < 1 || respuesta > 2);
				switch (respuesta) {
				case 1:
					int[] primeras2Columnas = { 1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 2, 5, 8, 11, 14, 17, 20,
							23, 26, 29, 32, 35 };
					multiplicador = apuesta(primeras2Columnas, multiplicador);
					break;
				case 2:
					int[] segundas2Columnas = { 2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35, 3, 6, 9, 12, 15, 18, 21,
							24, 27, 30, 33, 36 };
					multiplicador = apuesta(segundas2Columnas, multiplicador);
					break;
				default:
				}
				break;
			case 9:
				do {
					multiplicador = 6;
					System.out.print("1.Primera seisena (1-6)");
					System.out.print(" 2.Segunda seisena (4-9)");
					System.out.println(" 3.Tercera seisena (7-12)");
					System.out.print("4.Cuarta seisena (10-15)");
					System.out.print(" 5.Quinta seisena (13-18)");
					System.out.println(" 6.Sexta seisena (16-21)");
					System.out.print("7.Séptima seisena (19-24)");
					System.out.print(" 8.Octava seisena (22-27)");
					System.out.println(" 9.Novena seisena (25-30)");
					System.out.print("10.Décima seisena (28-33)");
					System.out.println(" 11.Undécima seisena (31-36)");
					System.out.print("Respuesta: ");
					respuesta = reader.nextInt();
				} while (respuesta < 1 || respuesta > 11);
				switch (respuesta) {
				case 1:
					int[] primeraSeisena = { 1, 2, 3, 4, 5, 6 };
					multiplicador = apuesta(primeraSeisena, multiplicador);
					break;
				case 2:
					int[] segundaSeisena = { 4, 5, 6, 7, 8, 9 };
					multiplicador = apuesta(segundaSeisena, multiplicador);
					break;
				case 3:
					int[] terceraSeisena = { 7, 8, 9, 10, 11, 12 };
					multiplicador = apuesta(terceraSeisena, multiplicador);
					break;
				case 4:
					int[] cuartaSeisena = { 10, 11, 12, 13, 14, 15 };
					multiplicador = apuesta(cuartaSeisena, multiplicador);
					break;
				case 5:
					int[] quintaSeisena = { 13, 14, 15, 16, 17, 18 };
					multiplicador = apuesta(quintaSeisena, multiplicador);
					break;
				case 6:
					int[] sextaSeisena = { 16, 17, 18, 19, 20, 21 };
					multiplicador = apuesta(sextaSeisena, multiplicador);
					break;
				case 7:
					int[] septimaSeisena = { 19, 20, 21, 22, 23, 24 };
					multiplicador = apuesta(septimaSeisena, multiplicador);
					break;
				case 8:
					int[] octavaSeisena = { 22, 23, 24, 25, 26, 27 };
					multiplicador = apuesta(octavaSeisena, multiplicador);
					break;
				case 9:
					int[] novenaSeisena = { 25, 26, 27, 28, 29, 30 };
					multiplicador = apuesta(novenaSeisena, multiplicador);
					break;
				case 10:
					int[] decimaSeisena = { 28, 29, 30, 31, 32, 33 };
					multiplicador = apuesta(decimaSeisena, multiplicador);
					break;
				case 11:
					int[] undecimaSeisena = { 31, 32, 33, 34, 35, 36 };
					multiplicador = apuesta(undecimaSeisena, multiplicador);
					break;
				}
				break;
			case 10:
				do {
					multiplicador = 9;

					System.out.print("1. Primer cuadro (1, 2, 4, 5)");
					System.out.print(" 2. Segundo cuadro (2, 3, 5, 6)");
					System.out.print(" 3. Tercer cuadro (4, 5, 7, 8)");
					System.out.print(" 4. Cuarto cuadro (5, 6, 8, 9)");
					System.out.print(" 5. Quinto cuadro (7, 8, 10, 11)");
					System.out.print(" 6. Sexto cuadro (8, 9, 11, 12)");
					System.out.println(" 7. Séptimo cuadro (10, 11, 13, 14)");
					System.out.print("8. Octavo cuadro (11, 12, 14, 15)");
					System.out.print(" 9. Noveno cuadro (13, 14, 16, 17)");
					System.out.print(" 10. Décimo cuadro (14, 15, 17, 18)");
					System.out.print(" 11. Undécimo cuadro (16, 17, 19, 20)");
					System.out.print(" 12. Duodécimo cuadro (17, 18, 20, 21)");
					System.out.print(" 13. Decimotercer cuadro (19, 20, 22, 23)");
					System.out.println(" 14. Decimocuarto cuadro (20, 21, 23, 24)");
					System.out.print("15. Decimoquinto cuadro (22, 23, 25, 26)");
					System.out.print(" 16. Decimosexto cuadro (23, 24, 26, 27)");
					System.out.print(" 17. Decimoséptimo cuadro (25, 26, 28, 29)");
					System.out.print(" 18. Decimoctavo cuadro (26, 27, 29, 30)");
					System.out.print(" 19. Decimonoveno cuadro (28, 29, 31, 32)");
					System.out.print(" 20. Vigésimo cuadro (29, 30, 32, 33)");
					System.out.print(" 21. Vigésimo primer cuadro (31, 32, 34, 35)");
					System.out.println(" 22. Vigésimo segundo cuadro (32, 33, 35, 36)");
					System.out.print("Respuesta: ");
					respuesta = reader.nextInt();
				} while (respuesta < 1 || respuesta > 22);
				switch (respuesta) {
				case 1:
					int[] primerCuadro = { 1, 2, 4, 5 };
					multiplicador = apuesta(primerCuadro, multiplicador);
					break;
				case 2:
					int[] segundoCuadro = { 2, 3, 5, 6 };
					multiplicador = apuesta(segundoCuadro, multiplicador);
					break;
				case 3:
					int[] tercerCuadro = { 4, 5, 7, 8 };
					multiplicador = apuesta(tercerCuadro, multiplicador);
					break;
				case 4:
					int[] cuartoCuadro = { 5, 6, 8, 9 };
					multiplicador = apuesta(cuartoCuadro, multiplicador);
					break;
				case 5:
					int[] quintoCuadro = { 7, 8, 10, 11 };
					multiplicador = apuesta(quintoCuadro, multiplicador);
					break;
				case 6:
					int[] sextoCuadro = { 8, 9, 11, 12 };
					multiplicador = apuesta(sextoCuadro, multiplicador);
					break;
				case 7:
					int[] septimoCuadro = { 10, 11, 13, 14 };
					multiplicador = apuesta(septimoCuadro, multiplicador);
					break;
				case 8:
					int[] octavoCuadro = { 11, 12, 14, 15 };
					multiplicador = apuesta(octavoCuadro, multiplicador);
					break;
				case 9:
					int[] novenoCuadro = { 13, 14, 16, 17 };
					multiplicador = apuesta(novenoCuadro, multiplicador);
					break;
				case 10:
					int[] decimoCuadro = { 14, 15, 17, 18 };
					multiplicador = apuesta(decimoCuadro, multiplicador);
					break;
				case 11:
					int[] undecimoCuadro = { 16, 17, 19, 20 };
					multiplicador = apuesta(undecimoCuadro, multiplicador);
					break;
				case 12:
					int[] duodecimoCuadro = { 17, 18, 20, 21 };
					multiplicador = apuesta(duodecimoCuadro, multiplicador);
					break;
				case 13:
					int[] decimotercerCuadro = { 19, 20, 22, 23 };
					multiplicador = apuesta(decimotercerCuadro, multiplicador);
					break;
				case 14:
					int[] decimocuartoCuadro = { 20, 21, 23, 24 };
					multiplicador = apuesta(decimocuartoCuadro, multiplicador);
					break;
				case 15:
					int[] decimoquintoCuadro = { 22, 23, 25, 26 };
					multiplicador = apuesta(decimoquintoCuadro, multiplicador);
					break;
				case 16:
					int[] decimosextoCuadro = { 23, 24, 26, 27 };
					multiplicador = apuesta(decimosextoCuadro, multiplicador);
					break;
				case 17:
					int[] decimoseptimoCuadro = { 25, 26, 28, 29 };
					multiplicador = apuesta(decimoseptimoCuadro, multiplicador);
					break;
				case 18:
					int[] decimooctavoCuadro = { 26, 27, 29, 30 };
					multiplicador = apuesta(decimooctavoCuadro, multiplicador);
					break;
				case 19:
					int[] decimonovenoCuadro = { 28, 29, 31, 32 };
					multiplicador = apuesta(decimonovenoCuadro, multiplicador);
					break;
				case 20:
					int[] vigesimoCuadro = { 29, 30, 32, 33 };
					multiplicador = apuesta(vigesimoCuadro, multiplicador);
					break;
				case 21:
					int[] vigesimoprimeroCuadro = { 31, 32, 34, 35 };
					multiplicador = apuesta(vigesimoprimeroCuadro, multiplicador);
					break;
				case 22:
					int[] vigesimosegundoCuadro = { 32, 33, 35, 36 };
					multiplicador = apuesta(vigesimosegundoCuadro, multiplicador);
					break;
				}
				break;
			case 11:
				do {
					multiplicador = 18;
					System.out.print("1.Transversal 1 (0, 1, 2)");
					System.out.print(" 2.Transversal 2 (0, 2, 3)");
					System.out.print(" 3.Transversal 3 (1, 2, 3)");
					System.out.print(" 4.Transversal 4 (4, 5, 6)");
					System.out.print(" 5.Transversal 5 (7, 8, 9)");
					System.out.print(" 6.Transversal 6 (10, 11, 12)");
					System.out.println(" 7.Transversal 7 (13, 14, 15)");
					System.out.print("8.Transversal 8 (16, 17, 18)");
					System.out.print(" 9.Transversal 9 (19, 20, 21)");
					System.out.print(" 10.Transversal 10 (22, 23, 24)");
					System.out.print(" 11.Transversal 11 (25, 26, 27)");
					System.out.print(" 12.Transversal 12 (28, 29, 30)");
					System.out.print(" 13.Transversal 13 (31, 32, 33)");
					System.out.println(" 14.Transversal 14 (34, 35, 36)");
					System.out.print("Respuesta: ");
					respuesta = reader.nextInt();
				} while (respuesta < 1 || respuesta > 14);
				switch (respuesta) {
				case 1:
					int[] transversal1 = { 0, 1, 2 };
					multiplicador = apuesta(transversal1, multiplicador);
					break;
				case 2:
					int[] transversal2 = { 0, 2, 3 };
					multiplicador = apuesta(transversal2, multiplicador);
					break;
				case 3:
					int[] transversal3 = { 1, 2, 3 };
					multiplicador = apuesta(transversal3, multiplicador);
					break;
				case 4:
					int[] transversal4 = { 4, 5, 6 };
					multiplicador = apuesta(transversal4, multiplicador);
					break;
				case 5:
					int[] transversal5 = { 7, 8, 9 };
					multiplicador = apuesta(transversal5, multiplicador);
					break;
				case 6:
					int[] transversal6 = { 10, 11, 12 };
					multiplicador = apuesta(transversal6, multiplicador);
					break;
				case 7:
					int[] transversal7 = { 13, 14, 15 };
					multiplicador = apuesta(transversal7, multiplicador);
					break;
				case 8:
					int[] transversal8 = { 16, 17, 18 };
					multiplicador = apuesta(transversal8, multiplicador);
					break;
				case 9:
					int[] transversal9 = { 19, 20, 21 };
					multiplicador = apuesta(transversal9, multiplicador);
					break;
				case 10:
					int[] transversal10 = {22, 23, 24 };
					multiplicador = apuesta(transversal10, multiplicador);
					break;
				case 11:
					int[] transversal11 = { 25, 26, 27 };
					multiplicador = apuesta(transversal11, multiplicador);
					break;
				case 12:
					int[] transversal12 = { 28, 29, 30 };
					multiplicador = apuesta(transversal12, multiplicador);
					break;
				case 13:
					int[] transversal13 = { 31, 32, 33 };
					multiplicador = apuesta(transversal13, multiplicador);
					break;
				case 14:
					int[] transversal14 = { 34, 35, 36 };
					multiplicador = apuesta(transversal14, multiplicador);
					break;
				}
				break;
			case 12:
				do {
					multiplicador = 18;
					System.out.print("1.Caballo1 (0, 1)");
					System.out.print(" 2.Caballo2 (0, 2)");
					System.out.print(" 3.Caballo3 (0, 3)");
					System.out.print(" 4.Caballo4 (1, 2)");
					System.out.print(" 5.Caballo5 (1, 4)");
					System.out.print(" 6.Caballo6 (2, 3)");
					System.out.print(" 7.Caballo7 (2, 5)");
					System.out.print(" 8.Caballo8 (3, 6)");
					System.out.print(" 9.Caballo9 (4, 5)");
					System.out.println(" 10.Caballo10 (4, 7)");
					System.out.print("11.Caballo11 (5, 6)");
					System.out.print(" 12.Caballo12 (5, 8)");
					System.out.print(" 13.Caballo13 (6, 9)");
					System.out.print(" 14.Caballo14 (7, 8)");
					System.out.print(" 15.Caballo15 (7, 10)");
					System.out.print(" 16.Caballo16 (8, 9)");
					System.out.print(" 17.Caballo17 (8, 11)");
					System.out.print(" 18.Caballo18 (9, 12)");
					System.out.print(" 19.Caballo19 (10, 11)");
					System.out.println(" 20.Caballo20 (10, 13)");
					System.out.print("21.Caballo21 (11, 12)");
					System.out.print(" 22.Caballo22 (11, 14)");
					System.out.print(" 23.Caballo23 (12, 15)");
					System.out.print(" 24.Caballo24 (13, 14)");
					System.out.print(" 25.Caballo25 (13, 16)");
					System.out.print(" 26.Caballo26 (14, 15)");
					System.out.print(" 27.Caballo27 (14, 17)");
					System.out.print(" 28.Caballo28 (15, 18)");
					System.out.print(" 29.Caballo29 (16, 17)");
					System.out.println(" 30.Caballo30 (16, 19)");
					System.out.print("31.Caballo31 (17, 18)");
					System.out.print(" 32.Caballo32 (17, 20)");
					System.out.print(" 33.Caballo33 (18, 21)");
					System.out.print(" 34.Caballo34 (19, 20)");
					System.out.print(" 35.Caballo35 (19, 22)");
					System.out.print(" 36.Caballo36 (20, 21)");
					System.out.print(" 37.Caballo37 (20, 23)");
					System.out.print(" 38.Caballo38 (21, 24)");
					System.out.print(" 39.Caballo39 (22, 23)");
					System.out.println(" 40.Caballo40 (22, 25)");
					System.out.print("41.Caballo41 (23, 24)");
					System.out.print(" 42.Caballo42 (23, 26)");
					System.out.print(" 43.Caballo43 (24, 27)");
					System.out.print(" 44.Caballo44 (25, 26)");
					System.out.print(" 45.Caballo45 (25, 28)");
					System.out.print(" 46.Caballo46 (26, 27)");
					System.out.print(" 47.Caballo47 (26, 29)");
					System.out.print(" 48.Caballo48 (27, 30)");
					System.out.print(" 49.Caballo49 (28, 29)");
					System.out.println(" 50.Caballo50 (28, 31)");
					System.out.print("51.Caballo51 (29, 30)");
					System.out.print(" 52.Caballo52 (29, 32)");
					System.out.print(" 53.Caballo53 (30, 33)");
					System.out.print(" 54.Caballo54 (31, 32)");
					System.out.print(" 55.Caballo55 (31, 34)");
					System.out.print(" 56.Caballo56 (32, 33)");
					System.out.print(" 57.Caballo57 (32, 35)");
					System.out.print(" 58.Caballo58 (33, 36)");
					System.out.print(" 59.Caballo59 (34, 35)");
					System.out.println(" 60.Caballo60 (35, 36)");
					System.out.print("Respuesta : ");
					respuesta = reader.nextInt();
				} while (respuesta < 1 || respuesta > 60);
				switch (respuesta) {
				case 1:
					int[] caballo1 = { 0, 1 };
					multiplicador = apuesta(caballo1, multiplicador);
					break;
				case 2:
					int[] caballo2 = { 0, 2 };
					multiplicador = apuesta(caballo2, multiplicador);
					break;
				case 3:
					int[] caballo3 = { 0, 3 };
					multiplicador = apuesta(caballo3, multiplicador);
					break;
				case 4:
					int[] caballo4 = { 1, 2 };
					multiplicador = apuesta(caballo4, multiplicador);
					break;
				case 5:
					int[] caballo5 = { 1, 4 };
					multiplicador = apuesta(caballo5, multiplicador);
					break;
				case 6:
					int[] caballo6 = { 2, 3 };
					multiplicador = apuesta(caballo6, multiplicador);
					break;
				case 7:
					int[] caballo7 = { 2, 5 };
					multiplicador = apuesta(caballo7, multiplicador);
					break;
				case 8:
					int[] caballo8 = { 3, 6 };
					multiplicador = apuesta(caballo8, multiplicador);
					break;
				case 9:
					int[] caballo9 = { 4, 5 };
					multiplicador = apuesta(caballo9, multiplicador);
					break;
				case 10:
					int[] caballo10 = { 4, 7 };
					multiplicador = apuesta(caballo10, multiplicador);
					break;
				case 11:
					int[] caballo11 = { 5, 6 };
					multiplicador = apuesta(caballo11, multiplicador);
					break;
				case 12:
					int[] caballo12 = { 5, 8 };
					multiplicador = apuesta(caballo12, multiplicador);
					break;
				case 13:
					int[] caballo13 = { 6, 9 };
					multiplicador = apuesta(caballo13, multiplicador);
					break;
				case 14:
					int[] caballo14 = { 7, 8 };
					multiplicador = apuesta(caballo14, multiplicador);
					break;
				case 15:
					int[] caballo15 = { 7, 10 };
					multiplicador = apuesta(caballo15, multiplicador);
					break;
				case 16:
					int[] caballo16 = { 8, 9 };
					multiplicador = apuesta(caballo16, multiplicador);
					break;
				case 17:
					int[] caballo17 = { 8, 11 };
					multiplicador = apuesta(caballo17, multiplicador);
					break;
				case 18:
					int[] caballo18 = { 9, 12 };
					multiplicador = apuesta(caballo18, multiplicador);
					break;
				case 19:
					int[] caballo19 = { 10, 11 };
					multiplicador = apuesta(caballo19, multiplicador);
					break;
				case 20:
					int[] caballo20 = { 10, 13 };
					multiplicador = apuesta(caballo20, multiplicador);
					break;
				case 21:
					int[] caballo21 = { 11, 12 };
					multiplicador = apuesta(caballo21, multiplicador);
					break;
				case 22:
					int[] caballo22 = { 11, 14 };
					multiplicador = apuesta(caballo22, multiplicador);
					break;
				case 23:
					int[] caballo23 = { 12, 15 };
					multiplicador = apuesta(caballo23, multiplicador);
					break;
				case 24:
					int[] caballo24 = { 13, 14 };
					multiplicador = apuesta(caballo24, multiplicador);
					break;
				case 25:
					int[] caballo25 = { 13, 16 };
					multiplicador = apuesta(caballo25, multiplicador);
					break;
				case 26:
					int[] caballo26 = { 14, 15 };
					multiplicador = apuesta(caballo26, multiplicador);
					break;
				case 27:
					int[] caballo27 = { 14, 17 };
					multiplicador = apuesta(caballo27, multiplicador);
					break;
				case 28:
					int[] caballo28 = { 15, 18 };
					multiplicador = apuesta(caballo28, multiplicador);
					break;
				case 29:
					int[] caballo29 = { 16, 17 };
					multiplicador = apuesta(caballo29, multiplicador);
					break;
				case 30:
					int[] caballo30 = { 16, 19 };
					multiplicador = apuesta(caballo30, multiplicador);
					break;
				case 31:
					int[] caballo31 = { 17, 18 };
					multiplicador = apuesta(caballo31, multiplicador);
					break;
				case 32:
					int[] caballo32 = { 17, 20 };
					multiplicador = apuesta(caballo32, multiplicador);
					break;
				case 33:
					int[] caballo33 = { 18, 21 };
					multiplicador = apuesta(caballo33, multiplicador);
					break;
				case 34:
					int[] caballo34 = { 19, 20 };
					multiplicador = apuesta(caballo34, multiplicador);
					break;
				case 35:
					int[] caballo35 = { 19, 22 };
					multiplicador = apuesta(caballo35, multiplicador);
					break;
				case 36:
					int[] caballo36 = { 20, 21 };
					multiplicador = apuesta(caballo36, multiplicador);
					break;
				case 37:
					int[] caballo37 = { 20, 23 };
					multiplicador = apuesta(caballo37, multiplicador);
					break;
				case 38:
					int[] caballo38 = { 21, 24 };
					multiplicador = apuesta(caballo38, multiplicador);
					break;
				case 39:
					int[] caballo39 = { 22, 23 };
					multiplicador = apuesta(caballo39, multiplicador);
					break;
				case 40:
					int[] caballo40 = { 22, 25 };
					multiplicador = apuesta(caballo40, multiplicador);
					break;
				case 41:
					int[] caballo41 = { 23, 24 };
					multiplicador = apuesta(caballo41, multiplicador);
					break;
				case 42:
					int[] caballo42 = { 23, 26 };
					multiplicador = apuesta(caballo42, multiplicador);
					break;
				case 43:
					int[] caballo43 = { 24, 27 };
					multiplicador = apuesta(caballo43, multiplicador);
					break;
				case 44:
					int[] caballo44 = { 25, 26 };
					multiplicador = apuesta(caballo44, multiplicador);
					break;
				case 45:
					int[] caballo45 = { 25, 28 };
					multiplicador = apuesta(caballo45, multiplicador);
					break;
				case 46:
					int[] caballo46 = { 26, 27 };
					multiplicador = apuesta(caballo46, multiplicador);
					break;
				case 47:
					int[] caballo47 = { 26, 29 };
					multiplicador = apuesta(caballo47, multiplicador);
					break;
				case 48:
					int[] caballo48 = { 27, 30 };
					multiplicador = apuesta(caballo48, multiplicador);
					break;
				case 49:
					int[] caballo49 = { 28, 29 };
					multiplicador = apuesta(caballo49, multiplicador);
					break;
				case 50:
					int[] caballo50 = { 28, 31 };
					multiplicador = apuesta(caballo50, multiplicador);
					break;
				case 51:
					int[] caballo51 = { 29, 30 };
					multiplicador = apuesta(caballo51, multiplicador);
					break;
				case 52:
					int[] caballo52 = { 29, 32 };
					multiplicador = apuesta(caballo52, multiplicador);
					break;
				case 53:
					int[] caballo53 = { 30, 33 };
					multiplicador = apuesta(caballo53, multiplicador);
					break;
				case 54:
					int[] caballo54 = { 31, 32 };
					multiplicador = apuesta(caballo54, multiplicador);
					break;
				case 55:
					int[] caballo55 = { 31, 34 };
					multiplicador = apuesta(caballo55, multiplicador);
					break;
				case 56:
					int[] caballo56 = { 32, 33 };
					multiplicador = apuesta(caballo56, multiplicador);
					break;
				case 57:
					int[] caballo57 = { 32, 35 };
					multiplicador = apuesta(caballo57, multiplicador);
					break;
				case 58:
					int[] caballo58 = { 33, 36 };
					multiplicador = apuesta(caballo58, multiplicador);
					break;
				case 59:
					int[] caballo59 = { 34, 35 };
					multiplicador = apuesta(caballo59, multiplicador);
					break;
				case 60:
					int[] caballo60 = { 35, 36 };
					multiplicador = apuesta(caballo60, multiplicador);
					break;
				}
				break;
			case 0:
				salir = true;
				break;
			default:
			}
			ficha = fichas(multiplicador, ficha, jugada);

			if (salir2 == false) {
				salir = comprobar(ficha);
			}

		} while (salir != true);
		System.out.println("Has sacado " + ficha + " fichas.");
		reader.close();
	}

	public static int ganador() {
		double numeroGanador = Math.random() * 37;
		int numeroGanador2 = (int) numeroGanador;
		return numeroGanador2;
	}

	public static double apuesta(int apuesta, double multiplicador) {
		int numeroganador = ganador();
		if (apuesta == numeroganador) {
			System.out.println("Has ganado " + numeroganador);
		} else {
			System.out.println("Has perdido " + numeroganador);
			multiplicador = 1;
		}
		return multiplicador;
	}

	public static double apuesta(int[] apuesta, double multiplicador) {
		int numeroganador = ganador();
		boolean win = false;
		for (int i = 0; i < apuesta.length; i++) {
			if (numeroganador == apuesta[i]) {
				System.out.println("Has ganado " + numeroganador);
				win = true;
			}

		}
		if (win == false) {
			System.out.println("Has perdido " + numeroganador);
			multiplicador = 1;
		}
		return multiplicador;
	}

	public static double fichas(double multiplicador, double ficha, double jugada) {
		if (multiplicador == 1) {
			ficha = ficha - jugada;
		} else {
			jugada = (jugada * multiplicador) - jugada;
			ficha += jugada;
		}
		return ficha;
	}

	public static boolean comprobar(double ficha) {

		if (ficha > 100) {
			System.out.println("Estas ganando mucho vete.");
			return true;
		} else if (ficha <= 0) {
			System.out.println("Te has quedado sin fichas pasa por el cajero.");
			return true;
		}
		return false;
	}

}
