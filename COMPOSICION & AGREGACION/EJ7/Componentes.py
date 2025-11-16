class Componente:
    def __init__(self, nombre, precio, marca):
        self.nombre = nombre
        self.precio = precio
        self.marca = marca

class Procesador(Componente):
    def __init__(self, nombre, precio, marca, nucleos, velocidad):
        super().__init__(nombre, precio, marca)
        self.nucleos = nucleos
        self.velocidad = velocidad

class RAM(Componente):
    def __init__(self, nombre, precio, marca, capacidad, frecuencia):
        super().__init__(nombre, precio, marca)
        self.capacidad = capacidad
        self.frecuencia = frecuencia

class Almacenamiento(Componente):
    def __init__(self, nombre, precio, marca, capacidad, tipo):
        super().__init__(nombre, precio, marca)
        self.capacidad = capacidad
        self.tipo = tipo

class Computadora:
    def __init__(self, modelo, precio, procesador, ram, almacenamiento):
        self.modelo = modelo
        self.precio = precio
        self.procesador = procesador
        self.ram = ram
        self.almacenamiento = almacenamiento

class Cliente:
    def __init__(self, nombre, email, telefono):
        self.nombre = nombre
        self.email = email
        self.telefono = telefono

class Venta:
    def __init__(self, cliente, computadora, fecha, cantidad):
        self.cliente = cliente
        self.computadora = computadora
        self.fecha = fecha
        self.cantidad = cantidad

procesador1 = Procesador("Intel i7", 350, "Intel", 8, "4.2GHz")
ram1 = RAM("DDR4", 120, "Corsair", 16, "3200MHz")
almacenamiento1 = Almacenamiento("SSD", 80, "Samsung", 512, "NVMe")

computadora1 = Computadora("Gaming Pro", 1500, procesador1, ram1, almacenamiento1)

cliente1 = Cliente("Juan Pérez", "juan@email.com", "123456789")

venta1 = Venta(cliente1, computadora1, "2024-01-15", 1)

print("Venta realizada:")
print(f"Cliente: {venta1.cliente.nombre}")
print(f"Computadora: {venta1.computadora.modelo}")
print(f"Precio: ${venta1.computadora.precio}")
print(f"Procesador: {venta1.computadora.procesador.nombre}")
print(f"RAM: {venta1.computadora.ram.capacidad}GB")
print(f"Almacenamiento: {venta1.computadora.almacenamiento.capacidad}GB {venta1.computadora.almacenamiento.tipo}")