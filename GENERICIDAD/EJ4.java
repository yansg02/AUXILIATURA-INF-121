public class Fraccion<T extends Number> {
    private T numerador;
    private T denominador;
    
    public Fraccion(T numerador, T denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public void mostrar() {
        System.out.println("Fracción: " + numerador + "/" + denominador);
    }
    
    public double valorDecimal() {
        return numerador.doubleValue() / denominador.doubleValue();
    }
    
    public Fraccion<Integer> simplificar() {
        int num = numerador.intValue();
        int den = denominador.intValue();
        
        int mcd = calcularMCD(num, den);
        
        num = num / mcd;
        den = den / mcd;
        
        return new Fraccion<>(num, den);
    }
    
    private int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Fraccion<Integer> ===");
        Fraccion<Integer> f1 = new Fraccion<>(8, 12);
        f1.mostrar();
        System.out.println("Valor decimal: " + f1.valorDecimal());
        
        Fraccion<Integer> f1Simplificada = f1.simplificar();
        System.out.println("Después de simplificar:");
        f1Simplificada.mostrar();
        System.out.println("Valor decimal: " + f1Simplificada.valorDecimal());
        
        System.out.println("\n=== Fraccion<Long> ===");
        Fraccion<Long> f2 = new Fraccion<>(15L, 9L);
        f2.mostrar();
        System.out.println("Valor decimal: " + f2.valorDecimal());
        
        System.out.println("\n=== Más ejemplos ===");
        Fraccion<Integer> f3 = new Fraccion<>(100, 50);
        f3.mostrar();
        System.out.println("Valor decimal: " + f3.valorDecimal());
        
        Fraccion<Integer> f3Simplificada = f3.simplificar();
        System.out.println("Simplificada:");
        f3Simplificada.mostrar();
        System.out.println("Valor decimal: " + f3Simplificada.valorDecimal());
    }
}