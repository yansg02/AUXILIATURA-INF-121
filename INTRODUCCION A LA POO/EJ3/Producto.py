class Producto:
    def __init__(self, nombre, precio, stock):
        self.nombre = nombre
        self.precio = precio
        self.stock = stock
    
    def vender(self, cantidad):
        if cantidad <= self.stock:
            self.stock -= cantidad
            return f"Vendidos {cantidad} {self.nombre}. Stock restante: {self.stock}"
        else:
            return f"Stock insuficiente. Solo hay {self.stock} {self.nombre}"
    
    def reabastecer(self, cantidad):
        self.stock += cantidad
        return f"Reabastecidos {cantidad} {self.nombre}. Stock total: {self.stock}"
    
    def __str__(self):
        return f"Producto: {self.nombre} - Precio: Bs. {self.precio:.2f} - Stock: {self.stock}"

# Ejemplo de uso
producto = Producto("Laptop", 2500.00, 10)
print(producto)
print(producto.vender(3))
print(producto.reabastecer(5))
print(producto.vender(15))