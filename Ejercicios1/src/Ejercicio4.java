import java.util.Scanner;

public class Ejercicio4 {
	// Escribe un programa que verifique si una palabra o frase es
	// un palíndromo (se lee igual de izquierda a derecha que de derecha a
	// izquierda).
	public static void main(String[] args) {

		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Escribe una palabra para ver si es un palindromo.");
			String palabra = reader.next();
			System.out.println(palabra);
			String stringInvertido = "";
			int contador = 0;
			for(int indice = palabra.length() - 1;indice <= 0; indice--) {
				
				stringInvertido += palabra.charAt(contador);
				contador++;
			}
			
			if(palabra == stringInvertido) {
				System.out.println("La palabra " + palabra + " es un palindromo.");
			} else {
				System.out.println("La palabra " + palabra + " no es un palindromo.");
			}
			
			System.out.println(stringInvertido);
			System.out.println(palabra);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
