
public class ArrayListPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno a1 = new Alumno("Luis");
		Alumno a2 = new Alumno("Jose");
		Alumno a3 = new Alumno("Pepe");
		Alumno a4 = new Alumno("David");
		
		EjArrayList ej = new EjArrayList();
		
		ej.agrega(a1);
		ej.agrega(a2);
		ej.toString();
		ej.agrega(2, a3);
		ej.toString();
		System.out.println(ej.obten(2));
		ej.elimina(2);
		System.out.println(ej.contiene(a4));
		ej.toString();
		System.out.println(ej.tamano());
		
	}

}
