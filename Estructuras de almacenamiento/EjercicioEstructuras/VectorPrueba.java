public class VectorPrueba {

    public static void main(String[] args) {
    	Alumno a1 = new Alumno("Luis");
        Alumno a2 = new Alumno("Jose");
        Alumno a3 = new Alumno("Pepe");
        Alumno a4 = new Alumno("David");

        Vector lista = new Vector();

        lista.agrega(a1);
        lista.agrega(a2);
        System.out.println( lista.toString());
        lista.agrega(2, a3);
        System.out.println( lista.toString());
        System.out.println(lista.obten(4));
        lista.elimina(2);
        System.out.println(lista.contiene(a4));
        System.out.println(lista);
        System.out.println(lista.tamano());
        System.out.println( lista.toString());
    }
}