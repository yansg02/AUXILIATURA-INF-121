class Procesador {
    String marca;
    String modelo;
    int nucleos;
    String velocidad;
    
    Procesador(String marca, String modelo, int nucleos, String velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.nucleos = nucleos;
        this.velocidad = velocidad;
    }
}

class RAM {
    String marca;
    int capacidad;
    String frecuencia;
    
    RAM(String marca, int capacidad, String frecuencia) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.frecuencia = frecuencia;
    }
}

class DiscoDuro {
    String marca;
    int capacidad;
    String tipo;
    
    DiscoDuro(String marca, int capacidad, String tipo) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }
}

class Computadora {
    String marca;
    String modelo;
    Procesador procesador;
    RAM ram;
    DiscoDuro discoDuro;
    
    Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = new Procesador("Intel", "i7-12700K", 12, "3.6GHz");
        this.ram = new RAM("Corsair", 32, "3200MHz");
        this.discoDuro = new DiscoDuro("Samsung", 1000, "SSD NVMe");
    }
    
    void descripcion() {
        System.out.println("Computadora: " + this.marca + " " + this.modelo);
        System.out.println("Procesador: " + this.procesador.marca + " " + this.procesador.modelo + 
                          " - " + this.procesador.nucleos + " núcleos - " + this.procesador.velocidad);
        System.out.println("RAM: " + this.ram.marca + " - " + this.ram.capacidad + "GB - " + this.ram.frecuencia);
        System.out.println("Disco Duro: " + this.discoDuro.marca + " - " + this.discoDuro.capacidad + 
                          "GB - " + this.discoDuro.tipo);
    }
}

public class Main {
    public static void main(String[] args) {
        Computadora miPc = new Computadora("Dell", "XPS 15");
        miPc.descripcion();
    }
}