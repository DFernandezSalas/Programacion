import javax.swing.JOptionPane;

public class Ejercicio20 {
	// Generador de Contraseñas Aleatorias: Genera contraseñas seguras de manera
	// aleatoria.
	public static void main(String[] args) {
		String longContraseña = JOptionPane.showInputDialog("¿De que longitud quieres la contraseña?");
		int longitud = Integer.parseInt(longContraseña);
		char[] contraseña = new char[longitud];
		String pass = "";

		for (int i = 0; i < longitud; i++) {
			char caracter = caracterAleatorio();
			contraseña[i] = caracter;
		}
		
		for (int i = 0; i < longitud; i++) {
			pass += Character.toString(contraseña[i]);
		}
		JOptionPane.showMessageDialog(null, pass);

	}
	
	public static char caracterAleatorio() {
		double eleccion = Math.random() * 4;
		int elec = (int) eleccion;
		
		if (elec == 0) {
			char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
			double aleatorio = Math.random() * 11;
			int ale = (int) aleatorio;
			return numeros[ale];
		} else if (elec == 1) {
			char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
			double aleatorio = Math.random() * 27;
			int ale = (int) aleatorio;
			return letras[ale];
		} else if (elec == 2) {
			char[] letrasMayus = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
			double aleatorio = Math.random() * 27;
			int ale = (int) aleatorio;
			return letrasMayus[ale];
		} else if (elec == 3) {
			char[] letrasMayus = {'!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '`', '~'};
			double aleatorio = Math.random() * 25;
			int ale = (int) aleatorio;
			return letrasMayus[ale];
		} else {
			return ' ';
		}
	}

}
