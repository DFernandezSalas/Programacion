import java.util.Stack;

public class HistorialNavegacion {

    public static void main(String[] args) {
        // Creamos una pila para representar el historial de navegación
        Stack<String> historialNavegacion = new Stack<>();

        // Simulamos la navegación
        navegar(historialNavegacion, "Inicio");
        navegar(historialNavegacion, "Página 1");
        navegar(historialNavegacion, "Página 2");

        // Mostramos el historial actual
        mostrarHistorial(historialNavegacion);

        // Retrocedemos una página
        retroceder(historialNavegacion);

        // Mostramos el historial después de retroceder
        mostrarHistorial(historialNavegacion);
    }

    // Método para simular la navegación y agregar páginas al historial
    private static void navegar(Stack<String> historial, String pagina) {
        historial.push(pagina);
        System.out.println("Navegando a: " + pagina);
    }

    // Método para retroceder en el historial
    private static void retroceder(Stack<String> historial) {
        if (!historial.isEmpty()) {
            String paginaAnterior = historial.pop();
            System.out.println("Retrocediendo a: " + paginaAnterior);
        } else {
            System.out.println("El historial está vacío. No se puede retroceder.");
        }
    }

    // Método para mostrar el historial actual
    private static void mostrarHistorial(Stack<String> historial) {
        System.out.println("\nHistorial de navegación:");
        for (String pagina : historial) {
            System.out.println(pagina);
        }
    }
}

