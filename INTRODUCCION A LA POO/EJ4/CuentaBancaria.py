class CuentaBancaria:
    def __init__(self, titular, nroCuenta, saldo=0):
        self.titular = titular
        self.nroCuenta = nroCuenta
        self.saldo = saldo
    
    def depositar(self, monto):
        if monto <= 0:
            return "Error: El monto a depositar debe ser positivo"
        self.saldo += monto
        return f"Depositado Bs. {monto:.2f}. Saldo actual: Bs. {self.saldo:.2f}"
    
    def retirar(self, monto):
        if monto <= 0:
            return "Error: El monto a retirar debe ser positivo"
        if monto > self.saldo:
            return "Error: Saldo insuficiente"
        self.saldo -= monto
        return f"Retirado Bs. {monto:.2f}. Saldo actual: Bs. {self.saldo:.2f}"
    
    def mostrar_datos(self):
        return f"Titular: {self.titular}\nCuenta: {self.nroCuenta}\nSaldo: Bs. {self.saldo:.2f}"

# Ejemplo de uso
cuenta = CuentaBancaria("Juan Pérez", "123-456-789", 1000)
print(cuenta.mostrar_datos())
print(cuenta.depositar(500))
print(cuenta.retirar(200))
print(cuenta.retirar(2000))
print(cuenta.depositar(-100))