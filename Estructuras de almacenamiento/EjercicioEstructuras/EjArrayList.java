import java.util.ArrayList;

public class EjArrayList {
	
	private ArrayList<Alumno> alumnos = new ArrayList<>(); 
	private String alumno;
	
	public EjArrayList(String alumno) {
		this.alumno = alumno;
	}
	
	public void agrega(Alumno alumno) {
		// recibe a un alumno
		alumnos.add(new Alumno(alumno));
	}

	public void agrega(int posicion, Alumno alumno) {
		// agrega al Alumno en la posición indicada
	}

	public Alumno obten(int posicion) {
		// recibe una posición y devuelve al alumno
		return null;
	}

	public void elimina(int posicion) {
		// elimina por la posición
	}

	public boolean contiene(Alumno alumno) {
		// averigua si el estudiante está en la lista
		return false;
	}

	public int tamano() {
		// devuelve la cantidad de alumnos
		return 0;
	}

	public String toString() {
		// facilitará en la impresión
		return alumno + ", ";
	}
}
