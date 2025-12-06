public class Caja<T> {
    private T contenido;
    
    public Caja() {
        this.contenido = null;
    }
    
    public void guardar(T contenido) {
        this.contenido = contenido;
        System.out.println("Contenido guardado: " + contenido);
    }
    
    public T obtener() {
        System.out.println("Obteniendo contenido: " + contenido);
        return contenido;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Prueba con Caja<Integer> ===");
        Caja<Integer> cajaInt = new Caja<>();
        cajaInt.guardar(42);
        Integer valorInt = cajaInt.obtener();
        System.out.println("Valor obtenido: " + valorInt);
        
        System.out.println("\n=== Prueba con Caja<String> ===");
        Caja<String> cajaString = new Caja<>();
        cajaString.guardar("Hola Mundo");
        String valorString = cajaString.obtener();
        System.out.println("Valor obtenido: " + valorString);
    }
}