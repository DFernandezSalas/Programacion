import javax.swing.JOptionPane;

public class Ejercicio17 {
	// Simulador de Cajero Automático
	public static void main(String[] args) {
		double dinero = 1000;
		int res = 0;
		while (res != 3) {
			
		
		String opcion = JOptionPane.showInputDialog("¿Que operacion deseas realizar? \n Tienes" + dinero
				+ "€ \n 1.Retirar dinero \n 2.Ingresar dinero \n 3.Salir");
		res = Integer.parseInt(opcion);
		switch (res) {
		case 1: {
			String operacion = JOptionPane.showInputDialog("¿Cuanto dinero quieres retirar?");
			double ope = Double.parseDouble(operacion);
			if (ope < dinero) {
				dinero = dinero - ope;
				JOptionPane.showMessageDialog(null, "Has retirado " + ope + "€ \n Nuevo saldo: " + dinero + "€");
			} else {
				JOptionPane.showMessageDialog(null, "No ha sido posible realizar la operacion por falta de saldo.");
			}
			break;
		}
		case 2: {
			String operacion = JOptionPane.showInputDialog("¿Cuanto dinero quieres ingresar?");
			double ope = Double.parseDouble(operacion);
			dinero = dinero + ope;
			JOptionPane.showInternalMessageDialog(null, "Has ingresado " + ope + "€ \n Nuevo saldo: " + dinero + "€");
			break;
		}
		case 3: {
			JOptionPane.showMessageDialog(null, "Hasta pronto");
			break;
		}

		}
		}
	}
}
