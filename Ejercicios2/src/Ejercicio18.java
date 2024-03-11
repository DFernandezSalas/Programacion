import java.util.Scanner;

public class Ejercicio18 {
	//Buscador de Subcadenas
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe el texto en el que quieres buscar:");
        String frase = scanner.nextLine();

        System.out.print("¿Que palabra quieres buscar?");
        String subcadena = scanner.nextLine();
        
        int contador = 0;
        int indice = frase.indexOf(subcadena);

        while (indice != -1) {
            contador++;
            indice = frase.indexOf(subcadena, indice + 1);
        }
        
        if (contador > 0) {
            System.out.println("La subcadena '" + subcadena + "' aparece " + contador + " veces en la cadena principal.");
        } else {
            System.out.println("La subcadena '" + subcadena + "' no se encontró en la cadena principal.");
        }

        scanner.close();

	}

}
