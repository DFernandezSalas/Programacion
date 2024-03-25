
public class PruebaFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector lista = new Vector();

		// Agregar alumnos
		long tiempoAgregaVector = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			Alumno a1 = new Alumno("Alumno" + i);
			lista.agrega(a1);
		}
		long tiempoAgregaVector2 = System.currentTimeMillis();
		System.out.println(
				"Tiempo de ejecucion de agregar en Vector es " + (tiempoAgregaVector2 - tiempoAgregaVector) / 1000.0);

		long tiempoAgregaPosicionVector = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			Alumno a1 = new Alumno("Alumno" + i);
			lista.agrega(3, a1);
		}
		long tiempoAgregaPosicionVector2 = System.currentTimeMillis();
		System.out.println("Tiempo de ejecucion de agregar por possicion en Vector es "
				+ (tiempoAgregaPosicionVector2 - tiempoAgregaPosicionVector) / 1000.0);
		
		long tiempoObtenVector = System.currentTimeMillis();
		for (int i = 1; i < 10000; i++) {
			lista.obten(i);
			
		}
		long tiempoObtennVector2 = System.currentTimeMillis();
		System.out.println("Tiempo de ejecucion de obten en Vector es "
				+ (tiempoObtennVector2 - tiempoObtenVector) / 1000.0);
		
		long tiempoEliminaVector = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			
			lista.elimina(i);
			
		}
		long tiempoEliminaVector2 = System.currentTimeMillis();
		System.out.println("Tiempo de ejecucion de elimina en Vector es "
				+ (tiempoEliminaVector2 - tiempoEliminaVector) / 1000.0);
		
		long tiempoContieneVector = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			Alumno a1 = new Alumno("Alumno" + i);
			lista.contiene(a1);
			
		}
		long tiempoContieneVector2 = System.currentTimeMillis();
		System.out.println("Tiempo de ejecucion de contiene en Vector es "
				+ (tiempoContieneVector2 - tiempoContieneVector) / 1000.0);
	}

}
