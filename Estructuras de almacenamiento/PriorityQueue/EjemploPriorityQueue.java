import java.util.PriorityQueue;

public class EjemploPriorityQueue {

    public static void main(String[] args) {
        // Crear una cola de prioridad de tareas (String) ordenadas por longitud
        PriorityQueue<String> colaPrioridadTareas = new PriorityQueue<>((s1, s2) -> s1.length() - s2.length());

        // Agregar tareas a la cola de prioridad
        agregarTarea(colaPrioridadTareas, "Tarea corta");
        agregarTarea(colaPrioridadTareas, "Tarea muy larga");
        agregarTarea(colaPrioridadTareas, "Tarea moderada");

        // Procesar las tareas en orden de prioridad
        procesarTareas(colaPrioridadTareas);
    }

    // Método para agregar tareas a la cola de prioridad
    private static void agregarTarea(PriorityQueue<String> colaPrioridad, String tarea) {
        colaPrioridad.offer(tarea);
        System.out.println("Se ha agregado la tarea: " + tarea);
    }

    // Método para procesar las tareas en orden de prioridad
    private static void procesarTareas(PriorityQueue<String> colaPrioridad) {
        System.out.println("\nProcesando tareas en orden de prioridad:");
        while (!colaPrioridad.isEmpty()) {
            String tareaActual = colaPrioridad.poll();
            System.out.println("Procesando tarea: " + tareaActual);
        }
    }
}
