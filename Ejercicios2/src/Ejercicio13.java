
import javax.swing.JOptionPane;

public class Ejercicio13 {
	// contador de digitos
	public static void main(String[] args) {

		String numero = JOptionPane.showInputDialog("Introduce un numero para contar sus digitos.");
		int nDigitos = numero.length();
		System.out.println("Su numero tiene " + nDigitos + " digitos.");
	}

}
