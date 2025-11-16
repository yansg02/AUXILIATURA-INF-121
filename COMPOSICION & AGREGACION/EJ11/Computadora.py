class Procesador:
    def __init__(self, marca, modelo, nucleos, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.nucleos = nucleos
        self.velocidad = velocidad

class RAM:
    def __init__(self, marca, capacidad, frecuencia):
        self.marca = marca
        self.capacidad = capacidad
        self.frecuencia = frecuencia

class DiscoDuro:
    def __init__(self, marca, capacidad, tipo):
        self.marca = marca
        self.capacidad = capacidad
        self.tipo = tipo

class Computadora:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.procesador = Procesador("Intel", "i7-12700K", 12, "3.6GHz")
        self.ram = RAM("Corsair", 32, "3200MHz")
        self.disco_duro = DiscoDuro("Samsung", 1000, "SSD NVMe")
    
    def descripcion(self):
        print(f"Computadora: {self.marca} {self.modelo}")
        print(f"Procesador: {self.procesador.marca} {self.procesador.modelo} - {self.procesador.nucleos} núcleos - {self.procesador.velocidad}")
        print(f"RAM: {self.ram.marca} - {self.ram.capacidad}GB - {self.ram.frecuencia}")
        print(f"Disco Duro: {self.disco_duro.marca} - {self.disco_duro.capacidad}GB - {self.disco_duro.tipo}")

mi_pc = Computadora("Dell", "XPS 15")
mi_pc.descripcion()