import java.util.HashSet;

public class ConjuntoEstudiantes {

    public static void main(String[] args) {
        // Creamos un HashSet para almacenar nombres de estudiantes únicos
        HashSet<String> conjuntoEstudiantes = new HashSet<>();

        // Añadimos algunos nombres de estudiantes al conjunto
        agregarEstudiante(conjuntoEstudiantes, "Juan");
        agregarEstudiante(conjuntoEstudiantes, "María");
        agregarEstudiante(conjuntoEstudiantes, "Carlos");
        agregarEstudiante(conjuntoEstudiantes, "Juan"); // Intentamos añadir el mismo nombre nuevamente

        // Mostramos la información del conjunto de estudiantes
        System.out.println("Estudiantes en el conjunto:");
        for (String estudiante : conjuntoEstudiantes) {
            System.out.println(estudiante);
        }
    }

    // Método para agregar estudiantes al conjunto
    private static void agregarEstudiante(HashSet<String> conjunto, String nombre) {
        // Añadimos el nombre al conjunto
        if (conjunto.add(nombre)) {
            System.out.println("Se añadió a " + nombre + " al conjunto.");
        } else {
            System.out.println(nombre + " ya está en el conjunto. No se añadió.");
        }
    }
}
