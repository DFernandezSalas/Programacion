public class ColaPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno a1 = new Alumno("Luis");
		Alumno a2 = new Alumno("Jose");
		Alumno a3 = new Alumno("Pepe");
		Alumno a4 = new Alumno("David");
		
		Cola ej = new Cola();
		ej.agrega(a1);
		ej.agrega(a2);
		ej.agrega(a3);
		System.out.println(ej.toString());
		System.out.println(ej.contiene(a4));
		System.out.println(ej.contiene(a2));
		System.out.println(ej.tamano());
	}

}
