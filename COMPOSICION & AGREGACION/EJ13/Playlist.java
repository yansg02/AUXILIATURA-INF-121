class Cancion {
    String titulo;
    String artista;
    int duracionSegundos;
    
    Cancion(String titulo, String artista, int duracionSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
    }
}

class Playlist {
    String nombre;
    int numeroCanciones;
    java.util.ArrayList<Cancion> canciones;
    
    Playlist(String nombre) {
        this.nombre = nombre;
        this.numeroCanciones = 0;
        this.canciones = new java.util.ArrayList<>();
    }
    
    void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
        numeroCanciones++;
    }
    
    void mostrarInfo() {
        System.out.println("Playlist: " + nombre);
        System.out.println("Número de canciones: " + numeroCanciones);
        System.out.println("Canciones:");
        for (Cancion cancion : canciones) {
            System.out.println("- " + cancion.titulo + " - " + cancion.artista + " (" + cancion.duracionSegundos + " segundos)");
        }
    }
    
    void calcularDuracionTotal() {
        int totalSegundos = 0;
        for (Cancion cancion : canciones) {
            totalSegundos += cancion.duracionSegundos;
        }
        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;
        System.out.println("Duración total: " + minutos + " minutos y " + segundos + " segundos");
    }
    
    void buscarPorArtista(String artista) {
        System.out.println("Canciones de " + artista + ":");
        for (Cancion cancion : canciones) {
            if (cancion.artista.equalsIgnoreCase(artista)) {
                System.out.println("- " + cancion.titulo + " (" + cancion.duracionSegundos + " segundos)");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Playlist miPlaylist = new Playlist("Mis Favoritas");
        
        miPlaylist.agregarCancion(new Cancion("Bohemian Rhapsody", "Queen", 354));
        miPlaylist.agregarCancion(new Cancion("Imagine", "John Lennon", 183));
        miPlaylist.agregarCancion(new Cancion("Hotel California", "Eagles", 391));
        miPlaylist.agregarCancion(new Cancion("We Will Rock You", "Queen", 122));
        
        miPlaylist.mostrarInfo();
        System.out.println();
        miPlaylist.calcularDuracionTotal();
        System.out.println();
        miPlaylist.buscarPorArtista("Queen");
    }
}