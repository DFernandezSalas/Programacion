import java.util.Arrays;

public class Vector {
	private Alumno[] alumnos = new Alumno[100000000];
	private int totalDeAlumnos = 0;

	public void agrega(Alumno alumno) {
		// recibe a un alumno
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alumno;
				i = alumnos.length;
			}
		}
	}

	public void agrega(int posicion, Alumno alumno) {
		// agrega al Alumno en la posición indicada
		if (this.alumnos[posicion - 1] != null) {
			for (int i = alumnos.length - 1; i >= posicion - 1; i--) {
				if (this.alumnos[i] != null) {
					alumnos[i + 1] = alumnos[i];
				} else {

				}
			}
		} else {
			this.alumnos[posicion - 1] = alumno;
		}
		this.alumnos[posicion - 1] = alumno;
	}

	public Alumno obten(int posicion) {
		// recibe una posición y devuelve al alumno
		if (alumnos[posicion - 1] != null) {
			return alumnos[posicion - 1];
		} else {
			return null;
		}
	}

	public void elimina(int posicion) {
		// elimina por la posición
		alumnos[posicion] = null;
	}

	public boolean contiene(Alumno alumno) {
		// averigua si el estudiante está en la lista
		for (int i = 0; i < 100; i++) {
			if (alumnos[i] == alumno) {
				return true;
			}
		}
		return false;
	}

	public int tamano() {
		// devuelve la cantidad de alumnos
		for (int i = 0; i < alumnos.length; i++) {
			if (this.alumnos[i] != null) {
				totalDeAlumnos++;
			} else {

			}
		}
		return totalDeAlumnos;
	}

	public String toString() {
		// facilitará en la impresión
		return Arrays.toString(alumnos);
	}

}