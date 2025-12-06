public class Diccionario<K, V> {
    private Par<K, V>[] pares;
    private int contador;
    
    public Diccionario() {
        this.pares = new Par[10];
        this.contador = 0;
    }
    
    public void insertar(K clave, V valor) {
        for (int i = 0; i < contador; i++) {
            if (pares[i].getPrimero().equals(clave)) {
                pares[i].setSegundo(valor);
                System.out.println("Clave actualizada: " + clave);
                return;
            }
        }
        
        if (contador >= pares.length) {
            Par<K, V>[] nuevo = new Par[pares.length * 2];
            System.arraycopy(pares, 0, nuevo, 0, pares.length);
            pares = nuevo;
        }
        
        pares[contador] = new Par<>(clave, valor);
        contador++;
        System.out.println("Clave insertada: " + clave + " -> " + valor);
    }
    
    public V obtener(K clave) {
        for (int i = 0; i < contador; i++) {
            if (pares[i].getPrimero().equals(clave)) {
                System.out.println("Encontrado: " + clave + " -> " + pares[i].getSegundo());
                return pares[i].getSegundo();
            }
        }
        System.out.println("Clave no encontrada: " + clave);
        return null;
    }
    
    public void eliminar(K clave) {
        for (int i = 0; i < contador; i++) {
            if (pares[i].getPrimero().equals(clave)) {
                for (int j = i; j < contador - 1; j++) {
                    pares[j] = pares[j + 1];
                }
                pares[contador - 1] = null;
                contador--;
                System.out.println("Clave eliminada: " + clave);
                return;
            }
        }
        System.out.println("Clave no encontrada para eliminar: " + clave);
    }
    
    public void mostrar() {
        System.out.println("\n=== DICCIONARIO ===");
        for (int i = 0; i < contador; i++) {
            System.out.println(pares[i].getPrimero() + " -> " + pares[i].getSegundo());
        }
        System.out.println("Total: " + contador + " elementos\n");
    }
    
    public static void main(String[] args) {
        Diccionario<String, Integer> edadPersonas = new Diccionario<>();
        
        edadPersonas.insertar("Juan", 25);
        edadPersonas.insertar("Ana", 30);
        edadPersonas.insertar("Pedro", 22);
        
        edadPersonas.mostrar();
        
        edadPersonas.obtener("Ana");
        edadPersonas.obtener("Maria");
        
        edadPersonas.insertar("Juan", 26);
        
        edadPersonas.eliminar("Pedro");
        
        edadPersonas.mostrar();
        
        Diccionario<Integer, String> codigoProductos = new Diccionario<>();
        codigoProductos.insertar(101, "Laptop");
        codigoProductos.insertar(102, "Mouse");
        codigoProductos.mostrar();
    }
}