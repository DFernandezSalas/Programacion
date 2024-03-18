import java.util.ArrayList;

public class Libreria {

    public static void main(String[] args) {
        // Creamos una lista para almacenar información sobre libros
        ArrayList<Libro> listaLibros = new ArrayList<>();

        // Añadimos algunos libros a la lista
        listaLibros.add(new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954));
        listaLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));

        // Mostramos la información de los libros en la lista
        System.out.println("Libros en la librería:");
        for (Libro libro : listaLibros) {
            System.out.println(libro.toString());
        }
    }
}

// Clase para representar un libro
class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                '}';
    }
}
