import java.util.ArrayList;

class Libro {
    String titulo;
    String edicion;
    String autor;
    
    Libro(String titulo, String edicion, String autor) {
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }
}

class Estante {
    String material;
    String tamaño;
    int capacidadMaxima;
    ArrayList<Libro> libros;
    
    Estante(String material, String tamaño, int capacidadMaxima) {
        this.material = material;
        this.tamaño = tamaño;
        this.capacidadMaxima = capacidadMaxima;
        this.libros = new ArrayList<>();
    }
    
    void agregarLibro(Libro libro) {
        if (libros.size() < capacidadMaxima) {
            libros.add(libro);
        }
    }
    
    void eliminarLibro(String titulo) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).titulo.equals(titulo)) {
                libros.remove(i);
                break;
            }
        }
    }
    
    void mostrarLibrosAutor(String autor) {
        System.out.println("Libros de " + autor + ":");
        for (Libro libro : libros) {
            if (libro.autor.equals(autor)) {
                System.out.println("- " + libro.titulo + " (" + libro.edicion + ")");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Estante estante = new Estante("Madera", "Grande", 10);
        
        estante.agregarLibro(new Libro("Cien años de soledad", "1ra", "Gabriel García Márquez"));
        estante.agregarLibro(new Libro("El amor en los tiempos del cólera", "2da", "Gabriel García Márquez"));
        estante.agregarLibro(new Libro("1984", "3ra", "George Orwell"));
        estante.agregarLibro(new Libro("Rebelión en la granja", "1ra", "George Orwell"));
        
        estante.mostrarLibrosAutor("Gabriel García Márquez");
        
        estante.eliminarLibro("1984");
        
        estante.mostrarLibrosAutor("George Orwell");
    }
}