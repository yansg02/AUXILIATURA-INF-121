public class Coordenada<T extends Number> {
    private T x;
    private T y;
    
    public Coordenada(T x, T y) {
        this.x = x;
        this.y = y;
    }
    
    public double distanciaOrigen() {
        double xVal = x.doubleValue();
        double yVal = y.doubleValue();
        return Math.sqrt(xVal * xVal + yVal * yVal);
    }
    
    public static <T extends Number> void comparaDistancia(Coordenada<T> c1, Coordenada<T> c2) {
        double d1 = c1.distanciaOrigen();
        double d2 = c2.distanciaOrigen();
        
        System.out.println("Coordenada 1 distancia: " + d1);
        System.out.println("Coordenada 2 distancia: " + d2);
        
        if (d1 > d2) {
            System.out.println("Coordenada 1 está más lejos del origen");
        } else if (d2 > d1) {
            System.out.println("Coordenada 2 está más lejos del origen");
        } else {
            System.out.println("Ambas están a la misma distancia");
        }
    }
    
    public Coordenada<Double> sumar(Coordenada<T> otra) {
        double nuevoX = this.x.doubleValue() + otra.x.doubleValue();
        double nuevoY = this.y.doubleValue() + otra.y.doubleValue();
        return new Coordenada<>(nuevoX, nuevoY);
    }
    
    public void mostrar() {
        System.out.println("Coordenada: (" + x + ", " + y + ")");
    }
    
    public static void main(String[] args) {
        Coordenada<Integer> c1 = new Coordenada<>(3, 4);
        Coordenada<Double> c2 = new Coordenada<>(5.5, 2.2);
        
        System.out.println("=== Coordenadas creadas ===");
        c1.mostrar();
        c2.mostrar();
        
        System.out.println("\n=== Distancias al origen ===");
        System.out.println("C1 distancia: " + c1.distanciaOrigen());
        System.out.println("C2 distancia: " + c2.distanciaOrigen());
        
        System.out.println("\n=== Comparar distancias ===");
        comparaDistancia(c1, c2);
        
        System.out.println("\n=== Sumar coordenadas ===");
        Coordenada<Double> c3 = c1.sumar(c2);
        System.out.print("C1 + C2 = ");
        c3.mostrar();
        
        Coordenada<Integer> c4 = new Coordenada<>(10, 20);
        Coordenada<Integer> c5 = new Coordenada<>(5, 3);
        
        System.out.println("\n=== Más ejemplos ===");
        Coordenada<Double> suma2 = c4.sumar(c5);
        c4.mostrar();
        c5.mostrar();
        System.out.print("Suma: ");
        suma2.mostrar();
    }
}