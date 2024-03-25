import java.util.HashSet;

public class EjHashSet {
	HashSet<Alumno> alumnos = new HashSet<>();
	private int totalDeAlumnos = 0;
	
	public void agrega(Alumno alumno) {
		// recibe a un alumno
		alumnos.add(alumno);
	}

	public void agrega(int posicion, Alumno alumno) {
		// agrega al Alumno en la posición indicada
	}

//	public Alumno obten(int posicion) {
//		// recibe una posición y devuelve al alumno
//	}

	public void elimina(int posicion) {
		// elimina por la posición
	}

	public boolean contiene(Alumno alumno) {
		// averigua si el estudiante está en la lista
		if (alumnos.contains(alumno)) {
			return true;
		} else {
			return false;
		}
	}

	public int tamano() {
		// devuelve la cantidad de alumnos
		totalDeAlumnos = alumnos.size();
		return totalDeAlumnos;
	}

	public String toString() {
		// facilitará en la impresión
		return alumnos.toString();
	}
}
