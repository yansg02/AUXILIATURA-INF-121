public class CI<T> {
    private T identificacion;
    private boolean tieneComplemento;
    
    public CI(T identificacion) {
        this.identificacion = identificacion;
        this.tieneComplemento = false;
    }
    
    public CI(T identificacion, boolean tieneComplemento) {
        this.identificacion = identificacion;
        this.tieneComplemento = tieneComplemento;
    }
    
    public T getIdentificacion() {
        return identificacion;
    }
    
    public boolean tieneComplemento() {
        return tieneComplemento;
    }
    
    public void mostrar() {
        if (tieneComplemento) {
            System.out.println("CI con complemento: " + identificacion);
        } else {
            System.out.println("CI único: " + identificacion);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== PERSONAS CON CI ÚNICO ===");
        CI<Integer> persona1 = new CI<>(1234567);
        CI<Integer> persona2 = new CI<>(7654321);
        
        persona1.mostrar();
        persona2.mostrar();
        
        System.out.println("\n=== PERSONAS CON CI DUPLICADO ===");
        CI<String> persona3 = new CI<>("1234567-A", true);
        CI<String> persona4 = new CI<>("1234567-B", true);
        CI<String> persona5 = new CI<>("7654321-X", true);
        
        persona3.mostrar();
        persona4.mostrar();
        persona5.mostrar();
        
        System.out.println("\n=== SISTEMA DE REGISTRO ===");
        CI<?>[] registros = new CI<?>[10];
        
        registros[0] = new CI<>(1111111);
        registros[1] = new CI<>(2222222);
        registros[2] = new CI<>("1111111-A", true);
        registros[3] = new CI<>(3333333);
        registros[4] = new CI<>("2222222-B", true);
        
        int totalPersonas = 5;
        int unicos = 0;
        int conComplemento = 0;
        
        System.out.println("\n--- LISTA DE TODOS LOS REGISTROS ---");
        for (int i = 0; i < totalPersonas; i++) {
            registros[i].mostrar();
            
            if (registros[i] instanceof CI) {
                CI<?> ci = registros[i];
                if (ci.tieneComplemento()) {
                    conComplemento++;
                } else {
                    unicos++;
                }
            }
        }
        
        System.out.println("\n=== ESTADÍSTICAS ===");
        System.out.println("Total personas: " + totalPersonas);
        System.out.println("CIs únicos: " + unicos);
        System.out.println("CIs con complemento: " + conComplemento);
        
        System.out.println("\n=== VERIFICANDO DUPLICADOS ===");
        verificarDuplicado(registros[0]);  // CI unico
        verificarDuplicado(registros[2]);  // CI con complemento
    }
    
    public static void verificarDuplicado(CI<?> ci) {
        if (ci.tieneComplemento()) {
            System.out.println("ALERTA: Este CI tiene complemento por duplicado");
        } else {
            System.out.println("OK: CI único sin duplicados");
        }
    }
}