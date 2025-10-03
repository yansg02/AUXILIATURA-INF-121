class Bus:
    def __init__(self, capacidad_total = 50):
        self.capacidad_total = capacidad_total
        self.pasajeros_actuales = 0
        self.recaudacion = 0.0
        self.costo_pasaje = 1.50

    def subir_pasajeros(self, cantidad):
        asientos_disponibles = slef.capacidad_total - self.pasajeros_actuales
        if cantidad <= asientos_disponibles:
            self.pasajeros_actuales += cantidad
            return f"subieron {cantidad} pasajeros"
        else:
            return f"solo subieron {asientos_disponibles} pasajeros(bus lleno)"
        
    def cobrar_pasaje(self, cantidad_pasajes):
        total = cantidad_pasajes * self.costo_pasaje
        self.recaudacion += total
        return total
    
    def asientos_disponibles(self):
        return self.capacidad_total - self.pasajeros_actuales
    
    def __str__(self):
        return f"Bus {self.pasajeros_actuales}/{self.capacidad_total} pasajeros - Bs {self.recaudacion: 2f} recaudados"

# Uso de la clase Bus
bus = Bus(40)
print(bus.subir_pasajeros(15))
print(f"Se cobró: Bs. {bus.cobrar_pasaje(15):.2f}")
print(f"Asientos disponibles: {bus.asientos_disponibles()}")
print(bus.subir_pasajeros(30))
print(f"Se cobró: Bs. {bus.cobrar_pasaje(25):.2f}")  # Solo 25 asientos disponibles
print(bus) 