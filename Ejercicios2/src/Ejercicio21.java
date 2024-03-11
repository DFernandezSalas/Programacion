import javax.swing.JOptionPane;

public class Ejercicio21 {
	//Conversor de Decimal a Binario
	public static void main(String[] args) {
		String numeroDecimal = JOptionPane.showInputDialog("¿Que numero quieres convertir a binario?");
		int nDecimal = Integer.parseInt(numeroDecimal);
		
		String nBinario = ""; // Cadena vacía para almacenar el número binario

        while (nDecimal > 0) {
            int n = nDecimal % 2; 
            nBinario = n + nBinario;
            nDecimal = nDecimal / 2; 
        }
        
        JOptionPane.showMessageDialog(null, nBinario);
	}

}
