import java.util.LinkedList;
import java.util.Queue;

public class ColaClientes {

    public static void main(String[] args) {
        // Creamos una cola para representar la fila de clientes
        Queue<Cliente> colaClientes = new LinkedList<>();

        // Añadimos algunos clientes a la cola
        agregarCliente(colaClientes, new Cliente("Juan"));
        agregarCliente(colaClientes, new Cliente("María"));
        agregarCliente(colaClientes, new Cliente("Carlos"));

        // Atendemos a los clientes en orden de llegada
        atenderClientes(colaClientes);
    }

    // Método para agregar clientes a la cola
    private static void agregarCliente(Queue<Cliente> cola, Cliente cliente) {
        cola.offer(cliente);
        System.out.println("Se ha agregado a " + cliente.getNombre() + " a la cola.");
    }

    // Método para atender a los clientes en orden de llegada
    private static void atenderClientes(Queue<Cliente> cola) {
        System.out.println("\nAtendiendo a los clientes en orden de llegada:");
        while (!cola.isEmpty()) {
            Cliente clienteActual = cola.poll();
            System.out.println("Atendiendo a " + clienteActual.getNombre());
        }
    }
}

// Clase para representar a un cliente
class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
