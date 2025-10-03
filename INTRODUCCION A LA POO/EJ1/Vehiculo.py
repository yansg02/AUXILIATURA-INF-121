class Vehiculo:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.velocidadActual = 0
    
    def acelerar(self, incremento=10):
        self.velocidadActual += incremento
        return self.velocidadActual
    
    def frenar(self, decremento=10):
        self.velocidadActual = max(0, self.velocidadActual - decremento)
        return self.velocidadActual
    
    def __str__(self):
        return f"{self.marca} {self.modelo} - Velocidad: {self.velocidadActual} km/h"

# Simulación de carrera
auto1 = Vehiculo("Toyota", "Corolla")
auto2 = Vehiculo("Ford", "Mustang")

print("=== CARRERA ===")
for i in range(3):
    print(f"\n--- Vuelta {i+1} ---")
    auto1.acelerar(15)
    auto2.acelerar(20)
    print(f"Auto 1: {auto1}")
    print(f"Auto 2: {auto2}")

print(f"\n--- Frenando ---")
auto1.frenar(25)
auto2.frenar(30)
print(f"Auto 1: {auto1}")
print(f"Auto 2: {auto2}")
