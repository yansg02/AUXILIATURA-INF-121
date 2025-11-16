class Bateria:
    def __init__(self, amperaje, material):
        self.amperaje = amperaje
        self.material = material

class DiscoDuro:
    def __init__(self, tipo, cantidadMemoria):
        self.tipo = tipo
        self.cantidadMemoria = cantidadMemoria

class Celular:
    def __init__(self, marca, modelo, bateria):
        self.marca = marca
        self.modelo = modelo
        self.bateria = bateria

class Laptop:
    def __init__(self, microprocesador, cantRam, discoDuro, bateria):
        self.microprocesador = microprocesador
        self.cantRam = cantRam
        self.discoDuro = discoDuro
        self.bateria = bateria

bateria1 = Bateria(4000, "Litio")
bateria2 = Bateria(5000, "Polímero")
bateria3 = Bateria(3000, "Ion-Litio")

disco1 = DiscoDuro("SSD", 512)
disco2 = DiscoDuro("HDD", 1000)
disco3 = DiscoDuro("NVMe", 256)

laptop1 = Laptop("Intel i5", 8, disco1, bateria1)
laptop2 = Laptop("AMD Ryzen 7", 16, disco2, bateria2)
laptop3 = Laptop("Intel i7", 32, disco3, bateria3)

celular1 = Celular("Samsung", "Galaxy S21", bateria1)
celular2 = Celular("Apple", "iPhone 13", bateria2)

laptops = [laptop1, laptop2, laptop3]

for i, laptop in enumerate(laptops, 1):
    print(f"Laptop {i}:")
    print(f"Microprocesador: {laptop.microprocesador}")
    print(f"RAM: {laptop.cantRam}GB")
    print(f"Disco Duro: {laptop.discoDuro.tipo} - {laptop.discoDuro.cantidadMemoria}GB")
    print(f"Batería: {laptop.bateria.amperaje}mAh - {laptop.bateria.material}")
    print()