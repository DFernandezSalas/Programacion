import java.util.HashMap;

public class EjHashMap {
	HashMap<Integer, Alumno> alumnos = new HashMap<>();
	private int totalDeAlumnos = 0;
	
	public void agrega(Alumno alumno) {
		// recibe a un alumno
		alumnos.put(totalDeAlumnos++, alumno);
	}

	public void agrega(int posicion, Alumno alumno) {
		// agrega al Alumno en la posición indicada
	}

	public Alumno obten(int posicion) {
		// recibe una posición y devuelve al alumno

		return alumnos.get(posicion);
	}

	public void elimina(int posicion) {
		// elimina por la posición
		alumnos.remove(posicion);
	}

	public boolean contiene(Alumno alumno) {
		// averigua si el estudiante está en la lista
		if (alumnos.containsValue(alumno)) {
			return true;
		} else {
			return false;
		}
	}

	public int tamano() {
		// devuelve la cantidad de alumnos
		return alumnos.size();
	}

	public String toString() {
		// facilitará en la impresión
		return alumnos.toString();
	}
}
