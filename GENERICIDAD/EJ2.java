public class Par<A, B> {
    private A primero;
    private B segundo;
    
    public Par(A primero, B segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }
    
    public void mostrar() {
        System.out.println("Primero: " + primero + ", Segundo: " + segundo);
    }
    
    public A getPrimero() {
        return primero;
    }
    
    public B getSegundo() {
        return segundo;
    }
    
    public void setPrimero(A primero) {
        this.primero = primero;
    }
    
    public void setSegundo(B segundo) {
        this.segundo = segundo;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Par<String, Integer> (nombre, edad) ===");
        Par<String, Integer> persona = new Par<>("Juan Pérez", 25);
        persona.mostrar();
        
        System.out.println("\n=== Par<Integer, Boolean> ===");
        Par<Integer, Boolean> estado = new Par<>(101, true);
        estado.mostrar();
        
        persona.setSegundo(26);
        System.out.print("Persona actualizada: ");
        persona.mostrar();
        
        String nombre = persona.getPrimero();
        Integer edad = persona.getSegundo();
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}