import java.util.Stack;

public class EjStack {
	Stack<Alumno> alumnos = new Stack<>();
	private int totalDeAlumnos = 0;

	public void agrega(Alumno alumno) {
		// recibe a un alumno
		alumnos.push(alumno);
	}

	public void agrega(int posicion, Alumno alumno) {
		// agrega al Alumno en la posición indicada
		if (alumnos.get(posicion - 1) != null) {
			for (int i = alumnos.size() - 1; i > posicion - 1; i--) {
				if (alumnos.get(i) != null) {
					alumnos.add(i + 1, (alumnos.get(i)));
				} else {

				}
			}
		} else {
			alumnos.add(posicion - 1, alumno);
		}
		alumnos.add(posicion - 1, alumno);
	}

	public Alumno obten(int posicion) {
		// recibe una posición y devuelve al alumno
		if (alumnos.get(posicion - 1) != null) {
			return alumnos.get(posicion - 1);
		} else {
			return null;
		}
	}

	public void elimina(int posicion) {
		// elimina por la posición
		alumnos.remove(posicion - 1);
	}

	public boolean contiene(Alumno alumnoC) {
		// averigua si el estudiante está en la lista
		for (Alumno alumno : alumnos) {
			if (alumno == alumnoC) {
				return true;
			}
		}
		return false;
	}

	public int tamano() {
		// devuelve la cantidad de alumnos
		for (Alumno alumno : alumnos) {
			if (alumno != null) {
				totalDeAlumnos++;
			}
		}
		return totalDeAlumnos;
	}

	public String toString() {
		// facilitará en la impresión
		System.out.println(alumnos.toString());
		return null;
	}
}
