import javax.swing.JOptionPane;

public class Ejercicio14 {
	//Contador de Vocales
	public static void main(String[] args) {
		
		int contador = 0;
		
		String frase = JOptionPane.showInputDialog("Introduce una frase para contar su numero de vocales.");
		String frase2 = frase.toLowerCase();
		
		for(int i = 0; i < frase2.length();i++) {
			
			if(frase2.charAt(i) == 'a' || frase2.charAt(i) == 'e' || frase2.charAt(i) == 'i' || frase2.charAt(i) == 'o' || frase2.charAt(i) == 'u' ) {
				contador++;
			}
		}
		
		System.out.println("El numero de vocales de su frase (" + frase + ") es " + contador + ".");
		

	}

}
