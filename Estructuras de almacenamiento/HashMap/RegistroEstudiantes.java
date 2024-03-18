import java.util.HashMap;

public class RegistroEstudiantes {

    public static void main(String[] args) {
        // Creamos un HashMap para almacenar información de estudiantes y calificaciones
        HashMap<String, HashMap<String, Double>> registroEstudiantes = new HashMap<>();

        // Añadimos algunos estudiantes y sus calificaciones
        agregarEstudiante(registroEstudiantes, "Juan", "Matemáticas", 90.5);
        agregarEstudiante(registroEstudiantes, "María", "Historia", 85.0);
        agregarEstudiante(registroEstudiantes, "Carlos", "Inglés", 92.5);

        // Mostramos la información de los estudiantes y sus calificaciones
        System.out.println("Registro de estudiantes:");
        for (String estudiante : registroEstudiantes.keySet()) {
            System.out.println(estudiante + ": " + registroEstudiantes.get(estudiante));
        }
    }

    // Método para agregar estudiantes y calificaciones al HashMap
    private static void agregarEstudiante(HashMap<String, HashMap<String, Double>> registro, String nombre, String asignatura, double calificacion) {
        // Verificamos si el estudiante ya está en el registro
        if (!registro.containsKey(nombre)) {
            // Si no está, creamos un nuevo HashMap para las calificaciones del estudiante
            registro.put(nombre, new HashMap<>());
        }

        // Añadimos la calificación a la asignatura correspondiente del estudiante
        registro.get(nombre).put(asignatura, calificacion);
    }
}
